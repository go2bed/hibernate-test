/*SELECT ALL RESULTS FROM ON STUDENT TO ALL EXAMS*/
SELECT *
FROM exams e
  JOIN students s ON e.student_id = s.id
  JOIN subjects sj ON e.Subject_ID = sj.id;