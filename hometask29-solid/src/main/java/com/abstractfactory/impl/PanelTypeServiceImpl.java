package com.abstractfactory.impl;

import com.abstractfactory.interfaces.TypeService;

public class PanelTypeServiceImpl implements TypeService {
    @Override
    public String getType() {
        return "Panel Type";
    }
}
