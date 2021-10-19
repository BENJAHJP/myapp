package com.example.servicemaster.roomdatabases.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.servicemaster.models.ActiveDataModel;
import com.example.servicemaster.roomdatabases.entities.Form1Entity;

import java.util.List;

@Dao
public interface Form1Dao {

    @Insert()
    void insertData(Form1Entity form1Entity);

    @Query("SELECT regNo,customer,jobType,duration FROM Form1")
    List<ActiveDataModel> getMyData();

}
