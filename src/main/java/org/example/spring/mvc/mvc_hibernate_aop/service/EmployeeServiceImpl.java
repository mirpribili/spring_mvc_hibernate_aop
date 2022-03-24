package org.example.spring.mvc.mvc_hibernate_aop.service;

import org.example.spring.mvc.mvc_hibernate_aop.dao.EmployeeDAO;
import org.example.spring.mvc.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAO employeeDAO; // прописали зависимость

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}