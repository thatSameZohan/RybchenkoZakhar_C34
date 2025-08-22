package com.controller;

import com.domain.Route;
import com.service.RoutePersistenceService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import static java.lang.Integer.parseInt;

@WebServlet("/route")
public class RouteServlet extends HttpServlet {

    private final RoutePersistenceService service;

    public RouteServlet() {
        this.service = new RoutePersistenceService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");

        String body = req.getParameter("body");

        Integer length = parseInt(req.getParameter("length"));

        Route route=new Route(name,body,length,0);

        service.save(route);

        PrintWriter writer=resp.getWriter();
        writer.println("The route has been created");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Route> routes = service.getAll();

        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h3>Routes</h3>");
        writer.println("<ul>");

        for (Route item : routes) {
            writer.println("<li>"+item.getId() +" : "+ item.getName() + " : " + item.getBody() + " : "+ item.getLength()+ " km " + item.getLikes()+" likes"+"</li>");
        }

        writer.println("</ul>");
        writer.println("</body>");
        writer.println("</html>");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer id=parseInt(req.getParameter("id"));

        service.like(id);
    }
}
