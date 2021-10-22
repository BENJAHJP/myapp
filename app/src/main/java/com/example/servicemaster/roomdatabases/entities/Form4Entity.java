package com.example.servicemaster.roomdatabases.entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Form4")
public class Form4Entity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String rearViewMirrorRemarks;
    private int rearViewMirrorCheckbox;

    private String windowSwitchesRemarks;
    private int windowSwitchesCheckbox;

    private String floorMatsCarpetRemarks;
    private int floorMatsCarpetCheckbox;

    private String dashboardRemarks;
    private int dashboardCheckbox;

    private String engineSensorsAndFusesRemarks;
    private int engineSensorsAndFusesCheckbox;

    private String washerBottlesRemarks;
    private int washerBottlesCheckbox;

    private String cigarLighterRemarks;
    private int cigarLighterCheckbox;

    private String speakerRemarks;
    private int speakerCheckbox;

    private String radioCassetteCdRemarks;
    private int radioCassetteCdCheckbox;

    private String engineCompartmentRemarks;
    private int engineCompartmentCheckbox;

    private String computerBoxRemarks;
    private int computerBoxCheckbox;

    private String hornRemarks;
    private int hornCheckbox;

    public Form4Entity(int id, String rearViewMirrorRemarks, int rearViewMirrorCheckbox, String windowSwitchesRemarks, int windowSwitchesCheckbox, String floorMatsCarpetRemarks, int floorMatsCarpetCheckbox, String dashboardRemarks, int dashboardCheckbox, String engineSensorsAndFusesRemarks, int engineSensorsAndFusesCheckbox, String washerBottlesRemarks, int washerBottlesCheckbox, String cigarLighterRemarks, int cigarLighterCheckbox, String speakerRemarks, int speakerCheckbox, String radioCassetteCdRemarks, int radioCassetteCdCheckbox, String engineCompartmentRemarks, int engineCompartmentCheckbox, String computerBoxRemarks, int computerBoxCheckbox, String hornRemarks, int hornCheckbox) {
        this.id = id;
        this.rearViewMirrorRemarks = rearViewMirrorRemarks;
        this.rearViewMirrorCheckbox = rearViewMirrorCheckbox;
        this.windowSwitchesRemarks = windowSwitchesRemarks;
        this.windowSwitchesCheckbox = windowSwitchesCheckbox;
        this.floorMatsCarpetRemarks = floorMatsCarpetRemarks;
        this.floorMatsCarpetCheckbox = floorMatsCarpetCheckbox;
        this.dashboardRemarks = dashboardRemarks;
        this.dashboardCheckbox = dashboardCheckbox;
        this.engineSensorsAndFusesRemarks = engineSensorsAndFusesRemarks;
        this.engineSensorsAndFusesCheckbox = engineSensorsAndFusesCheckbox;
        this.washerBottlesRemarks = washerBottlesRemarks;
        this.washerBottlesCheckbox = washerBottlesCheckbox;
        this.cigarLighterRemarks = cigarLighterRemarks;
        this.cigarLighterCheckbox = cigarLighterCheckbox;
        this.speakerRemarks = speakerRemarks;
        this.speakerCheckbox = speakerCheckbox;
        this.radioCassetteCdRemarks = radioCassetteCdRemarks;
        this.radioCassetteCdCheckbox = radioCassetteCdCheckbox;
        this.engineCompartmentRemarks = engineCompartmentRemarks;
        this.engineCompartmentCheckbox = engineCompartmentCheckbox;
        this.computerBoxRemarks = computerBoxRemarks;
        this.computerBoxCheckbox = computerBoxCheckbox;
        this.hornRemarks = hornRemarks;
        this.hornCheckbox = hornCheckbox;
    }

    @Ignore
    public Form4Entity(String rearViewMirrorRemarks, int rearViewMirrorCheckbox, String windowSwitchesRemarks, int windowSwitchesCheckbox, String floorMatsCarpetRemarks, int floorMatsCarpetCheckbox, String dashboardRemarks, int dashboardCheckbox, String engineSensorsAndFusesRemarks, int engineSensorsAndFusesCheckbox, String washerBottlesRemarks, int washerBottlesCheckbox, String cigarLighterRemarks, int cigarLighterCheckbox, String speakerRemarks, int speakerCheckbox, String radioCassetteCdRemarks, int radioCassetteCdCheckbox, String engineCompartmentRemarks, int engineCompartmentCheckbox, String computerBoxRemarks, int computerBoxCheckbox, String hornRemarks, int hornCheckbox) {
        this.rearViewMirrorRemarks = rearViewMirrorRemarks;
        this.rearViewMirrorCheckbox = rearViewMirrorCheckbox;
        this.windowSwitchesRemarks = windowSwitchesRemarks;
        this.windowSwitchesCheckbox = windowSwitchesCheckbox;
        this.floorMatsCarpetRemarks = floorMatsCarpetRemarks;
        this.floorMatsCarpetCheckbox = floorMatsCarpetCheckbox;
        this.dashboardRemarks = dashboardRemarks;
        this.dashboardCheckbox = dashboardCheckbox;
        this.engineSensorsAndFusesRemarks = engineSensorsAndFusesRemarks;
        this.engineSensorsAndFusesCheckbox = engineSensorsAndFusesCheckbox;
        this.washerBottlesRemarks = washerBottlesRemarks;
        this.washerBottlesCheckbox = washerBottlesCheckbox;
        this.cigarLighterRemarks = cigarLighterRemarks;
        this.cigarLighterCheckbox = cigarLighterCheckbox;
        this.speakerRemarks = speakerRemarks;
        this.speakerCheckbox = speakerCheckbox;
        this.radioCassetteCdRemarks = radioCassetteCdRemarks;
        this.radioCassetteCdCheckbox = radioCassetteCdCheckbox;
        this.engineCompartmentRemarks = engineCompartmentRemarks;
        this.engineCompartmentCheckbox = engineCompartmentCheckbox;
        this.computerBoxRemarks = computerBoxRemarks;
        this.computerBoxCheckbox = computerBoxCheckbox;
        this.hornRemarks = hornRemarks;
        this.hornCheckbox = hornCheckbox;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRearViewMirrorRemarks() {
        return rearViewMirrorRemarks;
    }

    public void setRearViewMirrorRemarks(String rearViewMirrorRemarks) {
        this.rearViewMirrorRemarks = rearViewMirrorRemarks;
    }

    public int getRearViewMirrorCheckbox() {
        return rearViewMirrorCheckbox;
    }

    public void setRearViewMirrorCheckbox(int rearViewMirrorCheckbox) {
        this.rearViewMirrorCheckbox = rearViewMirrorCheckbox;
    }

    public String getWindowSwitchesRemarks() {
        return windowSwitchesRemarks;
    }

    public void setWindowSwitchesRemarks(String windowSwitchesRemarks) {
        this.windowSwitchesRemarks = windowSwitchesRemarks;
    }

    public int getWindowSwitchesCheckbox() {
        return windowSwitchesCheckbox;
    }

    public void setWindowSwitchesCheckbox(int windowSwitchesCheckbox) {
        this.windowSwitchesCheckbox = windowSwitchesCheckbox;
    }

    public String getFloorMatsCarpetRemarks() {
        return floorMatsCarpetRemarks;
    }

    public void setFloorMatsCarpetRemarks(String floorMatsCarpetRemarks) {
        this.floorMatsCarpetRemarks = floorMatsCarpetRemarks;
    }

    public int getFloorMatsCarpetCheckbox() {
        return floorMatsCarpetCheckbox;
    }

    public void setFloorMatsCarpetCheckbox(int floorMatsCarpetCheckbox) {
        this.floorMatsCarpetCheckbox = floorMatsCarpetCheckbox;
    }

    public String getDashboardRemarks() {
        return dashboardRemarks;
    }

    public void setDashboardRemarks(String dashboardRemarks) {
        this.dashboardRemarks = dashboardRemarks;
    }

    public int getDashboardCheckbox() {
        return dashboardCheckbox;
    }

    public void setDashboardCheckbox(int dashboardCheckbox) {
        this.dashboardCheckbox = dashboardCheckbox;
    }

    public String getEngineSensorsAndFusesRemarks() {
        return engineSensorsAndFusesRemarks;
    }

    public void setEngineSensorsAndFusesRemarks(String engineSensorsAndFusesRemarks) {
        this.engineSensorsAndFusesRemarks = engineSensorsAndFusesRemarks;
    }

    public int getEngineSensorsAndFusesCheckbox() {
        return engineSensorsAndFusesCheckbox;
    }

    public void setEngineSensorsAndFusesCheckbox(int engineSensorsAndFusesCheckbox) {
        this.engineSensorsAndFusesCheckbox = engineSensorsAndFusesCheckbox;
    }

    public String getWasherBottlesRemarks() {
        return washerBottlesRemarks;
    }

    public void setWasherBottlesRemarks(String washerBottlesRemarks) {
        this.washerBottlesRemarks = washerBottlesRemarks;
    }

    public int getWasherBottlesCheckbox() {
        return washerBottlesCheckbox;
    }

    public void setWasherBottlesCheckbox(int washerBottlesCheckbox) {
        this.washerBottlesCheckbox = washerBottlesCheckbox;
    }

    public String getCigarLighterRemarks() {
        return cigarLighterRemarks;
    }

    public void setCigarLighterRemarks(String cigarLighterRemarks) {
        this.cigarLighterRemarks = cigarLighterRemarks;
    }

    public int getCigarLighterCheckbox() {
        return cigarLighterCheckbox;
    }

    public void setCigarLighterCheckbox(int cigarLighterCheckbox) {
        this.cigarLighterCheckbox = cigarLighterCheckbox;
    }

    public String getSpeakerRemarks() {
        return speakerRemarks;
    }

    public void setSpeakerRemarks(String speakerRemarks) {
        this.speakerRemarks = speakerRemarks;
    }

    public int getSpeakerCheckbox() {
        return speakerCheckbox;
    }

    public void setSpeakerCheckbox(int speakerCheckbox) {
        this.speakerCheckbox = speakerCheckbox;
    }

    public String getRadioCassetteCdRemarks() {
        return radioCassetteCdRemarks;
    }

    public void setRadioCassetteCdRemarks(String radioCassetteCdRemarks) {
        this.radioCassetteCdRemarks = radioCassetteCdRemarks;
    }

    public int getRadioCassetteCdCheckbox() {
        return radioCassetteCdCheckbox;
    }

    public void setRadioCassetteCdCheckbox(int radioCassetteCdCheckbox) {
        this.radioCassetteCdCheckbox = radioCassetteCdCheckbox;
    }

    public String getEngineCompartmentRemarks() {
        return engineCompartmentRemarks;
    }

    public void setEngineCompartmentRemarks(String engineCompartmentRemarks) {
        this.engineCompartmentRemarks = engineCompartmentRemarks;
    }

    public int getEngineCompartmentCheckbox() {
        return engineCompartmentCheckbox;
    }

    public void setEngineCompartmentCheckbox(int engineCompartmentCheckbox) {
        this.engineCompartmentCheckbox = engineCompartmentCheckbox;
    }

    public String getComputerBoxRemarks() {
        return computerBoxRemarks;
    }

    public void setComputerBoxRemarks(String computerBoxRemarks) {
        this.computerBoxRemarks = computerBoxRemarks;
    }

    public int getComputerBoxCheckbox() {
        return computerBoxCheckbox;
    }

    public void setComputerBoxCheckbox(int computerBoxCheckbox) {
        this.computerBoxCheckbox = computerBoxCheckbox;
    }

    public String getHornRemarks() {
        return hornRemarks;
    }

    public void setHornRemarks(String hornRemarks) {
        this.hornRemarks = hornRemarks;
    }

    public int getHornCheckbox() {
        return hornCheckbox;
    }

    public void setHornCheckbox(int hornCheckbox) {
        this.hornCheckbox = hornCheckbox;
    }
}
