package com;

import java.util.ArrayList;
import java.util.List;

public class Service {

    static List<Car> cars=new ArrayList<>();

    public void add(Car car){
        cars.add(car);
    }

    public List<Car> getCars(){
        return cars;
    }

    public int getID(){
        return cars.size()+1;
    }
}
