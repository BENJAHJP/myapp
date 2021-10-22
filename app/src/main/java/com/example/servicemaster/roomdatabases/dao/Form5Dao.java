package com.example.servicemaster.roomdatabases.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.servicemaster.roomdatabases.entities.Form5Entity;

@Dao
public interface Form5Dao {

    @Insert
    void insertData(Form5Entity form5Entity);

    @Query("SELECT EXISTS(SELECT 1 FROM Form5 WHERE id = :id LIMIT 1)")
    boolean getData(int id);

    @Query("SELECT * FROM Form5 WHERE id = :id")
    Form5Entity getRow(int id);

    @Query("SELECT MAX(id) FROM Form5")
    int getLastID();
}
