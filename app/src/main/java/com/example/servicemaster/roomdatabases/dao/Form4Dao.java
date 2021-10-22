package com.example.servicemaster.roomdatabases.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.servicemaster.roomdatabases.entities.Form4Entity;

@Dao
public interface Form4Dao {

    @Insert
    void insertData(Form4Entity form4Entity);

    @Query("SELECT EXISTS(SELECT 1 FROM Form4 WHERE id = :id LIMIT 1)")
    boolean getData(int id);

    @Query("SELECT * FROM Form4 WHERE id = :id")
    Form4Entity getRow(int id);

    @Query("SELECT MAX(id) FROM Form4")
    int getLastID();

}
