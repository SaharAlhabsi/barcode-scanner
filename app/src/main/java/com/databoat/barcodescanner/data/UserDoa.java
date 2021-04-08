package com.databoat.barcodescanner.data;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface UserDoa {

    @Insert
    void insert(User user);

}
