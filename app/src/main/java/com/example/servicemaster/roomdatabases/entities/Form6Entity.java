package com.example.servicemaster.roomdatabases.entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Form6")
public class Form6Entity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String rhsfMake;
    private String rhsfSerialNo;
    private String rhsfCondition;

    private String rhsrMake;
    private String rhsrSerialNo;
    private String rhsrCondition;

    private String lhsfMake;
    private String lhsfSerialNo;
    private String lhsfCondition;

    private String lhsrMake;
    private String lhsrSerialNo;
    private String lhsrCondition;

    private String swheelMake;
    private String swheelSerialNo;
    private String swheelCondition;

    private String batteryMake;
    private String batterySerialNo;
    private String batteryCondition;


    public Form6Entity(int id, String rhsfMake, String rhsfSerialNo, String rhsfCondition, String rhsrMake, String rhsrSerialNo, String rhsrCondition, String lhsfMake, String lhsfSerialNo, String lhsfCondition, String lhsrMake, String lhsrSerialNo, String lhsrCondition, String swheelMake, String swheelSerialNo, String swheelCondition, String batteryMake, String batterySerialNo, String batteryCondition) {
        this.id = id;
        this.rhsfMake = rhsfMake;
        this.rhsfSerialNo = rhsfSerialNo;
        this.rhsfCondition = rhsfCondition;
        this.rhsrMake = rhsrMake;
        this.rhsrSerialNo = rhsrSerialNo;
        this.rhsrCondition = rhsrCondition;
        this.lhsfMake = lhsfMake;
        this.lhsfSerialNo = lhsfSerialNo;
        this.lhsfCondition = lhsfCondition;
        this.lhsrMake = lhsrMake;
        this.lhsrSerialNo = lhsrSerialNo;
        this.lhsrCondition = lhsrCondition;
        this.swheelMake = swheelMake;
        this.swheelSerialNo = swheelSerialNo;
        this.swheelCondition = swheelCondition;
        this.batteryMake = batteryMake;
        this.batterySerialNo = batterySerialNo;
        this.batteryCondition = batteryCondition;
    }

    @Ignore

    public Form6Entity(String rhsfMake, String rhsfSerialNo, String rhsfCondition, String rhsrMake, String rhsrSerialNo, String rhsrCondition, String lhsfMake, String lhsfSerialNo, String lhsfCondition, String lhsrMake, String lhsrSerialNo, String lhsrCondition, String swheelMake, String swheelSerialNo, String swheelCondition, String batteryMake, String batterySerialNo, String batteryCondition) {
        this.rhsfMake = rhsfMake;
        this.rhsfSerialNo = rhsfSerialNo;
        this.rhsfCondition = rhsfCondition;
        this.rhsrMake = rhsrMake;
        this.rhsrSerialNo = rhsrSerialNo;
        this.rhsrCondition = rhsrCondition;
        this.lhsfMake = lhsfMake;
        this.lhsfSerialNo = lhsfSerialNo;
        this.lhsfCondition = lhsfCondition;
        this.lhsrMake = lhsrMake;
        this.lhsrSerialNo = lhsrSerialNo;
        this.lhsrCondition = lhsrCondition;
        this.swheelMake = swheelMake;
        this.swheelSerialNo = swheelSerialNo;
        this.swheelCondition = swheelCondition;
        this.batteryMake = batteryMake;
        this.batterySerialNo = batterySerialNo;
        this.batteryCondition = batteryCondition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRhsfMake() {
        return rhsfMake;
    }

    public void setRhsfMake(String rhsfMake) {
        this.rhsfMake = rhsfMake;
    }

    public String getRhsfSerialNo() {
        return rhsfSerialNo;
    }

    public void setRhsfSerialNo(String rhsfSerialNo) {
        this.rhsfSerialNo = rhsfSerialNo;
    }

    public String getRhsfCondition() {
        return rhsfCondition;
    }

    public void setRhsfCondition(String rhsfCondition) {
        this.rhsfCondition = rhsfCondition;
    }

    public String getRhsrMake() {
        return rhsrMake;
    }

    public void setRhsrMake(String rhsrMake) {
        this.rhsrMake = rhsrMake;
    }

    public String getRhsrSerialNo() {
        return rhsrSerialNo;
    }

    public void setRhsrSerialNo(String rhsrSerialNo) {
        this.rhsrSerialNo = rhsrSerialNo;
    }

    public String getRhsrCondition() {
        return rhsrCondition;
    }

    public void setRhsrCondition(String rhsrCondition) {
        this.rhsrCondition = rhsrCondition;
    }

    public String getLhsfMake() {
        return lhsfMake;
    }

    public void setLhsfMake(String lhsfMake) {
        this.lhsfMake = lhsfMake;
    }

    public String getLhsfSerialNo() {
        return lhsfSerialNo;
    }

    public void setLhsfSerialNo(String lhsfSerialNo) {
        this.lhsfSerialNo = lhsfSerialNo;
    }

    public String getLhsfCondition() {
        return lhsfCondition;
    }

    public void setLhsfCondition(String lhsfCondition) {
        this.lhsfCondition = lhsfCondition;
    }

    public String getLhsrMake() {
        return lhsrMake;
    }

    public void setLhsrMake(String lhsrMake) {
        this.lhsrMake = lhsrMake;
    }

    public String getLhsrSerialNo() {
        return lhsrSerialNo;
    }

    public void setLhsrSerialNo(String lhsrSerialNo) {
        this.lhsrSerialNo = lhsrSerialNo;
    }

    public String getLhsrCondition() {
        return lhsrCondition;
    }

    public void setLhsrCondition(String lhsrCondition) {
        this.lhsrCondition = lhsrCondition;
    }

    public String getSwheelMake() {
        return swheelMake;
    }

    public void setSwheelMake(String swheelMake) {
        this.swheelMake = swheelMake;
    }

    public String getSwheelSerialNo() {
        return swheelSerialNo;
    }

    public void setSwheelSerialNo(String swheelSerialNo) {
        this.swheelSerialNo = swheelSerialNo;
    }

    public String getSwheelCondition() {
        return swheelCondition;
    }

    public void setSwheelCondition(String swheelCondition) {
        this.swheelCondition = swheelCondition;
    }

    public String getBatteryMake() {
        return batteryMake;
    }

    public void setBatteryMake(String batteryMake) {
        this.batteryMake = batteryMake;
    }

    public String getBatterySerialNo() {
        return batterySerialNo;
    }

    public void setBatterySerialNo(String batterySerialNo) {
        this.batterySerialNo = batterySerialNo;
    }

    public String getBatteryCondition() {
        return batteryCondition;
    }

    public void setBatteryCondition(String batteryCondition) {
        this.batteryCondition = batteryCondition;
    }
}
