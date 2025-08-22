package com.abstractfactory.impl;

import com.abstractfactory.interfaces.WallService;

public class ConcreteWallServiceImpl implements WallService {
    @Override
    public String getWall() {
        return "Concrete Wall";
    }
}
