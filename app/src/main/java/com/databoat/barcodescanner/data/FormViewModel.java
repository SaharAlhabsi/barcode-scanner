package com.databoat.barcodescanner.data;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class FormViewModel extends AndroidViewModel {

    private FormRepository formRepository;
    private final LiveData<List<Form>> allForm;

    FormViewModel(Application app){
        super(app);
        formRepository  = new FormRepository(app);
        allForm = formRepository.getAllData();
    }

    LiveData<List<Form>> getAllForm(){return  allForm;}
    void insert(Form form){formRepository.insert(form);}
}
