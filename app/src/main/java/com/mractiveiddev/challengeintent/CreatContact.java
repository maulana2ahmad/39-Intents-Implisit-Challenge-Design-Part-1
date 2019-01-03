package com.mractiveiddev.challengeintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class CreatContact extends AppCompatActivity implements View.OnClickListener{

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

        ivHappy.setOnClickListener(this);
        ivNetral.setOnClickListener(this);
        ivSad.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (etName.getText().toString().isEmpty() ||
                etNumber.getText().toString().isEmpty() ||
                etLocation.getText().toString().isEmpty() ||
                etWebsite.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Fleas enter all Field", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent intent = new Intent();
            intent.putExtra("name", etName.getText().toString().trim());
            intent.putExtra("number", etNumber.getText().toString().trim());
            intent.putExtra("location", etLocation.getText().toString().trim());
            intent.putExtra("website", etWebsite.getText().toString().trim());

            if (view.getId() == R.id.ivHappy)
            {
                intent.putExtra("mood", "happy");
            }
            else if (view.getId() == R.id.ivNetral)
            {
                intent.putExtra("mood", "netral");
            }
            else
            {
                intent.putExtra("mood", "sad");
            }

            setResult(RESULT_OK, intent);
            CreatContact.this.finish();
        }
    }
}
