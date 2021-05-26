package com.example.recyclorview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.security.KeyStore;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Example> exampleList=new ArrayList<>();
        exampleList.add(new Example(R.drawable.ic_android,"Ali","Raza"));
        exampleList.add(new Example(R.drawable.ic_android,"Rizvi","Raza"));
        exampleList.add(new Example(R.drawable.ic_launcher_background,"Raza","Ali"));
        mRecyclerView=findViewById(R.id.recclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(this);
        mAdapter=new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }
}