package org.spring.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/shop")
@Controller
public class ShopController {

    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public String ordersPage() {
        return "home";
    }

}
