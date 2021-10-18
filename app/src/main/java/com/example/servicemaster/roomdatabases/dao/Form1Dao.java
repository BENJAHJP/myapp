package com.example.servicemaster.roomdatabases.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.servicemaster.roomdatabases.entities.Form1Entity;

@Dao
public interface Form1Dao {

    @Insert()
    void insertData(Form1Entity form1Entity);

}
