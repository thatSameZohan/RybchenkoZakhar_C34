package com.abstractfactory.impl;

import com.abstractfactory.interfaces.RoofService;

public class PitchedRoofServiceImpl implements RoofService {
    @Override
    public String getRoof() {
        return "Pitched Roof";
    }
}
