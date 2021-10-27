package com.example.servicemaster.roomdatabases.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.servicemaster.roomdatabases.entities.Form2Entity;

@Dao
public interface Form2Dao {

    @Insert()
    void insertData(Form2Entity form2Entity);

    @Query("SELECT EXISTS(SELECT 1 FROM Form2 WHERE id = :id LIMIT 1)")
    boolean getData(int id);

    @Query("SELECT MAX(id) FROM Form2")
    int getLastID();

    @Query("SELECT * FROM Form2 WHERE id = :id")
    Form2Entity getRow(int id);

}
