package org.example.employeeservice.controller;

import org.example.employeeservice.model.Employee;
import org.example.employeeservice.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;
    public EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @PostMapping
    public Employee add(@RequestBody Employee employee){
        return employeeRepository.addEmployee(employee);
    }

    @GetMapping
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id){
        return employeeRepository.findById(id);
    }

    @GetMapping("department/{departmentId}")
    public List<Employee> FindByDepartment(@PathVariable Long departmentId){
        return employeeRepository.findByDepartmentId(departmentId);
    }
}
