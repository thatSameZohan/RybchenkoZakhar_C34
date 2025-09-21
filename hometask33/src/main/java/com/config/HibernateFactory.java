package com.config;
import com.entity.AddressEntity;
import com.entity.CourierEntity;
import com.entity.OrderEntity;
import com.entity.PhoneEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Properties;

public class HibernateFactory {

    public static SessionFactory getSessionFactory() {

        Properties properties = new Properties();
        properties.put("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres");
        properties.put("hibernate.connection.username", "postgres");
        properties.put("hibernate.connection.password", "5784");
        properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");

        properties.put("hibernate.hbm2ddl.auto", "none");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.format_sql", "true");

        var configuration = new Configuration()
                .addAnnotatedClass(PhoneEntity.class)
                .addAnnotatedClass(CourierEntity.class)
                .addAnnotatedClass(OrderEntity.class)
                .addAnnotatedClass(AddressEntity.class)
                .addProperties(properties);

        return configuration
                .buildSessionFactory();
    }

}