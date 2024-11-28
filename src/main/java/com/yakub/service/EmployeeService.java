package com.yakub.service;


import com.yakub.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EmployeeService {

    public Employee saveEmployee(Employee emp);
    public void deleteEmployee(Integer id);
    public Employee getOneEmployee(Integer id);
    public List<Employee> getAllEmployee();
    public Employee updateEmployee(Employee emp,Integer id);

}
