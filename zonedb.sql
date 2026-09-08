CREATE DATABASE zone;

USE Fone;

CREATE TABLE Fones
(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    studentname VARCHAR(50),
    password VARCHAR(50),
    course VARCHAR(50),
    fees INT
);