package com.traini8.trainingcenters.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;

@Component
@Scope("prototype")
public class TrainingCenter
{
    private String centerName;
    private String centerCode;
   // private String address;
    private int sutudentCapacity;
   // private List<String> courses;
    private String createdOn;
    private String contactEmail;
    private String contactPhone;

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

 /*   public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }*/

    public int getSutudentCapacity() {
        return sutudentCapacity;
    }

    public void setSutudentCapacity(int sutudentCapacity) {
        this.sutudentCapacity = sutudentCapacity;
    }

   /* public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }*/

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String TimeStamp)
    {
        this.createdOn=TimeStamp;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    @Override
    public String toString() {
        return "[" +
                "centerName='" + centerName + '\'' +
                ", centerCode='" + centerCode + '\'' +
                ", sutudentCapacity=" + sutudentCapacity +
                ", createdOn='" + createdOn + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ']';
    }
}
