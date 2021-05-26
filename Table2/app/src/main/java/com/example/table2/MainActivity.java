package com.example.table2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void orderTable1(View view) {
            Intent intent = new Intent(MainActivity.this,Table1.class);
            startActivity(intent);
    }
    public void orderTable2(View view) {
        Intent intent = new Intent(MainActivity.this,Table2.class);
        startActivity(intent);
    }
    public void orderTable3(View view) {
        Intent intent = new Intent(MainActivity.this,Table3.class);
        startActivity(intent);
    }
    public void orderTable4(View view) {
        Intent intent = new Intent(MainActivity.this,Table4.class);
        startActivity(intent);
    }
    public void orderTable5(View view) {
        Intent intent = new Intent(MainActivity.this,Table5.class);
        startActivity(intent);
    }
    public void orderTable6(View view) {
        Intent intent = new Intent(MainActivity.this,Table6.class);
        startActivity(intent);
    }
}