package com.example.one_to_many.MyDao;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

import com.example.one_to_many.Model.Playlist;
import com.example.one_to_many.Model.User;
import com.example.one_to_many.Model.UserWithPlaylists;

import java.util.List;

@Dao
public interface MyDao {


    @Insert
    void insertUser(User user);


    @Insert
    void insertPlayList(Playlist playlist);

    @Transaction
    @Query("SELECT * FROM User")
    List<UserWithPlaylists> getUsersWithPlaylists();


    @Query("SELECT * FROM User")
    List<User> getUser();


    @Query("SELECT * FROM Playlist")
    List<Playlist> getPlaylist();



}
