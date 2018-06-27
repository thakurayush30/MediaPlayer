package com.example.android.mediaplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BuySong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_song);

        ImageView buySongBackButton=(ImageView)findViewById(R.id.buyBackButton);

        //onclicklistner on buy song
        buySongBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buySongBackIntent=new Intent(BuySong.this,MainActivity.class);
                startActivity(buySongBackIntent);
            }
        });
    }


}
