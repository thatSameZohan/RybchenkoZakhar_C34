package org.spring.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/shop")
@Controller
public class ShopController {

    @RequestMapping("/orders")
    public String ordersPage() {
        return "home";
    }

}
