package com.example.servicemaster.roomdatabases.dao;

import androidx.room.Dao;
import androidx.room.Insert;

import com.example.servicemaster.roomdatabases.entities.Form4Entity;

@Dao
public interface Form4Dao {

    @Insert
    void insertData(Form4Entity form4Entity);
}
