# Spring MVC + Hibernate
> Конфигурация приложения
   - Подготовка БД и таблиц
   - Добавление dependency in pom.xml
   - Settings  web.xml
   - Settings applicationContext.xml
   - Smart Tomcat -> Deployment folder:/home/kde/Документы/java/VTB24/spring_mvc/spring_mvc_hibernate_aop/spring_mvc_hibernate_aop/src/main/webapp
>
## Подготовка БД и таблиц
1. sudo mysql
   - CREATE USER bestuser@'localhost' IDENTIFIED BY 'bestuser';
   - GRANT ALL PRIVILEGES ON *. * TO bestuser@'localhost';
   - FLUSH PRIVILEGES;
   - mysql -u bestuser -p bestuser
   - **sudo systemctl status mysql**
   - sudo service mysql restart
   - exit;
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
## Отображение списка всех работников
> см. structure_for_view_all_employees.jpg
  - src/main/java/org/example/spring/mvc/mvc_hibernate_aop/dao/EmployeeDAOImplementation.java
    - @Transactional - после этой аннотации Spring берет на себя откр\закр транзакций.
  - @Controller - специализированный @Component
    - для DAO будет выглядеть так: 
      - > @Repository
        > 
        > public class EmployeeDAOImplementation  implements EmployeeDAO{}
      - При поиске компонентов, Spring также будет регистрировать
      - все DAO с аннотацией @Repository в Spring Container-e
## Annotation @Service
      > см. annotation_service.jpg
  - Аннотация @Service отмечает класс, содержащий бизнес-логику.
  - В иерархии компонентов приложения Service является соед. звеном
    - между Controller и DAO
  - @Service это специализированный @Component. 
    - При поиске компонентов Spring зарег. все классы с @Service в Spring Container
  - Плюс = транзакционность соблюдается на уровне сервиса. см @Transactional
## Добавление нового работника 