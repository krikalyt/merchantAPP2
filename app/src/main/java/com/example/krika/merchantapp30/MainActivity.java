package com.example.krika.merchantapp30;

import android.app.ActionBar;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.preference.PreferenceManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Typeface tf1;
    TextView mainhead;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView merchant;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainhead = findViewById(R.id.mainhead);
        tf1 = Typeface.createFromAsset(getAssets(),"font/Abel-Regular.ttf");
        mainhead.setTypeface(tf1);
        merchant = findViewById(R.id.merchant);
        merchant.setText("Merchant: "+setupsharepreferences());
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        String data[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14"};
        recyclerviewAdapter adapter = new recyclerviewAdapter(data,this);
        recyclerView.setAdapter(adapter);
    }


    private String setupsharepreferences()
    {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String merchantName = sharedPreferences.getString("merchantname","");
        return merchantName;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.action_settings)
        {
            Intent intent = new Intent(this,setting_activity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}