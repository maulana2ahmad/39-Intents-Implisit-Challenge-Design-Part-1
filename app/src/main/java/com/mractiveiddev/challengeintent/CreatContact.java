package com.mractiveiddev.challengeintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class CreatContact extends AppCompatActivity {

    EditText etName, etNumber, etLocation, etWebsite;
    ImageView ivHappy, ivNetral, ivSad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creat_contact);

        etName = findViewById(R.id.etName);
        etNumber = findViewById(R.id.etNumber);
        etLocation = findViewById(R.id.etLocation);
        etWebsite = findViewById(R.id.etWebsite);

        ivHappy = findViewById(R.id.ivHappy);
        ivNetral = findViewById(R.id.ivNetral);
        ivSad = findViewById(R.id.ivSad);

        ivHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent()
            }
        });

        ivNetral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ivSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
