CREATE DATABASE zone;

USE zone;

CREATE TABLE zones
(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    studentname VARCHAR(50),
    password VARCHAR(50),
    course VARCHAR(50),
    fees INT
);
select * from zones; 