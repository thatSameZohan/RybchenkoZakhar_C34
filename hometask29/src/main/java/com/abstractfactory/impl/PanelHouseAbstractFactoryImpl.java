package com.abstractfactory.impl;

import com.abstractfactory.interfaces.HouseAbstractFactory;
import com.abstractfactory.interfaces.RoofService;
import com.abstractfactory.interfaces.TypeService;
import com.abstractfactory.interfaces.WallService;

public class PanelHouseAbstractFactoryImpl implements HouseAbstractFactory {
    @Override
    public TypeService getTypeService() {
        return new PanelTypeServiceImpl();
    }

    @Override
    public WallService getWallService() {
        return new ConcreteWallServiceImpl();
    }

    @Override
    public RoofService getRoofService() {
        return new FlatRoofServiceImpl();
    }
}
