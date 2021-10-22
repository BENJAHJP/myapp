package com.example.servicemaster.roomdatabases.entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Form7")
public class Form7Entity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String jackAndHandlerRemarks;
    private int jackAndHandlerCheckbox;

    private String lifeSaversRemarks;
    private int lifeSaversCheckbox;

    private String spacialNutRemarks;
    private int spacialNutCheckbox;

    private String towingPinRemarks;
    private int towingPinCheckbox;

    private String jumperCablesRemarks;
    private int jumperCablesCheckbox;

    private String wheelSpannerRemarks;
    private int wheelSpannerCheckbox;

    private String fireExtinguisherRemarks;
    private int fireExtinguisherCheckbox;

    private String firstAidKitRemarks;
    private int firstAidKitCheckbox;

    private String towingRopeRemarks;
    private int towingRopeCheckbox;

    private String ownersManualRemarks;
    private int ownersManualCheckbox;

    public Form7Entity(int id, String jackAndHandlerRemarks, int jackAndHandlerCheckbox, String lifeSaversRemarks, int lifeSaversCheckbox, String spacialNutRemarks, int spacialNutCheckbox, String towingPinRemarks, int towingPinCheckbox, String jumperCablesRemarks, int jumperCablesCheckbox, String wheelSpannerRemarks, int wheelSpannerCheckbox, String fireExtinguisherRemarks, int fireExtinguisherCheckbox, String firstAidKitRemarks, int firstAidKitCheckbox, String towingRopeRemarks, int towingRopeCheckbox, String ownersManualRemarks, int ownersManualCheckbox) {
        this.id = id;
        this.jackAndHandlerRemarks = jackAndHandlerRemarks;
        this.jackAndHandlerCheckbox = jackAndHandlerCheckbox;
        this.lifeSaversRemarks = lifeSaversRemarks;
        this.lifeSaversCheckbox = lifeSaversCheckbox;
        this.spacialNutRemarks = spacialNutRemarks;
        this.spacialNutCheckbox = spacialNutCheckbox;
        this.towingPinRemarks = towingPinRemarks;
        this.towingPinCheckbox = towingPinCheckbox;
        this.jumperCablesRemarks = jumperCablesRemarks;
        this.jumperCablesCheckbox = jumperCablesCheckbox;
        this.wheelSpannerRemarks = wheelSpannerRemarks;
        this.wheelSpannerCheckbox = wheelSpannerCheckbox;
        this.fireExtinguisherRemarks = fireExtinguisherRemarks;
        this.fireExtinguisherCheckbox = fireExtinguisherCheckbox;
        this.firstAidKitRemarks = firstAidKitRemarks;
        this.firstAidKitCheckbox = firstAidKitCheckbox;
        this.towingRopeRemarks = towingRopeRemarks;
        this.towingRopeCheckbox = towingRopeCheckbox;
        this.ownersManualRemarks = ownersManualRemarks;
        this.ownersManualCheckbox = ownersManualCheckbox;
    }

    @Ignore
    public Form7Entity(String jackAndHandlerRemarks, int jackAndHandlerCheckbox, String lifeSaversRemarks, int lifeSaversCheckbox, String spacialNutRemarks, int spacialNutCheckbox, String towingPinRemarks, int towingPinCheckbox, String jumperCablesRemarks, int jumperCablesCheckbox, String wheelSpannerRemarks, int wheelSpannerCheckbox, String fireExtinguisherRemarks, int fireExtinguisherCheckbox, String firstAidKitRemarks, int firstAidKitCheckbox, String towingRopeRemarks, int towingRopeCheckbox, String ownersManualRemarks, int ownersManualCheckbox) {
        this.jackAndHandlerRemarks = jackAndHandlerRemarks;
        this.jackAndHandlerCheckbox = jackAndHandlerCheckbox;
        this.lifeSaversRemarks = lifeSaversRemarks;
        this.lifeSaversCheckbox = lifeSaversCheckbox;
        this.spacialNutRemarks = spacialNutRemarks;
        this.spacialNutCheckbox = spacialNutCheckbox;
        this.towingPinRemarks = towingPinRemarks;
        this.towingPinCheckbox = towingPinCheckbox;
        this.jumperCablesRemarks = jumperCablesRemarks;
        this.jumperCablesCheckbox = jumperCablesCheckbox;
        this.wheelSpannerRemarks = wheelSpannerRemarks;
        this.wheelSpannerCheckbox = wheelSpannerCheckbox;
        this.fireExtinguisherRemarks = fireExtinguisherRemarks;
        this.fireExtinguisherCheckbox = fireExtinguisherCheckbox;
        this.firstAidKitRemarks = firstAidKitRemarks;
        this.firstAidKitCheckbox = firstAidKitCheckbox;
        this.towingRopeRemarks = towingRopeRemarks;
        this.towingRopeCheckbox = towingRopeCheckbox;
        this.ownersManualRemarks = ownersManualRemarks;
        this.ownersManualCheckbox = ownersManualCheckbox;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJackAndHandlerRemarks() {
        return jackAndHandlerRemarks;
    }

    public void setJackAndHandlerRemarks(String jackAndHandlerRemarks) {
        this.jackAndHandlerRemarks = jackAndHandlerRemarks;
    }

    public int getJackAndHandlerCheckbox() {
        return jackAndHandlerCheckbox;
    }

    public void setJackAndHandlerCheckbox(int jackAndHandlerCheckbox) {
        this.jackAndHandlerCheckbox = jackAndHandlerCheckbox;
    }

    public String getLifeSaversRemarks() {
        return lifeSaversRemarks;
    }

    public void setLifeSaversRemarks(String lifeSaversRemarks) {
        this.lifeSaversRemarks = lifeSaversRemarks;
    }

    public int getLifeSaversCheckbox() {
        return lifeSaversCheckbox;
    }

    public void setLifeSaversCheckbox(int lifeSaversCheckbox) {
        this.lifeSaversCheckbox = lifeSaversCheckbox;
    }

    public String getSpacialNutRemarks() {
        return spacialNutRemarks;
    }

    public void setSpacialNutRemarks(String spacialNutRemarks) {
        this.spacialNutRemarks = spacialNutRemarks;
    }

    public int getSpacialNutCheckbox() {
        return spacialNutCheckbox;
    }

    public void setSpacialNutCheckbox(int spacialNutCheckbox) {
        this.spacialNutCheckbox = spacialNutCheckbox;
    }

    public String getTowingPinRemarks() {
        return towingPinRemarks;
    }

    public void setTowingPinRemarks(String towingPinRemarks) {
        this.towingPinRemarks = towingPinRemarks;
    }

    public int getTowingPinCheckbox() {
        return towingPinCheckbox;
    }

    public void setTowingPinCheckbox(int towingPinCheckbox) {
        this.towingPinCheckbox = towingPinCheckbox;
    }

    public String getJumperCablesRemarks() {
        return jumperCablesRemarks;
    }

    public void setJumperCablesRemarks(String jumperCablesRemarks) {
        this.jumperCablesRemarks = jumperCablesRemarks;
    }

    public int getJumperCablesCheckbox() {
        return jumperCablesCheckbox;
    }

    public void setJumperCablesCheckbox(int jumperCablesCheckbox) {
        this.jumperCablesCheckbox = jumperCablesCheckbox;
    }

    public String getWheelSpannerRemarks() {
        return wheelSpannerRemarks;
    }

    public void setWheelSpannerRemarks(String wheelSpannerRemarks) {
        this.wheelSpannerRemarks = wheelSpannerRemarks;
    }

    public int getWheelSpannerCheckbox() {
        return wheelSpannerCheckbox;
    }

    public void setWheelSpannerCheckbox(int wheelSpannerCheckbox) {
        this.wheelSpannerCheckbox = wheelSpannerCheckbox;
    }

    public String getFireExtinguisherRemarks() {
        return fireExtinguisherRemarks;
    }

    public void setFireExtinguisherRemarks(String fireExtinguisherRemarks) {
        this.fireExtinguisherRemarks = fireExtinguisherRemarks;
    }

    public int getFireExtinguisherCheckbox() {
        return fireExtinguisherCheckbox;
    }

    public void setFireExtinguisherCheckbox(int fireExtinguisherCheckbox) {
        this.fireExtinguisherCheckbox = fireExtinguisherCheckbox;
    }

    public String getFirstAidKitRemarks() {
        return firstAidKitRemarks;
    }

    public void setFirstAidKitRemarks(String firstAidKitRemarks) {
        this.firstAidKitRemarks = firstAidKitRemarks;
    }

    public int getFirstAidKitCheckbox() {
        return firstAidKitCheckbox;
    }

    public void setFirstAidKitCheckbox(int firstAidKitCheckbox) {
        this.firstAidKitCheckbox = firstAidKitCheckbox;
    }

    public String getTowingRopeRemarks() {
        return towingRopeRemarks;
    }

    public void setTowingRopeRemarks(String towingRopeRemarks) {
        this.towingRopeRemarks = towingRopeRemarks;
    }

    public int getTowingRopeCheckbox() {
        return towingRopeCheckbox;
    }

    public void setTowingRopeCheckbox(int towingRopeCheckbox) {
        this.towingRopeCheckbox = towingRopeCheckbox;
    }

    public String getOwnersManualRemarks() {
        return ownersManualRemarks;
    }

    public void setOwnersManualRemarks(String ownersManualRemarks) {
        this.ownersManualRemarks = ownersManualRemarks;
    }

    public int getOwnersManualCheckbox() {
        return ownersManualCheckbox;
    }

    public void setOwnersManualCheckbox(int ownersManualCheckbox) {
        this.ownersManualCheckbox = ownersManualCheckbox;
    }
}
