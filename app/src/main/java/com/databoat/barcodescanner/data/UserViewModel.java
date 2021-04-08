package com.databoat.barcodescanner.data;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class UserViewModel extends AndroidViewModel {

    private UserRepository userRepository;

   public UserViewModel(Application app){
        super(app);
        userRepository  = new UserRepository(app);
    }

    void insert(User user){userRepository.insert(user);}

    LiveData<String> getUsername(String user){ return userRepository.getUsername(user);}
    LiveData<String>  getPassword(String password){ return userRepository.getPassword(password);}
}
