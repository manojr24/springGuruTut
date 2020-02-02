package com.springtut.invenapp.dao.ImplClasses;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "addressLine1")
    String addressLine1;
    @Column(name = "addressLine2")
    String addressLine2;
    @Column(name = "county")
    String county;  //taluk/panchayat/county
    @Column(name = "city")
    String city;
    @Column(name = "state")
    String state;
    @Column(name = "country")
    String country;
    @Column(name = "pincode")
    String pincode;  // if other country... it's  "ZIPCODE"

    public Address(String addressLine1, String addressLine2, String county, String city, String state, String country, String pincode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.county = county;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

}
