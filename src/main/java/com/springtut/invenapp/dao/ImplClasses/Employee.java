package com.springtut.invenapp.dao.ImplClasses;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Entity
@Data
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "first_name")
    @NotBlank(message = "First Name is mandatory")
    String firstName;
    @Column(name = "last_name")
    @NotBlank(message = "Last Name is mandatory")
    String lastName;
    @Column(name = "date_Of_Birth")
    Date dateOfBirth;
    @Column(name = "mobileNo")
    String mobileNo;
    @Column(name = "phoneNo")
    String phoneNo;
    @Column(name = "email_id", nullable = false, length = 200)
    String emailId;
    @Column(name = "employee_id")
    String employeeId;
    @Column(name = "manger_emp_id")
    String mangerId;
    @Column(name = "permission")
    String permission;
    @Column(name = "department")
    String department;
    @OneToOne
    Company company;

    @UpdateTimestamp
    Date updatedAt;

    @OneToOne
    Address address;
    @Column(name = "joining_Date")
    Date joiningDate;
    @Column(name = "designation")
    String designation;
    @Column(name = "role")
    String role;
    @Column(name = "accessCode")
    String accessCode;
    @Column(name = "contractor")
    Boolean contractor;

    @CreationTimestamp
    Date createdAt;

    public String getEmployeeId() {
        return employeeId;
    }

    public Employee setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public Employee setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Employee setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Employee setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Employee setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Employee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        int years = 0;

        Calendar birthDay = Calendar.getInstance();
        birthDay.setTimeInMillis(getDateOfBirth().getTime());

        //create calendar object for current day
        long currentTime = System.currentTimeMillis();
        Calendar now = Calendar.getInstance();
        now.setTimeInMillis(currentTime);

        //Get difference between years
        years = now.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
        return years;
    }

    public String getRole() {
        return role;
    }

    public Employee setRole(String role) {
        this.role = role;
        return this;
    }

    public Employee setDateOfBirth(Date dateOfBirth) throws Exception {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public Employee setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public Employee setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public String getEmailId() {
        return emailId;
    }

    public Employee setEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    public String getMangerId() {
        return mangerId;
    }

    public Employee setMangerId(String mangerId) {
        this.mangerId = mangerId;
        return this;
    }

    public String getPermission() {
        return permission;
    }

    public Employee setPermission(String permission) {
        this.permission = permission;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public Employee setDepartment(String department) {
        this.department = department;
        return this;
    }

    public Company getCompany() {
        return company;
    }

    public Employee setCompany(Company company) {
        this.company = company;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Employee setAddress(Address address) {
        this.address = address;
        return this;
    }

    public String getDesignation() {
        return designation;
    }

    public Employee setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public Employee setAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }

    public Boolean getContractor() {
        return contractor;
    }

    public Employee setContractor(Boolean contractor) {
        this.contractor = contractor;
        return this;
    }
}
