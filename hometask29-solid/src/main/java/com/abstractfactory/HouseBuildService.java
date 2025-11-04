package com.abstractfactory;

import com.abstractfactory.interfaces.HouseAbstractFactory;

public class HouseBuildService {

    public House buildHouse(HouseAbstractFactory factory ) {
        return new House(factory.getTypeService().getType(),factory.getWallService().getWall(),factory.getRoofService().getRoof());
    }
}
