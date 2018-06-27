package com.example.android.mediaplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SearchSong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_song);

        ImageView searchBackButton=(ImageView)findViewById(R.id.searchBackButton);

        //onclicklistner on buy song
        searchBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchBackButtonIntent=new Intent(SearchSong.this,MainActivity.class);
                startActivity(searchBackButtonIntent);
            }
        });

    }
}
