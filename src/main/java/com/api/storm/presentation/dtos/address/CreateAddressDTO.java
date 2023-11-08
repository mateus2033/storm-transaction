package com.api.storm.presentation.dtos.address;

public class CreateAddressDTO {

    private String street;

    private String number;

    private String city;

    private String district;

    private String state;

    private String postalCode;

    public CreateAddressDTO(String street, String number, String city, String district, String state, String postalCode) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.district = district;
        this.state = state;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
