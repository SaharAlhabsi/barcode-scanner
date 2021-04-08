package com.databoat.barcodescanner.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UserDoa {

    @Insert
    void insert(User user);
    @Query("SELECT name FROM users WHERE id = :username")
    LiveData<String> getUsername(String username);
    @Query("SELECT password FROM users WHERE password = :password")
    LiveData<String> getPassword(String password);

@Query("DELETE FROM users")
    void deleteAll();
}
