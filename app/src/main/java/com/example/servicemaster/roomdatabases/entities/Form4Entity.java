package com.example.servicemaster.roomdatabases.entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Form4")
public class Form4Entity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String regNo;
    private String title;
    private int checked;
    private String remarks;

    public Form4Entity(int id,String regNo, String title, int checked, String remarks) {
        this.id = id;
        this.title = title;
        this.checked = checked;
        this.remarks = remarks;
        this.regNo = regNo;
    }

    @Ignore
    public Form4Entity(String regNo, String title, int checked, String remarks) {
        this.title = title;
        this.checked = checked;
        this.remarks = remarks;
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
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

    public int getChecked() {
        return checked;
    }

    public void setChecked(int checked) {
        this.checked = checked;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
