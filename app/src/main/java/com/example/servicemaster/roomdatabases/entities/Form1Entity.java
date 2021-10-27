package com.example.servicemaster.roomdatabases.entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Form1")
public class Form1Entity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String regNo;
    private String financier;
    private String customer;
    private String motorist;
    private String email;
    private String telNo;
    private String idNo;
    private String dateIn;
    private String jobType;
    private String duration;
    private String promisedDate;
    private String postalAddress;
    private String make;
    private String model;
    private String chassisNo;
    private String engineNo;
    private String vinNo;
    private String fuel;
    private String odometer;
    private String manualJobCardNo;
    private String towedBy;

    public Form1Entity(int id, String regNo, String financier, String customer, String motorist, String email, String telNo, String idNo, String dateIn, String jobType, String duration, String promisedDate, String postalAddress, String make, String model, String chassisNo, String engineNo, String vinNo, String fuel, String odometer, String manualJobCardNo, String towedBy) {
        this.id = id;
        this.regNo = regNo;
        this.financier = financier;
        this.customer = customer;
        this.motorist = motorist;
        this.email = email;
        this.telNo = telNo;
        this.idNo = idNo;
        this.dateIn = dateIn;
        this.jobType = jobType;
        this.duration = duration;
        this.promisedDate = promisedDate;
        this.postalAddress = postalAddress;
        this.make = make;
        this.model = model;
        this.chassisNo = chassisNo;
        this.engineNo = engineNo;
        this.vinNo = vinNo;
        this.fuel = fuel;
        this.odometer = odometer;
        this.manualJobCardNo = manualJobCardNo;
        this.towedBy = towedBy;
    }

    @Ignore
    public Form1Entity(String regNo, String financier, String customer, String motorist, String email, String telNo, String idNo, String dateIn, String jobType, String duration, String promisedDate, String postalAddress, String make, String model, String chassisNo, String engineNo, String vinNo, String fuel, String odometer, String manualJobCardNo, String towedBy) {
        this.regNo = regNo;
        this.financier = financier;
        this.customer = customer;
        this.motorist = motorist;
        this.email = email;
        this.telNo = telNo;
        this.idNo = idNo;
        this.dateIn = dateIn;
        this.jobType = jobType;
        this.duration = duration;
        this.promisedDate = promisedDate;
        this.postalAddress = postalAddress;
        this.make = make;
        this.model = model;
        this.chassisNo = chassisNo;
        this.engineNo = engineNo;
        this.vinNo = vinNo;
        this.fuel = fuel;
        this.odometer = odometer;
        this.manualJobCardNo = manualJobCardNo;
        this.towedBy = towedBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getFinancier() {
        return financier;
    }

    public void setFinancier(String financier) {
        this.financier = financier;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getMotorist() {
        return motorist;
    }

    public void setMotorist(String motorist) {
        this.motorist = motorist;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
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

    public String getPromisedDate() {
        return promisedDate;
    }

    public void setPromisedDate(String promisedDate) {
        this.promisedDate = promisedDate;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getVinNo() {
        return vinNo;
    }

    public void setVinNo(String vinNo) {
        this.vinNo = vinNo;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getOdometer() {
        return odometer;
    }

    public void setOdometer(String odometer) {
        this.odometer = odometer;
    }

    public String getManualJobCardNo() {
        return manualJobCardNo;
    }

    public void setManualJobCardNo(String manualJobCardNo) {
        this.manualJobCardNo = manualJobCardNo;
    }

    public String getTowedBy() {
        return towedBy;
    }

    public void setTowedBy(String towedBy) {
        this.towedBy = towedBy;
    }
}
