package org.service.impl;

import org.service.NotificationService;

public class ViberNotificationImpl implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Send to Viber");
    }
}
