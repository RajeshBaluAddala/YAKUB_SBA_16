package com.yakub.controller;

import com.yakub.model.Employee;
import com.yakub.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

    @PostMapping("/save")
    public String saveEmp(@RequestBody Employee emp){
        Employee e1=empService.saveEmployee(emp);
        String message=null;
        if(e1!=null)
        {
            message="Emoployee Data Succesfully Inserted...";
        }
        else
        {
            message="Data is failed";
        }
        return message;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmp(@PathVariable Integer id)
    {
        empService.deleteEmployee(id);
    }

    @GetMapping("/get/{id}")
    public Employee getOneEmp(@PathVariable Integer id)
    {
        return empService.getOneEmployee(id);
    }

    @GetMapping("/getAll")
    public List<Employee> getAll()
    {
        return empService.getAllEmployee();
    }

    @PutMapping("/update/{id}")
    public Employee update(@RequestBody Employee emp,@PathVariable Integer id)
    {
        return empService.updateEmployee(emp, id);
    }
}
