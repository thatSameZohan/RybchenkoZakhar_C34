package com.service;

import com.config.HibernateFactory;
import com.entity.OrderEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.UUID;

public class OrderService {

    private static final SessionFactory factory = HibernateFactory.getSessionFactory();

    public OrderEntity save(OrderEntity orderEntity) {
        var session = factory.openSession();
        var transaction= session.beginTransaction();
        session.persist(orderEntity);
        transaction.commit();
        session.close();
        return orderEntity;
    }

    public OrderEntity findById(UUID id) {
        var session = factory.openSession();
        var transaction = session.beginTransaction();
        var orderEntity=session.find(OrderEntity.class, id);
        transaction.commit();
        session.close();
        return orderEntity;
    }
}
