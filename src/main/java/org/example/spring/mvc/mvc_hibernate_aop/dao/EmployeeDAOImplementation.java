package org.example.spring.mvc.mvc_hibernate_aop.dao;


import org.example.spring.mvc.mvc_hibernate_aop.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImplementation  implements EmployeeDAO{
    // dependency injection с помощью поля класса
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee> allEmployees = session.createQuery("from Employee", Employee.class)
                .getResultList();
// аналог записи выше
//        Query<Employee> query = session.createQuery("from Employee", Employee.class);
//        query.getResultList();

        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
//        System.out.println(employee);
        Session session  = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Session session  = sessionFactory.getCurrentSession();
        return session.get(Employee.class, id);
    }
}
