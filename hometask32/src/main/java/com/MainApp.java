package com;

import com.entity.AddressEntity;
import com.entity.OrderEntity;
import com.service.OrderService;

import java.time.Instant;

public class MainApp {

    private static final OrderService service=new OrderService();

    public static void main(String[] args) {

        OrderEntity order=new OrderEntity(
                "POCO F7",
                OrderEntity.Type.PHONE,
                Instant.now(),
                new AddressEntity("Vitebsk","Mira","8b"),
                2000L,
                true);

        service.save(order);

        System.out.println(service.findById(order.getId()));

    }
}
