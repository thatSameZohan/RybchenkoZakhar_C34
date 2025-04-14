package org.tms.project.impl;

import org.tms.project.domain.User;
import org.tms.project.interfaces.NotificationService;
import org.tms.project.interfaces.UserDataService;
import org.tms.project.interfaces.UserRegistrationHandler;
import org.tms.project.interfaces.UserValidationService;

public class UserRegistrationHandlerImpl implements UserRegistrationHandler {

    private UserValidationService validationService;
    private UserDataService dataService;
    private NotificationService notificationService;

    public UserRegistrationHandlerImpl(UserValidationService validationService,
                                       UserDataService dataService,
                                       NotificationService notificationService) {
        this.validationService = validationService;
        this.dataService = dataService;
        this.notificationService=notificationService;
    }

    @Override
    public void registerUser(User user) {
        var isValid = validationService.isValid(user);

        if (isValid) {
            dataService.saveUser(user);
        }

        notificationService.sendNotification(user, isValid ? "Welcome to our company": "Error registration");
    }
}
