DROP TABLE IF EXISTS EXAMS ;
CREATE TABLE EXAMS (
  ID int NOT NULL,
  Student_ID int NOT NULL,
  Subject_ID int NOT NULL,
  Grade int NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (Student_ID) REFERENCES STUDENTS(ID),
  FOREIGN KEY (Subject_ID) REFERENCES SUBJECTS(ID)
);


INSERT INTO exams(Student_ID, Subject_ID, Grade) VALUES( 1, 1, 5);
INSERT INTO exams(Student_ID, Subject_ID, Grade) VALUES( 1, 2, 4);
INSERT INTO exams(Student_ID, Subject_ID, Grade) VALUES( 1, 3, 5);
