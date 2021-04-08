package com.databoat.barcodescanner.data;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

public class userViewModel extends AndroidViewModel {

    private UserRepository userRepository;

    userViewModel(Application app){
        super(app);
        userRepository  = new UserRepository(app);
    }

    void insert(User user){userRepository.insert(user);}
}
