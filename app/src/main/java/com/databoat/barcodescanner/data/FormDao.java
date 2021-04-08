package com.databoat.barcodescanner.data;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface FormDao {

    @Insert
    void insert(Form form);

    @Query("SELECT * from data ORDER BY idst")
    LiveData<List<Form>> getAllData();
}
