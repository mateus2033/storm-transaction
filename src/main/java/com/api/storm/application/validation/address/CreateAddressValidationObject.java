package com.api.storm.application.validation.address;

import com.api.storm.utils.message.address.AddressMessage;
import com.api.storm.utils.message.user.UserMessage;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CreateAddressValidationObject {

    @NotBlank(message = AddressMessage.REQUIRED)
    @Size(max = 150, message = AddressMessage.MAX_LENGTH_ONE_HUNDRED_FIFTY)
    @Pattern(regexp = "^[A-Z]*$", message = UserMessage.ONLY_STRING)
    private String street;

    @NotBlank(message = AddressMessage.REQUIRED)
    @Size(max = 10, message = AddressMessage.MAX_LENGTH_TEN)
    @Pattern(regexp = "^[A-Z]*$", message = UserMessage.ONLY_STRING)
    private String number;

    @NotBlank(message = AddressMessage.REQUIRED)
    @Size(max = 150, message = AddressMessage.MAX_LENGTH_ONE_HUNDRED_FIFTY)
    @Pattern(regexp = "^[A-Z]*$", message = UserMessage.ONLY_STRING)
    private String city;

    @NotBlank(message = AddressMessage.REQUIRED)
    @Size(max = 150, message = AddressMessage.MAX_LENGTH_ONE_HUNDRED_FIFTY)
    @Pattern(regexp = "^[A-Z]*$", message = UserMessage.ONLY_STRING)
    private String district;

    @NotBlank(message = AddressMessage.REQUIRED)
    @Size(max = 150, message = AddressMessage.MAX_LENGTH_ONE_HUNDRED_FIFTY)
    @Pattern(regexp = "^[A-Z]*$", message = UserMessage.ONLY_STRING)
    private String state;

    @NotBlank(message = AddressMessage.REQUIRED)
    @Size(max = 150, message = AddressMessage.MAX_LENGTH_ONE_HUNDRED_FIFTY)
    @Pattern(regexp = "^[A-Z]*$", message = UserMessage.ONLY_STRING)
    private String postalCode;

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
