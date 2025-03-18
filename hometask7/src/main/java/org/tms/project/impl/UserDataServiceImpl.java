package org.tms.project.impl;

import org.tms.project.domain.User;
import org.tms.project.interfaces.UserDataService;

public class UserDataServiceImpl implements UserDataService {

    @Override
    public void saveUser(User user) {
        System.out.println("Save user with name: " + user.getLogin());
    }
}
