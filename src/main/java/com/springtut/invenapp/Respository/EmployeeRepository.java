package com.springtut.invenapp.Respository;

import com.springtut.invenapp.dao.ImplClasses.Employee;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
