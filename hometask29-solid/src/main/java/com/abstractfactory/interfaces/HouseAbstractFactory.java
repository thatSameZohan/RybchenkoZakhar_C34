package com.abstractfactory.interfaces;

public interface HouseAbstractFactory {

    TypeService getTypeService();

    WallService getWallService();

    RoofService getRoofService();

}
