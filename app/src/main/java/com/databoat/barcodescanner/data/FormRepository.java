package com.databoat.barcodescanner.data;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class FormRepository {

    private FormDao formdoa;

    private LiveData<List<Form>> allData;
    FormRepository(Application app){
        DatabaseHelper db = DatabaseHelper.getDatabase(app);
        formdoa = db.formDao();
        allData = formdoa.getAllData();
    }

    void insert(Form form){
        DatabaseHelper.databaseWriteExecutor.execute(()->{
            formdoa.insert(form);
        });
    }

    LiveData<List<Form>> getAllData(){
        return  allData;
    }
}
