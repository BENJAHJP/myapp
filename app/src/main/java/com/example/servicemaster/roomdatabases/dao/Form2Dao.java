package com.example.servicemaster.roomdatabases.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Update;

import com.example.servicemaster.roomdatabases.entities.Form2Entity;

@Dao
public interface Form2Dao {

    @Insert
    void insertData(Form2Entity form2Entity);

}
