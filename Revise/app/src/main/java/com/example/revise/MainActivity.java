package com.example.revise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int count = 0;
    Button button;

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO: here is that
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.count);
        button = findViewById(R.id.Click);

    }

    public void count(View view) {
        //count=Integer.parseInt(textView.getText().toString());
        count++;
        textView.setText(String.valueOf(count));
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("title");
        builder.setMessage("Hello to the Dialogue");
        builder.setCancelable(false);
        LayoutInflater layoutInflater=this.getLayoutInflater();
        builder.setView(layoutInflater.inflate((R.layout.activity_main,root:null)));
        builder.setPositiveButton("Positive", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Positive was clicket", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("Positive", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Negative was clicket", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}