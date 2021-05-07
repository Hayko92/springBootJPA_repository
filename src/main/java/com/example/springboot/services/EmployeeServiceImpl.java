package com.example.springboot.services;


import com.example.springboot.dao.EmployeeRepository;
import com.example.springboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getAllEmployeesByname(String name) {
        return employeeRepository.findAllByName(name);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override

    public Employee getEmployee(int id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            return optionalEmployee.get();
        } else {
            System.out.println("there is no Employee");

        }
        return null;
    }

    @Override

    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();
    }

    @Override

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override

    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}