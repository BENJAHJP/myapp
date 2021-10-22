package com.example.servicemaster.roomdatabases.entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Form5")
public class Form5Entity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String wheelRimsRemarks;
    private int wheelRimsCheckbox;

    private String wheelCapsHubsRemarks;
    private int wheelCapsHubsCheckbox;

    private String mudFlapRemarks;
    private int mudFlapCheckbox;

    private String steeringWheelRemarks;
    private int steeringWheelCheckbox;

    public Form5Entity(int id, String wheelRimsRemarks, int wheelRimsCheckbox, String wheelCapsHubsRemarks, int wheelCapsHubsCheckbox, String mudFlapRemarks, int mudFlapCheckbox, String steeringWheelRemarks, int steeringWheelCheckbox) {
        this.id = id;
        this.wheelRimsRemarks = wheelRimsRemarks;
        this.wheelRimsCheckbox = wheelRimsCheckbox;
        this.wheelCapsHubsRemarks = wheelCapsHubsRemarks;
        this.wheelCapsHubsCheckbox = wheelCapsHubsCheckbox;
        this.mudFlapRemarks = mudFlapRemarks;
        this.mudFlapCheckbox = mudFlapCheckbox;
        this.steeringWheelRemarks = steeringWheelRemarks;
        this.steeringWheelCheckbox = steeringWheelCheckbox;
    }

    @Ignore
    public Form5Entity(String wheelRimsRemarks, int wheelRimsCheckbox, String wheelCapsHubsRemarks, int wheelCapsHubsCheckbox, String mudFlapRemarks, int mudFlapCheckbox, String steeringWheelRemarks, int steeringWheelCheckbox) {
        this.wheelRimsRemarks = wheelRimsRemarks;
        this.wheelRimsCheckbox = wheelRimsCheckbox;
        this.wheelCapsHubsRemarks = wheelCapsHubsRemarks;
        this.wheelCapsHubsCheckbox = wheelCapsHubsCheckbox;
        this.mudFlapRemarks = mudFlapRemarks;
        this.mudFlapCheckbox = mudFlapCheckbox;
        this.steeringWheelRemarks = steeringWheelRemarks;
        this.steeringWheelCheckbox = steeringWheelCheckbox;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWheelRimsRemarks() {
        return wheelRimsRemarks;
    }

    public void setWheelRimsRemarks(String wheelRimsRemarks) {
        this.wheelRimsRemarks = wheelRimsRemarks;
    }

    public int getWheelRimsCheckbox() {
        return wheelRimsCheckbox;
    }

    public void setWheelRimsCheckbox(int wheelRimsCheckbox) {
        this.wheelRimsCheckbox = wheelRimsCheckbox;
    }

    public String getWheelCapsHubsRemarks() {
        return wheelCapsHubsRemarks;
    }

    public void setWheelCapsHubsRemarks(String wheelCapsHubsRemarks) {
        this.wheelCapsHubsRemarks = wheelCapsHubsRemarks;
    }

    public int getWheelCapsHubsCheckbox() {
        return wheelCapsHubsCheckbox;
    }

    public void setWheelCapsHubsCheckbox(int wheelCapsHubsCheckbox) {
        this.wheelCapsHubsCheckbox = wheelCapsHubsCheckbox;
    }

    public String getMudFlapRemarks() {
        return mudFlapRemarks;
    }

    public void setMudFlapRemarks(String mudFlapRemarks) {
        this.mudFlapRemarks = mudFlapRemarks;
    }

    public int getMudFlapCheckbox() {
        return mudFlapCheckbox;
    }

    public void setMudFlapCheckbox(int mudFlapCheckbox) {
        this.mudFlapCheckbox = mudFlapCheckbox;
    }

    public String getSteeringWheelRemarks() {
        return steeringWheelRemarks;
    }

    public void setSteeringWheelRemarks(String steeringWheelRemarks) {
        this.steeringWheelRemarks = steeringWheelRemarks;
    }

    public int getSteeringWheelCheckbox() {
        return steeringWheelCheckbox;
    }

    public void setSteeringWheelCheckbox(int steeringWheelCheckbox) {
        this.steeringWheelCheckbox = steeringWheelCheckbox;
    }
}
