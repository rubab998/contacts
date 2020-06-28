package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar = getSupportActionBar();
        TextView nm= findViewById(R.id.cname);
        TextView ph=findViewById(R.id.cnum);
        TextView pt=findViewById(R.id.ptype);
        TextView ma=findViewById(R.id.cadd);
        TextView mt=findViewById(R.id.atype);


//get data from previous activity when item of list view is clicked using intent
        Intent intent =getIntent();
        //from list view adapter get and insert values
        String mActionBarTitle= intent.getStringExtra("actionBarTitle");
        String cn= intent.getStringExtra("name");
        String cp= intent.getStringExtra("cphone");
        String pht= intent.getStringExtra("phtype");
        String mad= intent.getStringExtra("add");
        String adt= intent.getStringExtra("addr");
        //set action bar Title
        actionBar.setTitle(mActionBarTitle);
        //set text in text view
        nm.setText(cn);
        ph.setText(cp);
        pt.setText(pht);
        ma.setText(mad);
        mt.setText(adt);


    }
}
