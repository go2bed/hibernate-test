DROP TABLE IF EXISTS STUDENTS ;
CREATE TABLE STUDENTS (
  ID int,
  FirstName varchar(255) NOT NULL,
  LastName varchar(255) NOT NULL,
  Age int NOT NULL ,
  PRIMARY KEY (ID)
);