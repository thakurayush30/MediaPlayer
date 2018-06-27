package com.example.android.mediaplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        ImageView playlistBackButton=(ImageView)findViewById(R.id.playlistBackButton);

        //onclicklistner on buy song
        playlistBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistBackButtonIntent=new Intent(Playlist.this,MainActivity.class);
                startActivity(playlistBackButtonIntent);
            }
        });

    }
}
