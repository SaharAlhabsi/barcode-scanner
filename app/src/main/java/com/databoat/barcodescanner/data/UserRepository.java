package com.databoat.barcodescanner.data;

import android.app.Application;

import androidx.lifecycle.LiveData;

class UserRepository {

    private UserDoa userdoa;

    UserRepository(Application app) {
        DatabaseHelper db = DatabaseHelper.getDatabase(app);
        userdoa = db.userDao();

    }

    void insert(User user) {
        DatabaseHelper.databaseWriteExecutor.execute(() -> {
            userdoa.insert(user);
        });
    }

    LiveData<String> getUsername(String username) {
return userdoa.getUsername(username);
    }
    LiveData<String> getPassword(String password) {
        return userdoa.getUsername(password);
    }
    }