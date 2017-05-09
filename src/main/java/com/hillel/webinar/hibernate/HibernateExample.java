package com.hillel.webinar.hibernate;

import com.hillel.webinar.hibernate.dao.imp.StudentDaoImpl;
import com.hillel.webinar.hibernate.entity.Student;

/**
 *
 */
public class HibernateExample {

    public static void main(String[] args) {
        StudentDaoImpl studentDao = new StudentDaoImpl();
        Student student = new Student();
        student.setFirstName("Full");
        student.setLastName("Zhir");
        student.setAge(22);
        studentDao.save(student);

        Student studen2 =  studentDao.getById(5);
        System.out.println(studen2);
    }
}
