package com.hitema.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public abstract class HibernateUtil {

    static Session currentSession;

    public static Session getCurrentSession() {
        if ( ! ( currentSession != null && currentSession.isOpen()))
            currentSession=openCurrentSession();
        return currentSession;
    }

    public static Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }
    private static SessionFactory getSessionFactory() {
        Configuration cfg = new Configuration().configure();
        return cfg.buildSessionFactory();
    }

}
