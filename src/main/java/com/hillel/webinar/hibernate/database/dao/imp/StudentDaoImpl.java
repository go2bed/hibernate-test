package com.hillel.webinar.hibernate.database.dao.imp;

import com.hillel.webinar.hibernate.database.dao.Dao;
import com.hillel.webinar.hibernate.entity.Student;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.transaction.Transactional;
import java.util.List;

/**
 *
 */
@Transactional
public class StudentDaoImpl implements Dao<Student> {

    private SessionFactory sessionFactory;
    private Session session;

    public StudentDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * This method will check session at the closing
     * or null and will return new, or current instance of
     * session
     */
    private Session getCurrentSession() {
        try{
        if (!sessionFactory.getCurrentSession().isOpen() || session == null) {
           return session = sessionFactory.openSession();
        }
        return this.sessionFactory.getCurrentSession();
    } catch (org.hibernate.HibernateException he) {
           return session = sessionFactory.openSession();
    }
}

    @Override
    public List<Student> getFullList() {
        Session session = getCurrentSession();
        Query query = session.createQuery("from Student");
        List students = query.getResultList();
        return students;
    }

    @Override
    public void save(Student student) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Student getById(int id) {
        Session session = getCurrentSession();
        Student student = session.get(Student.class, id);
        Hibernate.initialize(student.getExams());
        session.close();
        return student;
    }
}
