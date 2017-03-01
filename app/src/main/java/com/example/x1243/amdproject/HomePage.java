package com.example.x1243.amdproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomePage extends AppCompatActivity {
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ImageView Homepage_btn = (ImageView) findViewById(R.id.Homepage_btn);
        final Context context = this;
        Homepage_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(context, HomePage.class);
                startActivity(myIntent);
            }
        });

        ImageView message_btn = (ImageView) findViewById(R.id.message_btn);
        message_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(context, Message.class);
                startActivity(myIntent);
            }
        });

        ImageView location_btn = (ImageView) findViewById(R.id.location_btn);
        location_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(context, Location.class);
                startActivity(myIntent);
            }
        });

    }
}
