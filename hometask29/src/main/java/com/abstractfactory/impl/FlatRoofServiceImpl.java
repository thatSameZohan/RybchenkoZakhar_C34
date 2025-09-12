package com.abstractfactory.impl;

import com.abstractfactory.interfaces.RoofService;

public class FlatRoofServiceImpl implements RoofService {
    @Override
    public String getRoof() {
        return "Flat Roof";
    }
}
