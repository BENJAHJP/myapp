package com.example.servicemaster.roomdatabases.dao;

import androidx.room.Dao;
import androidx.room.Insert;

import com.example.servicemaster.roomdatabases.entities.Form7Entity;

@Dao
public interface Form7Dao {

    @Insert
    void insertData(Form7Entity form7Entity);
}
