package com.example.servicemaster.roomdatabases.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Update;

import com.example.servicemaster.roomdatabases.entities.Form3Entity;

@Dao
public interface Form3Dao {

    @Insert
    void insertData(Form3Entity form3Entity);

    @Update
    void updateData(Form3Entity form3Entity);
}
