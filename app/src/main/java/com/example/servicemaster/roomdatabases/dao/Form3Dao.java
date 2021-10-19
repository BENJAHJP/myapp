package com.example.servicemaster.roomdatabases.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.servicemaster.roomdatabases.entities.Form3Entity;

@Dao
public interface Form3Dao {

    @Insert
    void insertData(Form3Entity form3Entity);

    @Update
    void updateData(Form3Entity form3Entity);

    @Query("SELECT EXISTS(SELECT 1 FROM Form3 WHERE regNo = :regNo LIMIT 1)")
    boolean fieldExists(String regNo);

    @Query("SELECT * FROM Form3 WHERE regNo = :regNo")
    Form3Entity GetField(String regNo);

    @Query("UPDATE Form3 SET checked = :checked WHERE regNo = :regNo")
    void saveChecked(int checked, String regNo);

    @Query("UPDATE Form3 SET remarks = :remarks WHERE regNo = :regNo")
    void updateRemarks(String remarks, String regNo);

}
