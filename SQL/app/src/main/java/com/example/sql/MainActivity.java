package com.example.sql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnAdd, btnView;
EditText editname,editage;
Switch swithcisActive;
ListView listView;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd=findViewById(R.id.buttonadd);
        btnView=findViewById(R.id.buttonview);
        editname=findViewById(R.id.editTextTextPersonName);
        editage=findViewById(R.id.editTextTextPersonName2);
        swithcisActive=findViewById(R.id.switch1);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            CustomerModel customerModel;

            @Override
            public void onClick(View view) {
                customerModel=new CustomerModel(editname.getText().toString(),Integer.parseInt(editage.getText().toString()),swithcisActive.isChecked(),1);
                Toast.makeText(MainActivity.this,customerModel.toString(),Toast.LENGTH_LONG).show();
                //Toast.makeText(MainActivity.this,"Add Button Clicked",Toast.LENGTH_SHORT).show();

            }
        });
        btnView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"view Button Clicked",Toast.LENGTH_SHORT).show();

            }
        });
    }
}