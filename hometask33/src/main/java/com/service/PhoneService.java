package com.service;

import com.config.HibernateFactory;
import com.entity.PhoneEntity;
import org.hibernate.SessionFactory;

import java.util.UUID;

public class PhoneService {
    private static final SessionFactory factory = HibernateFactory
            .getSessionFactory();

    public PhoneEntity findById(UUID id) {
        var session = factory.openSession();
        var transaction = session.beginTransaction();

        var entity = session.find(PhoneEntity.class, id);
        transaction.commit();
        session.close();

        return entity;
    }
}
