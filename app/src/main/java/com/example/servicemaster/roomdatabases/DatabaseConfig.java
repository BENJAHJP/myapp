package com.example.servicemaster.roomdatabases;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.servicemaster.roomdatabases.dao.Form1Dao;
import com.example.servicemaster.roomdatabases.entities.Form1Entity;

@Database(entities = {Form1Entity.class}, version = 1, exportSchema = false)
public abstract class DatabaseConfig extends RoomDatabase {
    private static final Object LOCK = new Object();
    private static final String DATABASE_NAME = "checkInForms";
    private static DatabaseConfig databaseInstance;

    public static DatabaseConfig databaseGetInstance(Context context) {
        if(databaseInstance == null ){
            synchronized (LOCK){
                databaseInstance = Room.databaseBuilder(context.getApplicationContext(),
                        DatabaseConfig.class, DatabaseConfig.DATABASE_NAME).allowMainThreadQueries().build();
            }
        }
        return databaseInstance;
    }

    public abstract Form1Dao form1Dao();
}
