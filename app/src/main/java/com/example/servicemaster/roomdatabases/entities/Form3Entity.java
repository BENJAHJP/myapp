package com.example.servicemaster.roomdatabases.entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Form3")
public class Form3Entity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String overallAppearanceRemarks;
    private boolean overallAppearanceCheckbox;

    private String sideMirrorsRemarks;
    private boolean sideMirrorsCheckbox;

    private String noOfKeysRemarks;
    private boolean noOfKeysCheckbox;

    private String fogSpotLightsRemarks;
    private boolean fogSpotLightsCheckbox;

    private String antennaAerialRemarks;
    private boolean antennaAerialCheckbox;

    private String regNoPlateFrontRemarks;
    private boolean regNoPlateFrontCheckbox;

    private String frontBumperRemarks;
    private boolean frontBumperCheckbox;

    private String fuelTankCapRemarks;
    private boolean fuelTankCapCheckbox;

    private String frontWindScreenRemarks;
    private boolean frontWindScreenCheckbox;

    private String rearWindScreenRemarks;
    private boolean rearWindScreenCheckbox;

    private String headLightsLensesRemarks;
    private boolean headLightsCheckbox;

    private String tailLightsLensesRemarks;
    private boolean tailLightsCheckbox;

    private String wipersLensesRemarks;
    private boolean wiperLensesCheckbox;

    private String regNumberPlateRearRemarks;
    private boolean regNumberPlateRearCheckbox;

    private String rearBumperRearRemarks;
    private boolean rearBumperCheckbox;

    public Form3Entity(int id, String overallAppearanceRemarks, boolean overallAppearanceCheckbox, String sideMirrorsRemarks, boolean sideMirrorsCheckbox, String noOfKeysRemarks, boolean noOfKeysCheckbox, String fogSpotLightsRemarks, boolean fogSpotLightsCheckbox, String antennaAerialRemarks, boolean antennaAerialCheckbox, String regNoPlateFrontRemarks, boolean regNoPlateFrontCheckbox, String frontBumperRemarks, boolean frontBumperCheckbox, String fuelTankCapRemarks, boolean fuelTankCapCheckbox, String frontWindScreenRemarks, boolean frontWindScreenCheckbox, String rearWindScreenRemarks, boolean rearWindScreenCheckbox, String headLightsLensesRemarks, boolean headLightsCheckbox, String tailLightsLensesRemarks, boolean tailLightsCheckbox, String wipersLensesRemarks, boolean wiperLensesCheckbox, String regNumberPlateRearRemarks, boolean regNumberPlateRearCheckbox, String rearBumperRearRemarks, boolean rearBumperCheckbox) {
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

    public Form3Entity(String overallAppearanceRemarks, boolean overallAppearanceCheckbox, String sideMirrorsRemarks, boolean sideMirrorsCheckbox, String noOfKeysRemarks, boolean noOfKeysCheckbox, String fogSpotLightsRemarks, boolean fogSpotLightsCheckbox, String antennaAerialRemarks, boolean antennaAerialCheckbox, String regNoPlateFrontRemarks, boolean regNoPlateFrontCheckbox, String frontBumperRemarks, boolean frontBumperCheckbox, String fuelTankCapRemarks, boolean fuelTankCapCheckbox, String frontWindScreenRemarks, boolean frontWindScreenCheckbox, String rearWindScreenRemarks, boolean rearWindScreenCheckbox, String headLightsLensesRemarks, boolean headLightsCheckbox, String tailLightsLensesRemarks, boolean tailLightsCheckbox, String wipersLensesRemarks, boolean wiperLensesCheckbox, String regNumberPlateRearRemarks, boolean regNumberPlateRearCheckbox, String rearBumperRearRemarks, boolean rearBumperCheckbox) {
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

    public boolean isOverallAppearanceCheckbox() {
        return overallAppearanceCheckbox;
    }

    public void setOverallAppearanceCheckbox(boolean overallAppearanceCheckbox) {
        this.overallAppearanceCheckbox = overallAppearanceCheckbox;
    }

    public String getSideMirrorsRemarks() {
        return sideMirrorsRemarks;
    }

    public void setSideMirrorsRemarks(String sideMirrorsRemarks) {
        this.sideMirrorsRemarks = sideMirrorsRemarks;
    }

    public boolean isSideMirrorsCheckbox() {
        return sideMirrorsCheckbox;
    }

    public void setSideMirrorsCheckbox(boolean sideMirrorsCheckbox) {
        this.sideMirrorsCheckbox = sideMirrorsCheckbox;
    }

    public String getNoOfKeysRemarks() {
        return noOfKeysRemarks;
    }

    public void setNoOfKeysRemarks(String noOfKeysRemarks) {
        this.noOfKeysRemarks = noOfKeysRemarks;
    }

    public boolean isNoOfKeysCheckbox() {
        return noOfKeysCheckbox;
    }

    public void setNoOfKeysCheckbox(boolean noOfKeysCheckbox) {
        this.noOfKeysCheckbox = noOfKeysCheckbox;
    }

    public String getFogSpotLightsRemarks() {
        return fogSpotLightsRemarks;
    }

    public void setFogSpotLightsRemarks(String fogSpotLightsRemarks) {
        this.fogSpotLightsRemarks = fogSpotLightsRemarks;
    }

    public boolean isFogSpotLightsCheckbox() {
        return fogSpotLightsCheckbox;
    }

    public void setFogSpotLightsCheckbox(boolean fogSpotLightsCheckbox) {
        this.fogSpotLightsCheckbox = fogSpotLightsCheckbox;
    }

    public String getAntennaAerialRemarks() {
        return antennaAerialRemarks;
    }

    public void setAntennaAerialRemarks(String antennaAerialRemarks) {
        this.antennaAerialRemarks = antennaAerialRemarks;
    }

    public boolean isAntennaAerialCheckbox() {
        return antennaAerialCheckbox;
    }

    public void setAntennaAerialCheckbox(boolean antennaAerialCheckbox) {
        this.antennaAerialCheckbox = antennaAerialCheckbox;
    }

    public String getRegNoPlateFrontRemarks() {
        return regNoPlateFrontRemarks;
    }

    public void setRegNoPlateFrontRemarks(String regNoPlateFrontRemarks) {
        this.regNoPlateFrontRemarks = regNoPlateFrontRemarks;
    }

    public boolean isRegNoPlateFrontCheckbox() {
        return regNoPlateFrontCheckbox;
    }

    public void setRegNoPlateFrontCheckbox(boolean regNoPlateFrontCheckbox) {
        this.regNoPlateFrontCheckbox = regNoPlateFrontCheckbox;
    }

    public String getFrontBumperRemarks() {
        return frontBumperRemarks;
    }

    public void setFrontBumperRemarks(String frontBumperRemarks) {
        this.frontBumperRemarks = frontBumperRemarks;
    }

    public boolean isFrontBumperCheckbox() {
        return frontBumperCheckbox;
    }

    public void setFrontBumperCheckbox(boolean frontBumperCheckbox) {
        this.frontBumperCheckbox = frontBumperCheckbox;
    }

    public String getFuelTankCapRemarks() {
        return fuelTankCapRemarks;
    }

    public void setFuelTankCapRemarks(String fuelTankCapRemarks) {
        this.fuelTankCapRemarks = fuelTankCapRemarks;
    }

    public boolean isFuelTankCapCheckbox() {
        return fuelTankCapCheckbox;
    }

    public void setFuelTankCapCheckbox(boolean fuelTankCapCheckbox) {
        this.fuelTankCapCheckbox = fuelTankCapCheckbox;
    }

    public String getFrontWindScreenRemarks() {
        return frontWindScreenRemarks;
    }

    public void setFrontWindScreenRemarks(String frontWindScreenRemarks) {
        this.frontWindScreenRemarks = frontWindScreenRemarks;
    }

    public boolean isFrontWindScreenCheckbox() {
        return frontWindScreenCheckbox;
    }

    public void setFrontWindScreenCheckbox(boolean frontWindScreenCheckbox) {
        this.frontWindScreenCheckbox = frontWindScreenCheckbox;
    }

    public String getRearWindScreenRemarks() {
        return rearWindScreenRemarks;
    }

    public void setRearWindScreenRemarks(String rearWindScreenRemarks) {
        this.rearWindScreenRemarks = rearWindScreenRemarks;
    }

    public boolean isRearWindScreenCheckbox() {
        return rearWindScreenCheckbox;
    }

    public void setRearWindScreenCheckbox(boolean rearWindScreenCheckbox) {
        this.rearWindScreenCheckbox = rearWindScreenCheckbox;
    }

    public String getHeadLightsLensesRemarks() {
        return headLightsLensesRemarks;
    }

    public void setHeadLightsLensesRemarks(String headLightsLensesRemarks) {
        this.headLightsLensesRemarks = headLightsLensesRemarks;
    }

    public boolean isHeadLightsCheckbox() {
        return headLightsCheckbox;
    }

    public void setHeadLightsCheckbox(boolean headLightsCheckbox) {
        this.headLightsCheckbox = headLightsCheckbox;
    }

    public String getTailLightsLensesRemarks() {
        return tailLightsLensesRemarks;
    }

    public void setTailLightsLensesRemarks(String tailLightsLensesRemarks) {
        this.tailLightsLensesRemarks = tailLightsLensesRemarks;
    }

    public boolean isTailLightsCheckbox() {
        return tailLightsCheckbox;
    }

    public void setTailLightsCheckbox(boolean tailLightsCheckbox) {
        this.tailLightsCheckbox = tailLightsCheckbox;
    }

    public String getWipersLensesRemarks() {
        return wipersLensesRemarks;
    }

    public void setWipersLensesRemarks(String wipersLensesRemarks) {
        this.wipersLensesRemarks = wipersLensesRemarks;
    }

    public boolean isWiperLensesCheckbox() {
        return wiperLensesCheckbox;
    }

    public void setWiperLensesCheckbox(boolean wiperLensesCheckbox) {
        this.wiperLensesCheckbox = wiperLensesCheckbox;
    }

    public String getRegNumberPlateRearRemarks() {
        return regNumberPlateRearRemarks;
    }

    public void setRegNumberPlateRearRemarks(String regNumberPlateRearRemarks) {
        this.regNumberPlateRearRemarks = regNumberPlateRearRemarks;
    }

    public boolean isRegNumberPlateRearCheckbox() {
        return regNumberPlateRearCheckbox;
    }

    public void setRegNumberPlateRearCheckbox(boolean regNumberPlateRearCheckbox) {
        this.regNumberPlateRearCheckbox = regNumberPlateRearCheckbox;
    }

    public String getRearBumperRearRemarks() {
        return rearBumperRearRemarks;
    }

    public void setRearBumperRearRemarks(String rearBumperRearRemarks) {
        this.rearBumperRearRemarks = rearBumperRearRemarks;
    }

    public boolean isRearBumperCheckbox() {
        return rearBumperCheckbox;
    }

    public void setRearBumperCheckbox(boolean rearBumperCheckbox) {
        this.rearBumperCheckbox = rearBumperCheckbox;
    }
}
