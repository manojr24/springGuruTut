package com.springtut.invenapp.dao.interf;

import com.springtut.invenapp.dao.ImplClasses.Address;
import com.springtut.invenapp.dao.ImplClasses.Company;

public interface User {

    Long getId();

    void setId(Long id);

    String getFirstName();

    void setName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getDateOfBirth();

    void setDateOfBirth(String dateOfBirth);

    String getAge();

    String getMobileNo();

    void setMobileNo(String mobileNo);

    String getPhoneNo();

    void setPhoneNo(String phoneNo);

    String getMangerName();

    void setManagerName(String mangerName);

    Company getCompany();

    void setCompany(Company company);

    String getDepartment();

    void setDepartment(String department);

    String getDesignation();

    void setDesignation(String Designation);

    String getAccessCode();

    void setAccessCode(String accessCode);

    String getPermission();

    void setPermission(String permission);

    Boolean isContractor();

    void setContractor(Boolean contractor);

    Address getAddress();

    void  setAddress(Address address);

    String getEmailId();

    void setEmailId(String emailId);



}
