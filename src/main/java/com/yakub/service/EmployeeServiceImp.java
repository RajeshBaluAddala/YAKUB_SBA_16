package com.yakub.service;

import com.yakub.model.Employee;
import com.yakub.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{

    @Autowired
    private EmployeeRepo empRepo;

    @Override
    public Employee saveEmployee(Employee emp) {
        return empRepo.save(emp);
    }

    @Override
    public void deleteEmployee(Integer id) {
        empRepo.deleteById(id);
    }

    @Override
    public Employee getOneEmployee(Integer id) {
        return empRepo.findById(id).get();
    }

    @Override
    public List<Employee> getAllEmployee() {
        return empRepo.findAll();
    }

    @Override
    public Employee updateEmployee(Employee emp, Integer id) {
        Employee old=empRepo.findById(id).get();
        old.setName(emp.getName());
        old.setPassword(emp.getPassword());
        old.setEmail(emp.getEmail());
        old.setSal(emp.getSal());

        return empRepo.save(old);
    }
}
