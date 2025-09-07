package org;

import org.domain.User;
import org.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        User user = new User();

        ApplicationContext context = new ClassPathXmlApplicationContext("shop-service.xml");

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("shop-service.xml");
//        context.registerShutdownHook();

        var bean = context.getBean(UserService.class);

        bean.save(user);

    }
}
