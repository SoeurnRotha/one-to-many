package com.example.one_to_many.Model;

import androidx.room.Embedded;
import androidx.room.Relation;

public class UserWithPlaylists {

    @Embedded
    public User user;


    @Relation(
            parentColumn = "userid",
            entityColumn = "userCreateId"
    )

    public Playlist playlist;


    @Override
    public String toString() {
        return "UserWithPlaylists{" +
                "user=" + user +
                ", playlist=" + playlist +
                '}';
    }
}
