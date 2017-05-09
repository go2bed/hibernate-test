package com.hillel.webinar.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 *
 */
@Entity
@Table(name="STUDENTS")
public class Student extends AbstractEntity {

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

    @Getter
    @Setter
    @Embedded
    private StudentAddress studentAddress;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
        if (lastName != null ? !lastName.equals(student.lastName) : student.lastName != null) return false;
        return studentAddress != null ? studentAddress.equals(student.studentAddress) : student.studentAddress == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (studentAddress != null ? studentAddress.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", id=" + id +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", studentAddress=" + studentAddress +
                '}';
    }
}
