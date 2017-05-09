package com.hillel.webinar.hibernate;

import com.hillel.webinar.hibernate.database.SessionFactorySingleton;
import com.hillel.webinar.hibernate.database.dao.imp.StudentDaoImpl;
import com.hillel.webinar.hibernate.entity.Student;

/**
 *
 */
public class HibernateExample {
    private static  StudentDaoImpl studentDao = new StudentDaoImpl(SessionFactorySingleton.getSessionFactoryInstance());

    public static void main(String[] args) {

        Student student = new Student();
        student.setFirstName("Full");
        student.setLastName("Zhir");
        student.setAge(22);
        studentDao.save(student);

        Student studen2 =  studentDao.getById(2);
        System.out.println(studen2);
    }
}
