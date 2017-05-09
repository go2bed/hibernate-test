package com.hillel.webinar.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 *
 */
@Entity
@Table(name = "EXAMS")
public class Exam extends AbstractEntity {

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Student_ID")
    private Student student;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Subject_ID")
    private Exam exam;

    @Getter
    @Setter
    @Column(name = "Grade")
    private int grade;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exam exam1 = (Exam) o;

        if (grade != exam1.grade) return false;
        if (student != null ? !student.equals(exam1.student) : exam1.student != null) return false;
        return exam != null ? exam.equals(exam1.exam) : exam1.exam == null;
    }

    @Override
    public int hashCode() {
        int result = student != null ? student.hashCode() : 0;
        result = 31 * result + (exam != null ? exam.hashCode() : 0);
        result = 31 * result + grade;
        return result;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", student=" + student +
                ", exam=" + exam +
                ", grade=" + grade +
                '}';
    }
}