package org.tms.project.impl;

import org.tms.project.domain.User;
import org.tms.project.interfaces.NotificationService;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Send email notification with text: " + message);
    }
}
