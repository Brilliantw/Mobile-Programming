package com.example.lab.quickcoding02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private Button btn2;

    private View v1;
    private View v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.SEND);
        btn2 = (Button)findViewById(R.id.BIGGER);

        v1 = findViewById(R.id.SEND);
        v2 = findViewById(R.id.BIGGER);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    public void onClick(View v) {

        Toast.makeText(this,"asd",Toast.LENGTH_LONG).show();
    }
}
