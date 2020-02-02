package com.springtut.invenapp.dao.ImplClasses;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Company {
    @Column(name = "Company_name")
    String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "Company_Cd")
    String companyCode;
    @Column(name = "Company_Branch_Name")
    String branchName;
    @Column(name = "Company_Branch_cd")
    String branchCode;
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    Address companyAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public Address getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(Address companyAddress) {
        this.companyAddress = companyAddress;
    }
}
