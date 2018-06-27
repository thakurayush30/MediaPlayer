package com.example.android.mediaplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MyLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_library);

        ImageView myLibraryBackButton=(ImageView)findViewById(R.id.myLibraryBackButton);

        //onclicklistner on buy song
        myLibraryBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myLibraryBackButtonIntent=new Intent(MyLibrary.this,MainActivity.class);
                startActivity(myLibraryBackButtonIntent);
            }
        });
    }
}
