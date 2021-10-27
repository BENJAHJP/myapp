package com.example.servicemaster.roomdatabases;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.example.servicemaster.roomdatabases.dao.Form1Dao;
import com.example.servicemaster.roomdatabases.dao.Form2Dao;
import com.example.servicemaster.roomdatabases.dao.Form3Dao;
import com.example.servicemaster.roomdatabases.dao.Form4Dao;
import com.example.servicemaster.roomdatabases.dao.Form5Dao;
import com.example.servicemaster.roomdatabases.dao.Form6Dao;
import com.example.servicemaster.roomdatabases.dao.Form7Dao;
import com.example.servicemaster.roomdatabases.entities.Form1Entity;
import com.example.servicemaster.roomdatabases.entities.Form2Entity;
import com.example.servicemaster.roomdatabases.entities.Form3Entity;
import com.example.servicemaster.roomdatabases.entities.Form4Entity;
import com.example.servicemaster.roomdatabases.entities.Form5Entity;
import com.example.servicemaster.roomdatabases.entities.Form6Entity;
import com.example.servicemaster.roomdatabases.entities.Form7Entity;

@Database(entities = {Form1Entity.class, Form2Entity.class, Form3Entity.class, Form4Entity.class, Form5Entity.class, Form6Entity.class, Form7Entity.class }, version = 1, exportSchema = false)
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

    public abstract Form2Dao form2Dao();
    public abstract Form1Dao form1Dao();
    public abstract Form3Dao form3Dao();
    public abstract Form4Dao form4Dao();
    public abstract Form5Dao form5Dao();
    public abstract Form6Dao form6Dao();
    public abstract Form7Dao form7Dao();
}
