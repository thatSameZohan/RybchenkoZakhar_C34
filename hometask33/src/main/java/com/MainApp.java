package com;

import com.entity.AddressEntity;
import com.entity.CourierEntity;
import com.entity.OrderEntity;
import com.entity.PhoneEntity;
import com.service.CourierService;
import com.service.OrderService;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainApp {

    private static final OrderService orderService = new OrderService();
    private static final CourierService courierService = new CourierService();

    public static void main(String[] args) {


//        AddressEntity address1 = new AddressEntity("vitebsk", "mira","8b");
//        PhoneEntity phone1=new PhoneEntity(12345678L);
//        PhoneEntity phone2=new PhoneEntity(98765432L);
//        CourierEntity courier1=new CourierEntity("James");
//        CourierEntity courier2=new CourierEntity("Vovan");
//        OrderEntity order1 = new OrderEntity("Samsung", OrderEntity.Type.PHONE, Instant.now(),2000L,true);
//        OrderEntity order2 = new OrderEntity("Xiaomi", OrderEntity.Type.TV, Instant.now(),2500L,false);
//
//
//        order1.setAddress(address1);
//        address1.setOrderEntity(order1);
//
//        order1.addPhone(phone1);
//        order1.addPhone(phone2);
//
//        order1.addCourier(courier1);
//        order1.addCourier(courier2);
//        order2.addCourier(courier2);
//
//        var saved1=orderService.save(order1);

        var order=orderService.findById(UUID.fromString("47b46115-a6fe-44fe-be45-c71e711c2575"));
        System.out.println(order);
        var courier=courierService.findById(UUID.fromString("3029a3ae-261c-4224-8595-a7771ec7fe6b"));
        System.out.println(courier);

    }
}
