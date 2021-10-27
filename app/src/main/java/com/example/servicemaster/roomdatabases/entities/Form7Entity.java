package com.example.servicemaster.roomdatabases.entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Form7")
public class Form7Entity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String jackAndHandlerRemarks;
    private boolean jackAndHandlerCheckbox;

    private String lifeSaversRemarks;
    private boolean lifeSaversCheckbox;

    private String spacialNutRemarks;
    private boolean spacialNutCheckbox;

    private String towingPinRemarks;
    private boolean towingPinCheckbox;

    private String jumperCablesRemarks;
    private boolean jumperCablesCheckbox;

    private String wheelSpannerRemarks;
    private boolean wheelSpannerCheckbox;

    private String fireExtinguisherRemarks;
    private boolean fireExtinguisherCheckbox;

    private String firstAidKitRemarks;
    private boolean firstAidKitCheckbox;

    private String towingRopeRemarks;
    private boolean towingRopeCheckbox;

    private String ownersManualRemarks;
    private boolean ownersManualCheckbox;

    public Form7Entity(int id, String jackAndHandlerRemarks, boolean jackAndHandlerCheckbox, String lifeSaversRemarks, boolean lifeSaversCheckbox, String spacialNutRemarks, boolean spacialNutCheckbox, String towingPinRemarks, boolean towingPinCheckbox, String jumperCablesRemarks, boolean jumperCablesCheckbox, String wheelSpannerRemarks, boolean wheelSpannerCheckbox, String fireExtinguisherRemarks, boolean fireExtinguisherCheckbox, String firstAidKitRemarks, boolean firstAidKitCheckbox, String towingRopeRemarks, boolean towingRopeCheckbox, String ownersManualRemarks, boolean ownersManualCheckbox) {
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
    public Form7Entity(String jackAndHandlerRemarks, boolean jackAndHandlerCheckbox, String lifeSaversRemarks, boolean lifeSaversCheckbox, String spacialNutRemarks, boolean spacialNutCheckbox, String towingPinRemarks, boolean towingPinCheckbox, String jumperCablesRemarks, boolean jumperCablesCheckbox, String wheelSpannerRemarks, boolean wheelSpannerCheckbox, String fireExtinguisherRemarks, boolean fireExtinguisherCheckbox, String firstAidKitRemarks, boolean firstAidKitCheckbox, String towingRopeRemarks, boolean towingRopeCheckbox, String ownersManualRemarks, boolean ownersManualCheckbox) {
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

    public boolean isJackAndHandlerCheckbox() {
        return jackAndHandlerCheckbox;
    }

    public void setJackAndHandlerCheckbox(boolean jackAndHandlerCheckbox) {
        this.jackAndHandlerCheckbox = jackAndHandlerCheckbox;
    }

    public String getLifeSaversRemarks() {
        return lifeSaversRemarks;
    }

    public void setLifeSaversRemarks(String lifeSaversRemarks) {
        this.lifeSaversRemarks = lifeSaversRemarks;
    }

    public boolean isLifeSaversCheckbox() {
        return lifeSaversCheckbox;
    }

    public void setLifeSaversCheckbox(boolean lifeSaversCheckbox) {
        this.lifeSaversCheckbox = lifeSaversCheckbox;
    }

    public String getSpacialNutRemarks() {
        return spacialNutRemarks;
    }

    public void setSpacialNutRemarks(String spacialNutRemarks) {
        this.spacialNutRemarks = spacialNutRemarks;
    }

    public boolean isSpacialNutCheckbox() {
        return spacialNutCheckbox;
    }

    public void setSpacialNutCheckbox(boolean spacialNutCheckbox) {
        this.spacialNutCheckbox = spacialNutCheckbox;
    }

    public String getTowingPinRemarks() {
        return towingPinRemarks;
    }

    public void setTowingPinRemarks(String towingPinRemarks) {
        this.towingPinRemarks = towingPinRemarks;
    }

    public boolean isTowingPinCheckbox() {
        return towingPinCheckbox;
    }

    public void setTowingPinCheckbox(boolean towingPinCheckbox) {
        this.towingPinCheckbox = towingPinCheckbox;
    }

    public String getJumperCablesRemarks() {
        return jumperCablesRemarks;
    }

    public void setJumperCablesRemarks(String jumperCablesRemarks) {
        this.jumperCablesRemarks = jumperCablesRemarks;
    }

    public boolean isJumperCablesCheckbox() {
        return jumperCablesCheckbox;
    }

    public void setJumperCablesCheckbox(boolean jumperCablesCheckbox) {
        this.jumperCablesCheckbox = jumperCablesCheckbox;
    }

    public String getWheelSpannerRemarks() {
        return wheelSpannerRemarks;
    }

    public void setWheelSpannerRemarks(String wheelSpannerRemarks) {
        this.wheelSpannerRemarks = wheelSpannerRemarks;
    }

    public boolean isWheelSpannerCheckbox() {
        return wheelSpannerCheckbox;
    }

    public void setWheelSpannerCheckbox(boolean wheelSpannerCheckbox) {
        this.wheelSpannerCheckbox = wheelSpannerCheckbox;
    }

    public String getFireExtinguisherRemarks() {
        return fireExtinguisherRemarks;
    }

    public void setFireExtinguisherRemarks(String fireExtinguisherRemarks) {
        this.fireExtinguisherRemarks = fireExtinguisherRemarks;
    }

    public boolean isFireExtinguisherCheckbox() {
        return fireExtinguisherCheckbox;
    }

    public void setFireExtinguisherCheckbox(boolean fireExtinguisherCheckbox) {
        this.fireExtinguisherCheckbox = fireExtinguisherCheckbox;
    }

    public String getFirstAidKitRemarks() {
        return firstAidKitRemarks;
    }

    public void setFirstAidKitRemarks(String firstAidKitRemarks) {
        this.firstAidKitRemarks = firstAidKitRemarks;
    }

    public boolean isFirstAidKitCheckbox() {
        return firstAidKitCheckbox;
    }

    public void setFirstAidKitCheckbox(boolean firstAidKitCheckbox) {
        this.firstAidKitCheckbox = firstAidKitCheckbox;
    }

    public String getTowingRopeRemarks() {
        return towingRopeRemarks;
    }

    public void setTowingRopeRemarks(String towingRopeRemarks) {
        this.towingRopeRemarks = towingRopeRemarks;
    }

    public boolean isTowingRopeCheckbox() {
        return towingRopeCheckbox;
    }

    public void setTowingRopeCheckbox(boolean towingRopeCheckbox) {
        this.towingRopeCheckbox = towingRopeCheckbox;
    }

    public String getOwnersManualRemarks() {
        return ownersManualRemarks;
    }

    public void setOwnersManualRemarks(String ownersManualRemarks) {
        this.ownersManualRemarks = ownersManualRemarks;
    }

    public boolean isOwnersManualCheckbox() {
        return ownersManualCheckbox;
    }

    public void setOwnersManualCheckbox(boolean ownersManualCheckbox) {
        this.ownersManualCheckbox = ownersManualCheckbox;
    }
}
