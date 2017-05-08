package com.hillel.webinar.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 *
 */
@Entity
@Table(name="STUDENTS")
public class Student {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @Column(name = "FirstName")
    private String firstName;

    @Getter
    @Setter
    @Column(name = "LastNam")
    private String lastName;

    @Getter
    @Setter
    @Column(name = "Age")
    private int age;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (age != student.age) return false;
        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
        return !(lastName != null ? !lastName.equals(student.lastName) : student.lastName != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
