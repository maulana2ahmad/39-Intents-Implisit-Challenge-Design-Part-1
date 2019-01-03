package com.mractiveiddev.challengeintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView ivMood, ivPhone, ivLocation, ivWebsite;
    Button btnCreat;

    final int CREATE_CONTACT = 1;

    String name = "", number = "", website = "", location = "", mood = "";


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
                Intent intent = new Intent(MainActivity.this,
                        com.mractiveiddev.challengeintent.CreatContact.class);
                startActivityForResult(intent, CREATE_CONTACT);
            }
        });

        ivPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + number));
                startActivity(intent);
            }
        });

        ivLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q" + location));
                startActivity(intent);
            }
        });

        ivWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + website));
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CREATE_CONTACT)
        {
            if (resultCode == RESULT_OK)
            {
                ivMood.setVisibility(View.VISIBLE);
                ivPhone.setVisibility(View.VISIBLE);
                ivLocation.setVisibility(View.VISIBLE);
                ivWebsite.setVisibility(View.VISIBLE);

                name = data.getStringExtra("name");
                number = data.getStringExtra("number");
                location = data.getStringExtra("location");
                website = data.getStringExtra("website");
                mood = data.getStringExtra("mood");

                if (mood.equals("happy"))
                {
                    ivMood.setImageResource(R.drawable.happy);
                }
                else if (mood.equals("netral"))
                {
                    ivMood.setImageResource(R.drawable.netral);
                }
                else
                {
                    ivMood.setImageResource(R.drawable.sad);
                }
            }
            else
            {
                Toast.makeText(this, "No data passed throught", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
