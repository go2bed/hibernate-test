package com.hillel.webinar.hibernate;

import com.hillel.webinar.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 */
public class HibernateExample {

    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactorySingletone.getSessionFatoryInstance();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        Student student = new Student();
        student.setFirstName("Kvazer");
        student.setLastName("YY");
        student.setAge(33);

        session.save(student);

        transaction.commit();

        session.close();
        sessionFactory.close();
    }

}
