package org.example.spring.mvc.mvc_hibernate_aop.controller;

import org.example.spring.mvc.mvc_hibernate_aop.dao.EmployeeDAO;
import org.example.spring.mvc.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping("/")
    public String showAllEmployees(Model model){
        List<Employee> allEmployees = employeeDAO.getAllEmployees();
//        System.out.println(allEmployees);
        model.addAttribute("allEmps", allEmployees);
        return "all-employees";
    }
}