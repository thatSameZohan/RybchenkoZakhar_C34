package org.tms.project.impl;

import org.tms.project.domain.User;
import org.tms.project.interfaces.UserValidationService;

public class UserValidationServiceImpl implements UserValidationService {

    @Override
    public boolean isValid(User user) {

        if (user == null) {
            return false;
        }

        if (user.getLogin() == null) {
            return false;
        }

        if (user.getPassword() == null) {
            return false;
        }

        if (user.getAge()>100 || user.getAge()<0) {
            return false;
        }

        return true;
    }
}
