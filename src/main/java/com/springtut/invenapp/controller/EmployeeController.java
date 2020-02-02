package com.springtut.invenapp.controller;/*
package com.springtut.invenapp.controller;


import com.springtut.invenapp.Service.EmployeeService;
import com.springtut.invenapp.dao.ImplClasses.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

RestController
RequestMapping("/employees")
public class EmployeeController {

    Autowired
    EmployeeService employeeService;

    @ResponseBody
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @ResponseBody
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id)
            throws Exception {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee createOrUpdateEmployee(Employee employee) throws Exception {
        return employeeService.createOrUpdateEmployee(employee);
    }

    @GetMapping("/{id}")
    public void deleteEmployeeById(@PathVariable("id") Long id) throws Exception {
        employeeService.deleteEmployeeById(id);
    }


}
*/
