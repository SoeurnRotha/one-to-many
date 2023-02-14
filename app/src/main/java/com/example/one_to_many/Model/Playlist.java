package com.example.one_to_many.Model;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Playlist {

    @PrimaryKey
    int playlistId;

    @ColumnInfo
    int userCreateId;


    @ColumnInfo
    String playlistName;

    public Playlist(int playlistId, int userCreateId, String playlistName) {
        this.playlistId = playlistId;
        this.userCreateId = userCreateId;
        this.playlistName = playlistName;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public int getUserCreateId() {
        return userCreateId;
    }

    public void setUserCreateId(int userCreateId) {
        this.userCreateId = userCreateId;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playlistId=" + playlistId +
                ", userCreateId=" + userCreateId +
                ", playlistName='" + playlistName + '\'' +
                '}';
    }
}
