package com.springtut.invenapp.Bootstrap;

import com.springtut.invenapp.Respository.AddressRepository;
import com.springtut.invenapp.Respository.EmployeeRepository;
import com.springtut.invenapp.dao.ImplClasses.Address;
import com.springtut.invenapp.dao.ImplClasses.Company;
import com.springtut.invenapp.dao.ImplClasses.Employee;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {
    EmployeeRepository employeeRepository;
    AddressRepository addressRepository;

    public Bootstrap(EmployeeRepository employeeRepository, AddressRepository addressRepository) {
        this.employeeRepository = employeeRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        try {
            InitDataLoad();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void InitDataLoad() throws Exception {

        Employee emp = new Employee();
        Address address = new Address("12313 sdgs", "", "ajsvfjkha ", "afasd", "asfdas", "dfgsgsdfg", "654654");
        emp.setFirstName("John")
                .setLastName("Bishop")
                .setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse("24/12/1994"))
                .setMobileNo("9654321654")
                .setPhoneNo("2244556611")
                .setEmailId("j.b@wew.com")
                .setEmployeeId("1231_IN")
                .setAccessCode("654321")
                .setAddress(address)
        .setMangerId("38745_IN")
        .setPermission("emp")
        .setDepartment("Sales")
        .setJoiningDate(new SimpleDateFormat("dd/MM/yyyy").parse("02/02/2020"))
        .setDesignation("Sales Executive")
        .setRole("Salesperson")
        .setContractor(false)
        ;
        addressRepository.save(address);


        employeeRepository.save(emp);

        System.out.println(emp.getAge());

    }
}
