package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

import static java.lang.Integer.parseInt;

@WebServlet("/add")
public class HomeServlet extends HttpServlet {

    private Service service=new Service();

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String model=req.getParameter("model");

        int cost=parseInt(req.getParameter("cost"));

        int id=service.getID();

        Car car=new Car(id, model,cost);

        service.add(car);

        List<Car> cars = service.getCars();

        req.setAttribute("items", cars);

        req.getRequestDispatcher("/WEB-INF/list.jsp").forward(req,resp);

    }
}