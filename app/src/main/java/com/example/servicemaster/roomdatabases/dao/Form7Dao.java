package com.example.servicemaster.roomdatabases.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.servicemaster.roomdatabases.entities.Form7Entity;

@Dao
public interface Form7Dao {

    @Insert
    void insertData(Form7Entity form7Entity);

    @Query("SELECT EXISTS(SELECT 1 FROM Form7 WHERE id = :id LIMIT 1)")
    boolean getData(int id);

    @Query("SELECT * FROM Form7 WHERE id = :id")
    Form7Entity getRow(int id);

    @Query("SELECT MAX(id) FROM Form7")
    int getLastID();
}
