package com.hope.mybiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button btnClickMe = findViewById(R.id.btn_next);
        btnClickMe.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(R.id.btn_next == v.getId()){
            Intent intent = new Intent(FirstActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}
