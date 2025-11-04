package com;

import com.dto.SearchDto;
import com.entity.CarEntity;
import com.service.CarService;

public class MainApp {

    private static final CarService service = new CarService();

    public static void main(String[] args) {

//        CarEntity car = new CarEntity(CarEntity.Brand.FORD, 45000L,1000,2024);
//        service.save(car);
        SearchDto searchDto = new SearchDto(CarEntity.Brand.FORD,null,45000L,0,100000,2024);
        System.out.println(service.search(searchDto));


    }
}
