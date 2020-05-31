package com.example.codigomenuaula08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        txt2=findViewById(R.id.text2);
        Intent it2=getIntent();
        Bundle bundle = it2.getExtras();
        if(bundle!=null){
            txt2.setText(bundle.getString("ch_txt"));
        }
    }
}
