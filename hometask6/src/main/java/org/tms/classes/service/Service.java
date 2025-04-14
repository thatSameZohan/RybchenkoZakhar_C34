package org.tms.classes.service;

import org.tms.classes.model.User;

public class Service {

    public int maxValue(int value1, int value2){
        if (value1>value2){
            return value1;
        }
        return value2;
    }

    public String print(User user){
        return user.getUsername();
    }

    public String print(int value){
        return "Value "+value;
    }
}
