package com.example.servicemaster.roomdatabases.dao;

import androidx.room.Dao;
import androidx.room.Insert;

import com.example.servicemaster.roomdatabases.entities.Form6Entity;

@Dao
public interface Form6Dao {

    @Insert
    void insertData(Form6Entity form6Entity);
}
