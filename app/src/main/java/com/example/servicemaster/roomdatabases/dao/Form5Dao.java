package com.example.servicemaster.roomdatabases.dao;

import androidx.room.Dao;
import androidx.room.Insert;

import com.example.servicemaster.roomdatabases.entities.Form5Entity;

@Dao
public interface Form5Dao {

    @Insert
    void insertData(Form5Entity form5Entity);
}
