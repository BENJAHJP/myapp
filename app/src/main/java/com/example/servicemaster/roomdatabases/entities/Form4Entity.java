package com.example.servicemaster.roomdatabases.entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Form4")
public class Form4Entity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String rearViewMirrorRemarks;
    private boolean rearViewMirrorCheckbox;

    private String windowSwitchesRemarks;
    private boolean windowSwitchesCheckbox;

    private String floorMatsCarpetRemarks;
    private boolean floorMatsCarpetCheckbox;

    private String dashboardRemarks;
    private boolean dashboardCheckbox;

    private String engineSensorsAndFusesRemarks;
    private boolean engineSensorsAndFusesCheckbox;

    private String washerBottlesRemarks;
    private boolean washerBottlesCheckbox;

    private String cigarLighterRemarks;
    private boolean cigarLighterCheckbox;

    private String speakerRemarks;
    private boolean speakerCheckbox;

    private String radioCassetteCdRemarks;
    private boolean radioCassetteCdCheckbox;

    private String engineCompartmentRemarks;
    private boolean engineCompartmentCheckbox;

    private String computerBoxRemarks;
    private boolean computerBoxCheckbox;

    private String hornRemarks;
    private boolean hornCheckbox;

    public Form4Entity(int id, String rearViewMirrorRemarks, boolean rearViewMirrorCheckbox, String windowSwitchesRemarks, boolean windowSwitchesCheckbox, String floorMatsCarpetRemarks, boolean floorMatsCarpetCheckbox, String dashboardRemarks, boolean dashboardCheckbox, String engineSensorsAndFusesRemarks, boolean engineSensorsAndFusesCheckbox, String washerBottlesRemarks, boolean washerBottlesCheckbox, String cigarLighterRemarks, boolean cigarLighterCheckbox, String speakerRemarks, boolean speakerCheckbox, String radioCassetteCdRemarks, boolean radioCassetteCdCheckbox, String engineCompartmentRemarks, boolean engineCompartmentCheckbox, String computerBoxRemarks, boolean computerBoxCheckbox, String hornRemarks, boolean hornCheckbox) {
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
    public Form4Entity(String rearViewMirrorRemarks, boolean rearViewMirrorCheckbox, String windowSwitchesRemarks, boolean windowSwitchesCheckbox, String floorMatsCarpetRemarks, boolean floorMatsCarpetCheckbox, String dashboardRemarks, boolean dashboardCheckbox, String engineSensorsAndFusesRemarks, boolean engineSensorsAndFusesCheckbox, String washerBottlesRemarks, boolean washerBottlesCheckbox, String cigarLighterRemarks, boolean cigarLighterCheckbox, String speakerRemarks, boolean speakerCheckbox, String radioCassetteCdRemarks, boolean radioCassetteCdCheckbox, String engineCompartmentRemarks, boolean engineCompartmentCheckbox, String computerBoxRemarks, boolean computerBoxCheckbox, String hornRemarks, boolean hornCheckbox) {
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

    public boolean isRearViewMirrorCheckbox() {
        return rearViewMirrorCheckbox;
    }

    public void setRearViewMirrorCheckbox(boolean rearViewMirrorCheckbox) {
        this.rearViewMirrorCheckbox = rearViewMirrorCheckbox;
    }

    public String getWindowSwitchesRemarks() {
        return windowSwitchesRemarks;
    }

    public void setWindowSwitchesRemarks(String windowSwitchesRemarks) {
        this.windowSwitchesRemarks = windowSwitchesRemarks;
    }

    public boolean isWindowSwitchesCheckbox() {
        return windowSwitchesCheckbox;
    }

    public void setWindowSwitchesCheckbox(boolean windowSwitchesCheckbox) {
        this.windowSwitchesCheckbox = windowSwitchesCheckbox;
    }

    public String getFloorMatsCarpetRemarks() {
        return floorMatsCarpetRemarks;
    }

    public void setFloorMatsCarpetRemarks(String floorMatsCarpetRemarks) {
        this.floorMatsCarpetRemarks = floorMatsCarpetRemarks;
    }

    public boolean isFloorMatsCarpetCheckbox() {
        return floorMatsCarpetCheckbox;
    }

    public void setFloorMatsCarpetCheckbox(boolean floorMatsCarpetCheckbox) {
        this.floorMatsCarpetCheckbox = floorMatsCarpetCheckbox;
    }

    public String getDashboardRemarks() {
        return dashboardRemarks;
    }

    public void setDashboardRemarks(String dashboardRemarks) {
        this.dashboardRemarks = dashboardRemarks;
    }

    public boolean isDashboardCheckbox() {
        return dashboardCheckbox;
    }

    public void setDashboardCheckbox(boolean dashboardCheckbox) {
        this.dashboardCheckbox = dashboardCheckbox;
    }

    public String getEngineSensorsAndFusesRemarks() {
        return engineSensorsAndFusesRemarks;
    }

    public void setEngineSensorsAndFusesRemarks(String engineSensorsAndFusesRemarks) {
        this.engineSensorsAndFusesRemarks = engineSensorsAndFusesRemarks;
    }

    public boolean isEngineSensorsAndFusesCheckbox() {
        return engineSensorsAndFusesCheckbox;
    }

    public void setEngineSensorsAndFusesCheckbox(boolean engineSensorsAndFusesCheckbox) {
        this.engineSensorsAndFusesCheckbox = engineSensorsAndFusesCheckbox;
    }

    public String getWasherBottlesRemarks() {
        return washerBottlesRemarks;
    }

    public void setWasherBottlesRemarks(String washerBottlesRemarks) {
        this.washerBottlesRemarks = washerBottlesRemarks;
    }

    public boolean isWasherBottlesCheckbox() {
        return washerBottlesCheckbox;
    }

    public void setWasherBottlesCheckbox(boolean washerBottlesCheckbox) {
        this.washerBottlesCheckbox = washerBottlesCheckbox;
    }

    public String getCigarLighterRemarks() {
        return cigarLighterRemarks;
    }

    public void setCigarLighterRemarks(String cigarLighterRemarks) {
        this.cigarLighterRemarks = cigarLighterRemarks;
    }

    public boolean isCigarLighterCheckbox() {
        return cigarLighterCheckbox;
    }

    public void setCigarLighterCheckbox(boolean cigarLighterCheckbox) {
        this.cigarLighterCheckbox = cigarLighterCheckbox;
    }

    public String getSpeakerRemarks() {
        return speakerRemarks;
    }

    public void setSpeakerRemarks(String speakerRemarks) {
        this.speakerRemarks = speakerRemarks;
    }

    public boolean isSpeakerCheckbox() {
        return speakerCheckbox;
    }

    public void setSpeakerCheckbox(boolean speakerCheckbox) {
        this.speakerCheckbox = speakerCheckbox;
    }

    public String getRadioCassetteCdRemarks() {
        return radioCassetteCdRemarks;
    }

    public void setRadioCassetteCdRemarks(String radioCassetteCdRemarks) {
        this.radioCassetteCdRemarks = radioCassetteCdRemarks;
    }

    public boolean isRadioCassetteCdCheckbox() {
        return radioCassetteCdCheckbox;
    }

    public void setRadioCassetteCdCheckbox(boolean radioCassetteCdCheckbox) {
        this.radioCassetteCdCheckbox = radioCassetteCdCheckbox;
    }

    public String getEngineCompartmentRemarks() {
        return engineCompartmentRemarks;
    }

    public void setEngineCompartmentRemarks(String engineCompartmentRemarks) {
        this.engineCompartmentRemarks = engineCompartmentRemarks;
    }

    public boolean isEngineCompartmentCheckbox() {
        return engineCompartmentCheckbox;
    }

    public void setEngineCompartmentCheckbox(boolean engineCompartmentCheckbox) {
        this.engineCompartmentCheckbox = engineCompartmentCheckbox;
    }

    public String getComputerBoxRemarks() {
        return computerBoxRemarks;
    }

    public void setComputerBoxRemarks(String computerBoxRemarks) {
        this.computerBoxRemarks = computerBoxRemarks;
    }

    public boolean isComputerBoxCheckbox() {
        return computerBoxCheckbox;
    }

    public void setComputerBoxCheckbox(boolean computerBoxCheckbox) {
        this.computerBoxCheckbox = computerBoxCheckbox;
    }

    public String getHornRemarks() {
        return hornRemarks;
    }

    public void setHornRemarks(String hornRemarks) {
        this.hornRemarks = hornRemarks;
    }

    public boolean isHornCheckbox() {
        return hornCheckbox;
    }

    public void setHornCheckbox(boolean hornCheckbox) {
        this.hornCheckbox = hornCheckbox;
    }
}
