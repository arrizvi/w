package com.example.internt786;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call(View view) {
        Uri uri=Uri.parse("tel:+923074080246");
        Intent intent=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
    }

    public void web(View view) {
        Uri uri=Uri.parse("http://www.pucit.edu.pk");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}