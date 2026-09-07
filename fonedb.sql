create database fone
use fone;
create table fones
(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
studentname VARCHAR(50),
PASSWORD VARCHAR(50),
course VARCHAR(50),
fee INT
);