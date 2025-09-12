package com.abstractfactory.impl;

import com.abstractfactory.interfaces.TypeService;

public class BrickTypeServiceImpl implements TypeService {
    @Override
    public String getType() {
        return "Brick Type";
    }
}
