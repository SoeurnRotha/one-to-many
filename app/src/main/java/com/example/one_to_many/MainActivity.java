package com.example.one_to_many;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

import com.example.one_to_many.Model.Playlist;
import com.example.one_to_many.Model.User;
import com.example.one_to_many.Model.UserWithPlaylists;
import com.example.one_to_many.MyDatabase.MyDatabase;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "Select Success";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MyDatabase.getInstance(this).getDao().insertUser(new User(1,"Rotha", 21));
        MyDatabase.getInstance(this).getDao().insertUser(new User(2,"Kaka", 22));
        MyDatabase.getInstance(this).getDao().insertUser(new User(3,"Lyhour", 20));
        MyDatabase.getInstance(this).getDao().insertUser(new User(4,"Lina", 18));
        MyDatabase.getInstance(this).getDao().insertUser(new User(5,"Chea", 31));
        MyDatabase.getInstance(this).getDao().insertUser(new User(6,"Rith", 51));




        MyDatabase.getInstance(this).getDao().insertPlayList(new Playlist(1,1,"Khmer song"));
        MyDatabase.getInstance(this).getDao().insertPlayList(new Playlist(2,1,"English song"));
        MyDatabase.getInstance(this).getDao().insertPlayList(new Playlist(3,2,"Rook"));
        MyDatabase.getInstance(this).getDao().insertPlayList(new Playlist(4,2,"Hip hop"));


        List<User> userList = MyDatabase.getInstance(this).getDao().getUser();
        List<Playlist> playlistList = MyDatabase.getInstance(this).getDao().getPlaylist();

        List<UserWithPlaylists> userWithPlaylists = MyDatabase.getInstance(this).getDao().getUsersWithPlaylists();

        Log.d(TAG, "Hi" + userWithPlaylists.toString() );
        Log.d(TAG , "Hello" + userList.toString() );
        Log.d(TAG , "hola" + playlistList.toString() );
    }
}