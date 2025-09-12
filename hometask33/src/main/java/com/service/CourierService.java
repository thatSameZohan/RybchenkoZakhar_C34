package com.service;

import com.config.HibernateFactory;
import com.entity.CourierEntity;
import org.hibernate.SessionFactory;

import java.util.UUID;

public class CourierService {
    private static final SessionFactory factory = HibernateFactory
            .getSessionFactory();

    public CourierEntity findById(UUID id) {
        var session = factory.openSession();
        var transaction = session.beginTransaction();

        var entity = session.find(CourierEntity.class, id);
        transaction.commit();
        session.close();

        return entity;
    }
}
