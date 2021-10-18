package com.example.servicemaster.roomdatabases.entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Form5")
public class Form5Entity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;
    private int checked;
    private String remarks;

    public Form5Entity(int id, String title, int checked, String remarks) {
        this.id = id;
        this.title = title;
        this.checked = checked;
        this.remarks = remarks;
    }

    @Ignore
    public Form5Entity(String title, int checked, String remarks) {
        this.title = title;
        this.checked = checked;
        this.remarks = remarks;
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
