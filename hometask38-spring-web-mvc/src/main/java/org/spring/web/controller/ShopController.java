package org.spring.web.controller;
import org.spring.web.dto.OrderDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.IOException;

@RequestMapping("/shop")
@Controller
public class ShopController {

    @PostMapping("/orders")
    public String successPage(OrderDto order){
        System.out.println(order);
        return "success";
    }

}
