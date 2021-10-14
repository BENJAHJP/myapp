package com.example.servicemaster.models;

public class ItemsModel {

    private String title;
    private int checked;
    private String remarks;

    public ItemsModel(String title, int checked, String remarks) {
        this.title = title;
        this.checked = checked;
        this.remarks = remarks;
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
