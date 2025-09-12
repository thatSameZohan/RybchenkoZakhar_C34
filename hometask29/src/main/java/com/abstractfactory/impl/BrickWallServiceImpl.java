package com.abstractfactory.impl;

import com.abstractfactory.interfaces.WallService;

public class BrickWallServiceImpl implements WallService {
    @Override
    public String getWall() {
        return "Brick Wall";
    }
}
