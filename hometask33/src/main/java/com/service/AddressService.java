package com.service;

import com.config.HibernateFactory;
import com.entity.AddressEntity;
import org.hibernate.SessionFactory;

import java.util.UUID;

public class AddressService {
    private static final SessionFactory factory = HibernateFactory
            .getSessionFactory();

    public AddressEntity findById(UUID id) {
        var session = factory.openSession();
        var transaction = session.beginTransaction();

        var entity = session.find(AddressEntity.class, id);
        transaction.commit();
        session.close();

        return entity;
    }
}
