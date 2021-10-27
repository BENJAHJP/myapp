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

    @Query("SELECT EXISTS(SELECT 1 FROM Form3 WHERE id = :id LIMIT 1)")
    boolean getData(int id);

    @Query("SELECT * FROM Form3 WHERE id = :id")
    Form3Entity getRow(int id);

    @Query("SELECT MAX(id) FROM Form3")
    int getLastID();


}
