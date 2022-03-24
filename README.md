# Spring MVC + Hibernate
> Конфигурация приложения
   - Подготовка БД и таблиц
   - Добавление dependency in pom.xml
   - Settings  web.xml
   - Settings applicationContext.xml
>
## Подготовка БД и таблиц
1. sudo mysql
   - CREATE USER bestuser@'localhost' IDENTIFIED BY 'bestuser';
   - GRANT ALL PRIVILEGES ON *. * TO bestuser@'localhost';
   - FLUSH PRIVILEGES;
   - mysql -u bestuser -p bestuser
   - **sudo systemctl status mysql**
   - sudo service mysql restart
   - exit
2. **show databases;**
3. SELECT * from my_db.employees; 
4. **CREATE DATABASE my_db_spring_mvc_aop;**
5. **use my_db_spring_mvc_aop;**
6. **show tables;**
7. drop
   - drop table my_db.employees; 
   - drop table my_db.departments;
   - drop table my_db.child_section;
   - drop table my_db.children;
   - drop table my_db.section;
8. USE my_db_spring_mvc_aop;
#### code for new DB:
    CREATE TABLE employees (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(15),
    surname varchar(25),
    department varchar(20),
    salary int,
    PRIMARY KEY (id)
    ) ;
    
    INSERT INTO my_db_spring_mvc_aop.employees (name, surname, department, salary)
    VALUES
    ('Zaur', 'Tregulov', 'IT', 500),
    ('Oleg', 'Ivanov', 'Sales', 700),
    ('Nina', 'Sidorova', 'HR', 850);
9. **SELECT * FROM my_db_spring_mvc_aop.employees;**
