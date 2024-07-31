create database mydatabase;

use jdbc;

create table student(
	id int primary key auto_increment,
    name varchar(100),
    age int
);

INSERT INTO student(name,age) values("asda",122);

SELECT * FROM student;

SELECT * FROM student WHERE age > 18;
