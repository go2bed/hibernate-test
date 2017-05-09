package com.hillel.webinar.hibernate.database.dao.imp;

import com.hillel.webinar.hibernate.database.dao.Dao;
import com.hillel.webinar.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 *
 */
public class StudentDaoImpl implements Dao<Student> {

    private SessionFactory sessionFactory;

    public StudentDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Student> getFullList() {
        return null;
    }

    @Override
    public void save(Student student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Student getById(int id) {
        Session session = sessionFactory.openSession();
        Student student = session.get(Student.class, id);
        session.close();
        sessionFactory.close();
        return student;
    }
}
