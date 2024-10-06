package com.traini8.trainingcenters.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;
import java.util.ArrayList;


@Component
@Scope("PROTOTYPE")
public class TrainingCenter
{
    private String centerName;
    private int centerCode;
    private String address;
    private int sutudentCapacity;
    private List<String> courses;
    private Long createdOn;
    private String email;
    private String contactPhone;

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public int getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(int centerCode) {
        this.centerCode = centerCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSutudentCapacity() {
        return sutudentCapacity;
    }

    public void setSutudentCapacity(int sutudentCapacity) {
        this.sutudentCapacity = sutudentCapacity;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public Long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn()
    {
        this.createdOn = Instant.now().toEpochMilli();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
