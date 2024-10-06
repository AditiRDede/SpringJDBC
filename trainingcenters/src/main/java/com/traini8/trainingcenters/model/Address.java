package com.traini8.trainingcenters.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("PROTOTYPE")
public class Address
{
    private String Detailedaddress;
    private String city;
    private String state;
    private int pinCode;

    public String getDetailedaddress() {
        return Detailedaddress;
    }

    public void setDetailedaddress(String detailedaddress) {
        Detailedaddress = detailedaddress;
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

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
