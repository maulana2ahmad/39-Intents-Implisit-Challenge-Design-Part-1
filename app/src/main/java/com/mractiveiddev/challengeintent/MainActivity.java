package com.mractiveiddev.challengeintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivMood, ivPhone, ivLocation, ivWebsite;
    Button btnCreat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivMood = findViewById(R.id.ivMood);
        ivPhone = findViewById(R.id.ivPhone);
        ivLocation = findViewById(R.id.ivLocation);
        ivWebsite = findViewById(R.id.ivWebsite);
        btnCreat = findViewById(R.id.btnCreat);

        //Button diklik semua image disembunyikan
        ivMood.setVisibility(View.GONE);
        ivPhone.setVisibility(View.GONE);
        ivLocation.setVisibility(View.GONE);
        ivWebsite.setVisibility(View.GONE);

        btnCreat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ivPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ivLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ivWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
