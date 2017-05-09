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
    @JoinColumn(name = "student_ID")
    private Student student;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_ID")
    private Subject subject;

    @Getter
    @Setter
    @Column(name = "grade")
    private int grade;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exam exam = (Exam) o;

        if (grade != exam.grade) return false;
        if (student != null ? !student.equals(exam.student) : exam.student != null) return false;
        return subject != null ? subject.equals(exam.subject) : exam.subject == null;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", grade=" + grade +
                '}';
    }
}
