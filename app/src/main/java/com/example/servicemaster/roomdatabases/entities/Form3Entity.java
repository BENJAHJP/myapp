package com.example.servicemaster.roomdatabases.entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Form3")
public class Form3Entity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String overallAppearanceRemarks;
    private int overallAppearanceCheckbox;

    private String sideMirrorsRemarks;
    private int sideMirrorsCheckbox;

    private String noOfKeysRemarks;
    private int noOfKeysCheckbox;

    private String fogSpotLightsRemarks;
    private int fogSpotLightsCheckbox;

    private String antennaAerialRemarks;
    private int antennaAerialCheckbox;

    private String regNoPlateFrontRemarks;
    private int regNoPlateFrontCheckbox;

    private String frontBumperRemarks;
    private int frontBumperCheckbox;

    private String fuelTankCapRemarks;
    private int fuelTankCapCheckbox;

    private String frontWindScreenRemarks;
    private int frontWindScreenCheckbox;

    private String rearWindScreenRemarks;
    private int rearWindScreenCheckbox;

    private String headLightsLensesRemarks;
    private int headLightsCheckbox;

    private String tailLightsLensesRemarks;
    private int tailLightsCheckbox;

    private String wipersLensesRemarks;
    private int wiperLensesCheckbox;

    private String regNumberPlateRearRemarks;
    private int regNumberPlateRearCheckbox;

    private String rearBumperRearRemarks;
    private int rearBumperCheckbox;

    public Form3Entity(int id, String overallAppearanceRemarks, int overallAppearanceCheckbox, String sideMirrorsRemarks, int sideMirrorsCheckbox, String noOfKeysRemarks, int noOfKeysCheckbox, String fogSpotLightsRemarks, int fogSpotLightsCheckbox, String antennaAerialRemarks, int antennaAerialCheckbox, String regNoPlateFrontRemarks, int regNoPlateFrontCheckbox, String frontBumperRemarks, int frontBumperCheckbox, String fuelTankCapRemarks, int fuelTankCapCheckbox, String frontWindScreenRemarks, int frontWindScreenCheckbox, String rearWindScreenRemarks, int rearWindScreenCheckbox, String headLightsLensesRemarks, int headLightsCheckbox, String tailLightsLensesRemarks, int tailLightsCheckbox, String wipersLensesRemarks, int wiperLensesCheckbox, String regNumberPlateRearRemarks, int regNumberPlateRearCheckbox, String rearBumperRearRemarks, int rearBumperCheckbox) {
        this.id = id;
        this.overallAppearanceRemarks = overallAppearanceRemarks;
        this.overallAppearanceCheckbox = overallAppearanceCheckbox;
        this.sideMirrorsRemarks = sideMirrorsRemarks;
        this.sideMirrorsCheckbox = sideMirrorsCheckbox;
        this.noOfKeysRemarks = noOfKeysRemarks;
        this.noOfKeysCheckbox = noOfKeysCheckbox;
        this.fogSpotLightsRemarks = fogSpotLightsRemarks;
        this.fogSpotLightsCheckbox = fogSpotLightsCheckbox;
        this.antennaAerialRemarks = antennaAerialRemarks;
        this.antennaAerialCheckbox = antennaAerialCheckbox;
        this.regNoPlateFrontRemarks = regNoPlateFrontRemarks;
        this.regNoPlateFrontCheckbox = regNoPlateFrontCheckbox;
        this.frontBumperRemarks = frontBumperRemarks;
        this.frontBumperCheckbox = frontBumperCheckbox;
        this.fuelTankCapRemarks = fuelTankCapRemarks;
        this.fuelTankCapCheckbox = fuelTankCapCheckbox;
        this.frontWindScreenRemarks = frontWindScreenRemarks;
        this.frontWindScreenCheckbox = frontWindScreenCheckbox;
        this.rearWindScreenRemarks = rearWindScreenRemarks;
        this.rearWindScreenCheckbox = rearWindScreenCheckbox;
        this.headLightsLensesRemarks = headLightsLensesRemarks;
        this.headLightsCheckbox = headLightsCheckbox;
        this.tailLightsLensesRemarks = tailLightsLensesRemarks;
        this.tailLightsCheckbox = tailLightsCheckbox;
        this.wipersLensesRemarks = wipersLensesRemarks;
        this.wiperLensesCheckbox = wiperLensesCheckbox;
        this.regNumberPlateRearRemarks = regNumberPlateRearRemarks;
        this.regNumberPlateRearCheckbox = regNumberPlateRearCheckbox;
        this.rearBumperRearRemarks = rearBumperRearRemarks;
        this.rearBumperCheckbox = rearBumperCheckbox;
    }


    @Ignore
    public Form3Entity(String overallAppearanceRemarks, int overallAppearanceCheckbox, String sideMirrorsRemarks, int sideMirrorsCheckbox, String noOfKeysRemarks, int noOfKeysCheckbox, String fogSpotLightsRemarks, int fogSpotLightsCheckbox, String antennaAerialRemarks, int antennaAerialCheckbox, String regNoPlateFrontRemarks, int regNoPlateFrontCheckbox, String frontBumperRemarks, int frontBumperCheckbox, String fuelTankCapRemarks, int fuelTankCapCheckbox, String frontWindScreenRemarks, int frontWindScreenCheckbox, String rearWindScreenRemarks, int rearWindScreenCheckbox, String headLightsLensesRemarks, int headLightsCheckbox, String tailLightsLensesRemarks, int tailLightsCheckbox, String wipersLensesRemarks, int wiperLensesCheckbox, String regNumberPlateRearRemarks, int regNumberPlateRearCheckbox, String rearBumperRearRemarks, int rearBumperCheckbox) {
        this.overallAppearanceRemarks = overallAppearanceRemarks;
        this.overallAppearanceCheckbox = overallAppearanceCheckbox;
        this.sideMirrorsRemarks = sideMirrorsRemarks;
        this.sideMirrorsCheckbox = sideMirrorsCheckbox;
        this.noOfKeysRemarks = noOfKeysRemarks;
        this.noOfKeysCheckbox = noOfKeysCheckbox;
        this.fogSpotLightsRemarks = fogSpotLightsRemarks;
        this.fogSpotLightsCheckbox = fogSpotLightsCheckbox;
        this.antennaAerialRemarks = antennaAerialRemarks;
        this.antennaAerialCheckbox = antennaAerialCheckbox;
        this.regNoPlateFrontRemarks = regNoPlateFrontRemarks;
        this.regNoPlateFrontCheckbox = regNoPlateFrontCheckbox;
        this.frontBumperRemarks = frontBumperRemarks;
        this.frontBumperCheckbox = frontBumperCheckbox;
        this.fuelTankCapRemarks = fuelTankCapRemarks;
        this.fuelTankCapCheckbox = fuelTankCapCheckbox;
        this.frontWindScreenRemarks = frontWindScreenRemarks;
        this.frontWindScreenCheckbox = frontWindScreenCheckbox;
        this.rearWindScreenRemarks = rearWindScreenRemarks;
        this.rearWindScreenCheckbox = rearWindScreenCheckbox;
        this.headLightsLensesRemarks = headLightsLensesRemarks;
        this.headLightsCheckbox = headLightsCheckbox;
        this.tailLightsLensesRemarks = tailLightsLensesRemarks;
        this.tailLightsCheckbox = tailLightsCheckbox;
        this.wipersLensesRemarks = wipersLensesRemarks;
        this.wiperLensesCheckbox = wiperLensesCheckbox;
        this.regNumberPlateRearRemarks = regNumberPlateRearRemarks;
        this.regNumberPlateRearCheckbox = regNumberPlateRearCheckbox;
        this.rearBumperRearRemarks = rearBumperRearRemarks;
        this.rearBumperCheckbox = rearBumperCheckbox;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOverallAppearanceRemarks() {
        return overallAppearanceRemarks;
    }

    public void setOverallAppearanceRemarks(String overallAppearanceRemarks) {
        this.overallAppearanceRemarks = overallAppearanceRemarks;
    }

    public int getOverallAppearanceCheckbox() {
        return overallAppearanceCheckbox;
    }

    public void setOverallAppearanceCheckbox(int overallAppearanceCheckbox) {
        this.overallAppearanceCheckbox = overallAppearanceCheckbox;
    }

    public String getSideMirrorsRemarks() {
        return sideMirrorsRemarks;
    }

    public void setSideMirrorsRemarks(String sideMirrorsRemarks) {
        this.sideMirrorsRemarks = sideMirrorsRemarks;
    }

    public int getSideMirrorsCheckbox() {
        return sideMirrorsCheckbox;
    }

    public void setSideMirrorsCheckbox(int sideMirrorsCheckbox) {
        this.sideMirrorsCheckbox = sideMirrorsCheckbox;
    }

    public String getNoOfKeysRemarks() {
        return noOfKeysRemarks;
    }

    public void setNoOfKeysRemarks(String noOfKeysRemarks) {
        this.noOfKeysRemarks = noOfKeysRemarks;
    }

    public int getNoOfKeysCheckbox() {
        return noOfKeysCheckbox;
    }

    public void setNoOfKeysCheckbox(int noOfKeysCheckbox) {
        this.noOfKeysCheckbox = noOfKeysCheckbox;
    }

    public String getFogSpotLightsRemarks() {
        return fogSpotLightsRemarks;
    }

    public void setFogSpotLightsRemarks(String fogSpotLightsRemarks) {
        this.fogSpotLightsRemarks = fogSpotLightsRemarks;
    }

    public int getFogSpotLightsCheckbox() {
        return fogSpotLightsCheckbox;
    }

    public void setFogSpotLightsCheckbox(int fogSpotLightsCheckbox) {
        this.fogSpotLightsCheckbox = fogSpotLightsCheckbox;
    }

    public String getAntennaAerialRemarks() {
        return antennaAerialRemarks;
    }

    public void setAntennaAerialRemarks(String antennaAerialRemarks) {
        this.antennaAerialRemarks = antennaAerialRemarks;
    }

    public int getAntennaAerialCheckbox() {
        return antennaAerialCheckbox;
    }

    public void setAntennaAerialCheckbox(int antennaAerialCheckbox) {
        this.antennaAerialCheckbox = antennaAerialCheckbox;
    }

    public String getRegNoPlateFrontRemarks() {
        return regNoPlateFrontRemarks;
    }

    public void setRegNoPlateFrontRemarks(String regNoPlateFrontRemarks) {
        this.regNoPlateFrontRemarks = regNoPlateFrontRemarks;
    }

    public int getRegNoPlateFrontCheckbox() {
        return regNoPlateFrontCheckbox;
    }

    public void setRegNoPlateFrontCheckbox(int regNoPlateFrontCheckbox) {
        this.regNoPlateFrontCheckbox = regNoPlateFrontCheckbox;
    }

    public String getFrontBumperRemarks() {
        return frontBumperRemarks;
    }

    public void setFrontBumperRemarks(String frontBumperRemarks) {
        this.frontBumperRemarks = frontBumperRemarks;
    }

    public int getFrontBumperCheckbox() {
        return frontBumperCheckbox;
    }

    public void setFrontBumperCheckbox(int frontBumperCheckbox) {
        this.frontBumperCheckbox = frontBumperCheckbox;
    }

    public String getFuelTankCapRemarks() {
        return fuelTankCapRemarks;
    }

    public void setFuelTankCapRemarks(String fuelTankCapRemarks) {
        this.fuelTankCapRemarks = fuelTankCapRemarks;
    }

    public int getFuelTankCapCheckbox() {
        return fuelTankCapCheckbox;
    }

    public void setFuelTankCapCheckbox(int fuelTankCapCheckbox) {
        this.fuelTankCapCheckbox = fuelTankCapCheckbox;
    }

    public String getFrontWindScreenRemarks() {
        return frontWindScreenRemarks;
    }

    public void setFrontWindScreenRemarks(String frontWindScreenRemarks) {
        this.frontWindScreenRemarks = frontWindScreenRemarks;
    }

    public int getFrontWindScreenCheckbox() {
        return frontWindScreenCheckbox;
    }

    public void setFrontWindScreenCheckbox(int frontWindScreenCheckbox) {
        this.frontWindScreenCheckbox = frontWindScreenCheckbox;
    }

    public String getRearWindScreenRemarks() {
        return rearWindScreenRemarks;
    }

    public void setRearWindScreenRemarks(String rearWindScreenRemarks) {
        this.rearWindScreenRemarks = rearWindScreenRemarks;
    }

    public int getRearWindScreenCheckbox() {
        return rearWindScreenCheckbox;
    }

    public void setRearWindScreenCheckbox(int rearWindScreenCheckbox) {
        this.rearWindScreenCheckbox = rearWindScreenCheckbox;
    }

    public String getHeadLightsLensesRemarks() {
        return headLightsLensesRemarks;
    }

    public void setHeadLightsLensesRemarks(String headLightsLensesRemarks) {
        this.headLightsLensesRemarks = headLightsLensesRemarks;
    }

    public int getHeadLightsCheckbox() {
        return headLightsCheckbox;
    }

    public void setHeadLightsCheckbox(int headLightsCheckbox) {
        this.headLightsCheckbox = headLightsCheckbox;
    }

    public String getTailLightsLensesRemarks() {
        return tailLightsLensesRemarks;
    }

    public void setTailLightsLensesRemarks(String tailLightsLensesRemarks) {
        this.tailLightsLensesRemarks = tailLightsLensesRemarks;
    }

    public int getTailLightsCheckbox() {
        return tailLightsCheckbox;
    }

    public void setTailLightsCheckbox(int tailLightsCheckbox) {
        this.tailLightsCheckbox = tailLightsCheckbox;
    }

    public String getWipersLensesRemarks() {
        return wipersLensesRemarks;
    }

    public void setWipersLensesRemarks(String wipersLensesRemarks) {
        this.wipersLensesRemarks = wipersLensesRemarks;
    }

    public int getWiperLensesCheckbox() {
        return wiperLensesCheckbox;
    }

    public void setWiperLensesCheckbox(int wiperLensesCheckbox) {
        this.wiperLensesCheckbox = wiperLensesCheckbox;
    }

    public String getRegNumberPlateRearRemarks() {
        return regNumberPlateRearRemarks;
    }

    public void setRegNumberPlateRearRemarks(String regNumberPlateRearRemarks) {
        this.regNumberPlateRearRemarks = regNumberPlateRearRemarks;
    }

    public int getRegNumberPlateRearCheckbox() {
        return regNumberPlateRearCheckbox;
    }

    public void setRegNumberPlateRearCheckbox(int regNumberPlateRearCheckbox) {
        this.regNumberPlateRearCheckbox = regNumberPlateRearCheckbox;
    }

    public String getRearBumperRearRemarks() {
        return rearBumperRearRemarks;
    }

    public void setRearBumperRearRemarks(String rearBumperRearRemarks) {
        this.rearBumperRearRemarks = rearBumperRearRemarks;
    }

    public int getRearBumperCheckbox() {
        return rearBumperCheckbox;
    }

    public void setRearBumperCheckbox(int rearBumperCheckbox) {
        this.rearBumperCheckbox = rearBumperCheckbox;
    }
}
