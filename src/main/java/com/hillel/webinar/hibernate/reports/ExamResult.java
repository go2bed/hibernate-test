package com.hillel.webinar.hibernate.reports;

import lombok.Getter;
import lombok.Setter;

/**
 *
 */
public class ExamResult {

    public ExamResult(String lastName, String subjectName, int grade) {
        this.lastName = lastName;
        this.subjectName = subjectName;
        this.grade = grade;
    }

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    private String subjectName;

    @Getter
    @Setter
    private int grade;
}
