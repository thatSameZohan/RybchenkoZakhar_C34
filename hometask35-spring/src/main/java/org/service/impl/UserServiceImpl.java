package org.service.impl;

import org.domain.User;
import org.service.NotificationService;
import org.service.UserService;

public class UserServiceImpl implements UserService {

    private final NotificationService notificationService;

    public UserServiceImpl(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void save(User user) {
        System.out.println("save user");
        notificationService.sendNotification("Anything");
    }

    public void init(){
        System.out.println("init method");
    }

    public void destroy(){
        System.out.println("destroy method");
    }
}
