package com.hillel.webinar.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 */
public class SessionFactorySingletone {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFatoryInstance() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration()
                    .configure()
                    .buildSessionFactory();
        }
        return sessionFactory;
    }
}
