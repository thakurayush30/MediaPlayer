package com.example.android.mediaplayer;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find view with My Library
        TextView mylibrary=(TextView)findViewById(R.id.my_library);

        //onclicklistner on my library
        mylibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent=new Intent(MainActivity.this,MyLibrary.class);
                startActivity(libraryIntent);
            }
        });

        //find view with playlist
        TextView playlist=(TextView)findViewById(R.id.playlist);

        //onclicklistner on playlist
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent=new Intent(MainActivity.this,Playlist.class);
                startActivity(playlistIntent);
            }
        });

        //find view with Search Song
        TextView searchSong=(TextView)findViewById(R.id.search);

        //onclicklistner on search song
        searchSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchSongIntent=new Intent(MainActivity.this,SearchSong.class);
                startActivity(searchSongIntent);
            }
        });

        //find view with Buy song
        TextView buySong=(TextView)findViewById(R.id.buy_song);

        //onclicklistner on buy song
        buySong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buySongIntent=new Intent(MainActivity.this,BuySong.class);
                startActivity(buySongIntent);
            }
        });

        final ImageView playButton=(ImageView)findViewById(R.id.play_button);



        playButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(flag==0){
                playButton.setImageResource(R.drawable.pause_button);
                flag=1;
            }
            else if(flag==1){
                    playButton.setImageResource(R.drawable.play_button);
                    flag=0;
                }
            }
        });
    }
}
