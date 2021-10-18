package com.example.servicemaster.roomdatabases.entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.RoomDatabase;

@Entity(tableName = "Form2")
public class Form2Entity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String insuranceSticker;
    private String inspectionSticker;
    private String claimNo;
    private String serviceAdvisor;

    public Form2Entity(int id, String insuranceSticker, String inspectionSticker, String claimNo, String serviceAdvisor) {
        this.id = id;
        this.insuranceSticker = insuranceSticker;
        this.inspectionSticker = inspectionSticker;
        this.claimNo = claimNo;
        this.serviceAdvisor = serviceAdvisor;
    }

    @Ignore
    public Form2Entity(String insuranceSticker, String inspectionSticker, String claimNo, String serviceAdvisor) {
        this.insuranceSticker = insuranceSticker;
        this.inspectionSticker = inspectionSticker;
        this.claimNo = claimNo;
        this.serviceAdvisor = serviceAdvisor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInsuranceSticker() {
        return insuranceSticker;
    }

    public void setInsuranceSticker(String insuranceSticker) {
        this.insuranceSticker = insuranceSticker;
    }

    public String getInspectionSticker() {
        return inspectionSticker;
    }

    public void setInspectionSticker(String inspectionSticker) {
        this.inspectionSticker = inspectionSticker;
    }

    public String getClaimNo() {
        return claimNo;
    }

    public void setClaimNo(String claimNo) {
        this.claimNo = claimNo;
    }

    public String getServiceAdvisor() {
        return serviceAdvisor;
    }

    public void setServiceAdvisor(String serviceAdvisor) {
        this.serviceAdvisor = serviceAdvisor;
    }
}
