package com.hope.mybiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContact = findViewById(R.id.btn_contact);
        btnContact.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(R.id.btn_contact == v.getId()){
            String phoneNumber = "08994636544";
            Intent intentImplicitPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
            startActivity(intentImplicitPhone);
        }
    }
}
