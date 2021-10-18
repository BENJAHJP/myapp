package com.example.servicemaster.models;

public class ActiveModel {
    String customer;
    String regNo;
    String jobType;
    String duration;

    public ActiveModel(String customer, String regNo, String jobType, String duration) {
        this.customer = customer;
        this.regNo = regNo;
        this.jobType = jobType;
        this.duration = duration;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
