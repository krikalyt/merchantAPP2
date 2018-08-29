package com.example.krika.merchantapp30;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class finalactivity extends AppCompatActivity {

    TextView finalinfo;
    TextView quantity;
    Button accept;
    Button deny;
    TextView finalmessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalactivity);
        finalinfo = findViewById(R.id.final_info);
        quantity = findViewById(R.id.final_quantity);
        accept = findViewById(R.id.acceptbtn);
        deny = findViewById(R.id.denybtn);
        finalmessage =  findViewById(R.id.final_message);
        Intent intent = getIntent();
        if(intent.hasExtra("info"))
        {
            finalinfo.setText(intent.getStringExtra("info"));
        }
        if(intent.hasExtra("quantity"))
        {
            quantity.setText(intent.getStringExtra("quantity"));
        }

        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(finalmessage.getText()=="")
                {
                    finalmessage.setText("ACCEPTED");
                }

            }
        });

        deny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(finalmessage.getText()=="")
                {
                    finalmessage.setText("DENIED");
                }
            }
        });

    }
}
