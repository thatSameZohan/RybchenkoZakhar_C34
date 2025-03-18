package org.tms.project.interfaces;

import org.tms.project.domain.User;

public interface NotificationService {

    void sendNotification(User user, String message);
}
