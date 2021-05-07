package com.example.springboot.services;



import com.example.springboot.dao.EmployeeRepository;
import com.example.springboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface EmployeeService {


    Employee getEmployee(int id) ;

    public List<Employee> getAllEmployeesByname(String name);
    public List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    void deleteEmployee(int id);
}