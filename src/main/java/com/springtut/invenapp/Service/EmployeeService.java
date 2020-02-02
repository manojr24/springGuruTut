/*
package com.springtut.invenapp.Service;

import com.springtut.invenapp.Respository.EmployeeRepository;
import com.springtut.invenapp.dao.ImplClasses.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = repository.findAll();

        if (employeeList.size() > 0) {
            return employeeList;
        } else {
            return new ArrayList<>();
        }
    }

    public Employee getEmployeeById(Long id) throws Exception {
        Optional<Employee> employee = repository.findById(id);

        if (employee.isPresent()) {
            return employee.get();
        } else {
            throw new Exception("No Employee record exist  for given id");
        }

    }

    public Employee createOrUpdateEmployee(Employee e) throws Exception {
        Optional<Employee> employee = repository.findById(e.getId());

        if (employee.isPresent()) {

            Employee newEmployee = employee.get();
            newEmployee.setAccessCode(e.getAccessCode());
            newEmployee.setFirstName(e.getFirstName());
            newEmployee.setLastName(e.getLastName());
            newEmployee.setAddress(e.getAddress());
            newEmployee.setCompany(e.getCompany());
            newEmployee.setDateOfBirth(e.getDateOfBirth());
            newEmployee.setMobileNo(e.getMobileNo());
            newEmployee.setPhoneNo(e.getPhoneNo());
            newEmployee.setRole(e.getRole());
            newEmployee.setEmailId(e.getEmailId());
            newEmployee.setMangerId(e.getMangerId());
            newEmployee.setPermission(e.getPermission());
            newEmployee.setDepartment(e.getDepartment());
            newEmployee.setDesignation(e.getDesignation());
            newEmployee.setContractor(e.getContractor());

            newEmployee = repository.save(newEmployee);

            return newEmployee;
        } else {
            e = repository.save(e);
            return e;
        }

    }

    public void deleteEmployeeById(Long id) throws Exception {
        Optional<Employee> employee = repository.findById(id);

        if (employee.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new Exception(" Employee doesn't exists for given id ");
        }
    }


}
*/
