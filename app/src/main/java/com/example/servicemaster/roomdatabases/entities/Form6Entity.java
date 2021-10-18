package com.example.servicemaster.roomdatabases.entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Form6")
public class Form6Entity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;
    private String make;
    private String serialNo;
    private String condition;

    public Form6Entity(int id, String title, String make, String serialNo, String condition) {
        this.id = id;
        this.title = title;
        this.make = make;
        this.serialNo = serialNo;
        this.condition = condition;
    }

    @Ignore
    public Form6Entity(String title, String make, String serialNo, String condition) {
        this.title = title;
        this.make = make;
        this.serialNo = serialNo;
        this.condition = condition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
