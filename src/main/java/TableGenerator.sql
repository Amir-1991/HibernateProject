CREATE
DATABASE IF NOT EXISTS hibernate_db;
USE
hibernate_db;
DROP TABLE IF EXISTS student;
CREATE TABLE student
(
    ID int(10) NOT NULL AUTO_INCREMENT,
    FIRST_NAME VARCHAR(45) DEFAULT NULL,
    LAST_NAME VARCHAR(45) DEFAULT NULL,
    NATIONAL_CODE VARCHAR(45) DEFAULT NULL,
    PHONE_NUMBER VARCHAR(45) DEFAULT NULL,
    PRIMARY KEY (ID)
) ENGINE=InnoDB AUTO_INCREMENT=3000 DEFAULT CHARSET=latin1;

