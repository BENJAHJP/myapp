package com.example.servicemaster.roomdatabases.entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Form5")
public class Form5Entity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String wheelRimsRemarks;
    private boolean wheelRimsCheckbox;

    private String wheelCapsHubsRemarks;
    private boolean wheelCapsHubsCheckbox;

    private String mudFlapRemarks;
    private boolean mudFlapCheckbox;

    private String steeringWheelRemarks;
    private boolean steeringWheelCheckbox;

    public Form5Entity(int id, String wheelRimsRemarks, boolean wheelRimsCheckbox, String wheelCapsHubsRemarks, boolean wheelCapsHubsCheckbox, String mudFlapRemarks, boolean mudFlapCheckbox, String steeringWheelRemarks, boolean steeringWheelCheckbox) {
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
    public Form5Entity(String wheelRimsRemarks, boolean wheelRimsCheckbox, String wheelCapsHubsRemarks, boolean wheelCapsHubsCheckbox, String mudFlapRemarks, boolean mudFlapCheckbox, String steeringWheelRemarks, boolean steeringWheelCheckbox) {
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

    public boolean isWheelRimsCheckbox() {
        return wheelRimsCheckbox;
    }

    public void setWheelRimsCheckbox(boolean wheelRimsCheckbox) {
        this.wheelRimsCheckbox = wheelRimsCheckbox;
    }

    public String getWheelCapsHubsRemarks() {
        return wheelCapsHubsRemarks;
    }

    public void setWheelCapsHubsRemarks(String wheelCapsHubsRemarks) {
        this.wheelCapsHubsRemarks = wheelCapsHubsRemarks;
    }

    public boolean isWheelCapsHubsCheckbox() {
        return wheelCapsHubsCheckbox;
    }

    public void setWheelCapsHubsCheckbox(boolean wheelCapsHubsCheckbox) {
        this.wheelCapsHubsCheckbox = wheelCapsHubsCheckbox;
    }

    public String getMudFlapRemarks() {
        return mudFlapRemarks;
    }

    public void setMudFlapRemarks(String mudFlapRemarks) {
        this.mudFlapRemarks = mudFlapRemarks;
    }

    public boolean isMudFlapCheckbox() {
        return mudFlapCheckbox;
    }

    public void setMudFlapCheckbox(boolean mudFlapCheckbox) {
        this.mudFlapCheckbox = mudFlapCheckbox;
    }

    public String getSteeringWheelRemarks() {
        return steeringWheelRemarks;
    }

    public void setSteeringWheelRemarks(String steeringWheelRemarks) {
        this.steeringWheelRemarks = steeringWheelRemarks;
    }

    public boolean isSteeringWheelCheckbox() {
        return steeringWheelCheckbox;
    }

    public void setSteeringWheelCheckbox(boolean steeringWheelCheckbox) {
        this.steeringWheelCheckbox = steeringWheelCheckbox;
    }
}
