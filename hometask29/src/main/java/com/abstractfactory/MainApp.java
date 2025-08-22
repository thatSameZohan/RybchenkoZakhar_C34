package com.abstractfactory;

import com.abstractfactory.impl.BrickHouseAbstractFactoryImpl;
import com.abstractfactory.impl.PanelHouseAbstractFactoryImpl;

public class MainApp {
    public static void main(String[] args) {

        House BrickHouse=new HouseBuildService().buildHouse(new BrickHouseAbstractFactoryImpl());

        House PanelHouse= new HouseBuildService().buildHouse(new PanelHouseAbstractFactoryImpl());

        System.out.println(BrickHouse);
        System.out.println(PanelHouse);



    }
}
