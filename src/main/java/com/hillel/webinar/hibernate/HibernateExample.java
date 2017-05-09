package com.hillel.webinar.hibernate;

import com.hillel.webinar.hibernate.database.SessionFactorySingleton;
import com.hillel.webinar.hibernate.database.dao.imp.StudentDaoImpl;
import com.hillel.webinar.hibernate.entity.Exam;
import com.hillel.webinar.hibernate.entity.Student;

import java.util.List;
import java.util.Set;

/**
 *
 */
public class HibernateExample {
    private static  StudentDaoImpl studentDao = new StudentDaoImpl(SessionFactorySingleton.getSessionFactoryInstance());

    public static void main(String[] args) {

//        Student student = new Student();
//        student.setFirstName("Full");
//        student.setLastName("Zhir");
//        student.setAge(22);
//        studentDao.save(student);

        List<Student> students = studentDao.getFullList();
        System.out.println(students);
        Student studen2 =  studentDao.getById(1);
        Set<Exam> examSet = studen2.getExams();

        System.out.println(examSet);
    }
}
