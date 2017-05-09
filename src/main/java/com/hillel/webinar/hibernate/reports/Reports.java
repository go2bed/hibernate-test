package com.hillel.webinar.hibernate.reports;

import com.hillel.webinar.hibernate.entity.Exam;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import java.util.List;

/**
 *
 */
public class Reports {

    public List<ExamResult> getExamResults(String firstName, String lastName, Session session) {
        Query query = session.createQuery(
                "select new com.hillel.webinar.hibernate.reports.ExamResult(s.name, st.lastName, e.grade) " +
                        "from Exam e, Subject s, Student st " +
                        "where e.student.id = st.id and e.subject.id = s.id " +
                        "and st.firstName = :firstName and st.lastName = :lastName");
        query.setParameter("firstName", firstName);
        query.setParameter("lastName", lastName);
        List<ExamResult> examResultList = query.getResultList();
        return examResultList;
    }


    public List<Exam> getExamsResultsWithCriteria(String firstName, String lastName,
                                                  Session session) {
        Criteria criteria = session.createCriteria(Exam.class);
        criteria.setMaxResults(10);
        criteria.createAlias("student", "s");
        criteria.add(Restrictions.and(
                Restrictions.eq("s.firstName", firstName),
                Restrictions.eq("s.lastName", lastName)
        ));
        return criteria.list();
    }
}
