package com.databoat.barcodescanner.data;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {User.class, Form.class}, version = 1, exportSchema = false)
public abstract class DatabaseHelper extends RoomDatabase {

    public abstract UserDoa userDao();
    public abstract FormDao formDao();

    private static volatile DatabaseHelper INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static DatabaseHelper getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (DatabaseHelper.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            DatabaseHelper.class, "BahlaDimond")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
    private static RoomDatabase.Callback DatabaseCallback = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db){
            databaseWriteExecutor.execute(()->{
                UserDoa doa= INSTANCE.userDao();
                doa.deleteAll();
                User user1=new User("sahar","12345");
                doa.insert(user1);
            });
        }
    };
}
