package com.abstractfactory.impl;

import com.abstractfactory.interfaces.HouseAbstractFactory;
import com.abstractfactory.interfaces.RoofService;
import com.abstractfactory.interfaces.TypeService;
import com.abstractfactory.interfaces.WallService;

public class BrickHouseAbstractFactoryImpl implements HouseAbstractFactory {
    @Override
    public TypeService getTypeService() {
        return new BrickTypeServiceImpl();
    }

    @Override
    public WallService getWallService() {
        return new BrickWallServiceImpl();
    }

    @Override
    public RoofService getRoofService() {
        return new PitchedRoofServiceImpl();
    }
}
