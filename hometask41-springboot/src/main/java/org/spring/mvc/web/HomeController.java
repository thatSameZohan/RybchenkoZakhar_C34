package org.spring.mvc.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBooleanProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.system.JavaVersion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@ConditionalOnJava(JavaVersion.TWENTY_THREE)
@ConditionalOnBooleanProperty(name = "app.user.printProperties")
public class HomeController {
    @Value("${app.user.defaultName}")
    private String defaultName;
    @Value("${app.user.defaultAge}")
    private Integer defaultAge;

    @GetMapping
    public String home(){
        System.out.println("Name is "+defaultName);
        System.out.println("Age= "+ defaultAge);
        return "home";
    }
}
