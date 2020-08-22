package com.example.basiccounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer counter = 0;
    private TextView counterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("outputmarker: OnCreate");
        setContentView(R.layout.activity_main);
        counterTextView = findViewById(R.id.countText);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("outputmarker: onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("outputmarker: onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("outputmarker: onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("outputmarker: onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("outputmarker: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("outputmarker: onPause");
    }

    public void increment(View view) {
        this.counter++;
        this.counterTextView.setText(this.counter.toString());
    }

    public void decrement(View view) {
        if(this.counter >0) {
            this.counter--;
            this.counterTextView.setText(this.counter.toString());
        }
    }

    public void developerInfo(View view) {
        Intent intent = new Intent(MainActivity.this, DeveloperInfo.class);
        intent.putExtra("COUNT", this.counter.toString());
        startActivity(intent);
    }
}