package com.example.krika.merchantapp30;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Typeface tf1;
    TextView mainhead;
    TextView productdes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainhead = findViewById(R.id.mainhead);
        tf1 = Typeface.createFromAsset(getAssets(),"font/Abel-Regular.ttf");
        mainhead.setTypeface(tf1);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        String data[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14"};
        recyclerviewAdapter adapter = new recyclerviewAdapter(data,this);
        recyclerView.setAdapter(adapter);
    }
}
