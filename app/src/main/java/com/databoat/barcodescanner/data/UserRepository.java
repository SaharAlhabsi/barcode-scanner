package com.databoat.barcodescanner.data;

import android.app.Application;

class UserRepository {

    private UserDoa userdoa;

    UserRepository(Application app){
        DatabaseHelper db = DatabaseHelper.getDatabase(app);
        userdoa = db.userDao();

    }

    void insert(User user){
        DatabaseHelper.databaseWriteExecutor.execute(()->{
            userdoa.insert(user);
        });
    }

}
