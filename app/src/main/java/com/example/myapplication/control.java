package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class
control extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getSharedPreferences("login",MODE_PRIVATE);
        if(sharedPreferences.getString("userid","").isEmpty()){
            Intent in= new Intent(getApplicationContext(),MainActivity.class);
            startActivity(in);
        }else{
            Intent in= new Intent(getApplicationContext(),MainActivity.class);
//            Intent in  = new Intent(getApplicationContext(),control.class);
            startActivity(in);
            finish();
        }
    }
}