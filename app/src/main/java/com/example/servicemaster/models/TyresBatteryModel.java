package com.example.servicemaster.models;

public class TyresBatteryModel {
    String title;
    String make;
    String serialNo;
    String condition;

    public TyresBatteryModel(String title, String make, String serialNo, String condition) {
        this.title = title;
        this.make = make;
        this.serialNo = serialNo;
        this.condition = condition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
