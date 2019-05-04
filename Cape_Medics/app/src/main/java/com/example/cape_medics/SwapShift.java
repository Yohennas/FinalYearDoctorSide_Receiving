package com.example.cape_medics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SwapShift extends AppCompatActivity {
    EditText motivation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swap_shift);
        motivation = findViewById(R.id.MotivationText);
        Bundle bundle = getIntent().getExtras();
        String jobName = bundle.getString("job");
    }

    public void Send (View v){
        //send information to to database i.e. job name, person who sent it and the persons motivation
        Intent i = new Intent(getApplicationContext(), Home_Screen_Crew.class);
        startActivity(i);
        Toast.makeText(this, "Request Sent",Toast.LENGTH_LONG).show();
    }

    public void Cancel (View v){
        Intent i = new Intent(getApplicationContext(), Home_Screen_Crew.class);
        startActivity(i);
    }
}
