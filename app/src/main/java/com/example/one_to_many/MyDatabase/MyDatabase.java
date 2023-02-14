package com.example.one_to_many.MyDatabase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.one_to_many.Model.Playlist;
import com.example.one_to_many.Model.User;
import com.example.one_to_many.MyDao.MyDao;


@Database(entities = {User.class, Playlist.class} , version = 1)
public abstract class MyDatabase extends RoomDatabase {

    public abstract MyDao getDao();

    private static volatile MyDatabase INSTANCE;
    public static MyDatabase getInstance(Context context) {

        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), MyDatabase.class, "UserAndLibrary")
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }
}
