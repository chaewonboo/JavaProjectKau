package com.example.chaewonboo.kaunovel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addClick(View v){
        EditText number1=(EditText) findViewById(R.id.number1);
        EditText number2=(EditText) findViewById(R.id.number2);
    }
}
