package com.example.servicemaster.roomdatabases.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.servicemaster.roomdatabases.entities.Form6Entity;

@Dao
public interface Form6Dao {

    @Insert
    void insertData(Form6Entity form6Entity);

    @Query("SELECT EXISTS(SELECT 1 FROM Form6 WHERE id = :id LIMIT 1)")
    boolean getData(int id);

    @Query("SELECT * FROM Form6 WHERE id = :id")
    Form6Entity getRow(int id);

    @Query("SELECT MAX(id) FROM Form6")
    int getLastID();
}
