package com.example.basiccounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DeveloperInfo extends AppCompatActivity {

    private TextView prevValueView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_info);
        prevValueView = findViewById(R.id.prevData);

        this.prevValueView.setText(getIntent().getStringExtra("COUNT"));
    }

    public void backToMain(View view) {
        this.finish();
    }
}