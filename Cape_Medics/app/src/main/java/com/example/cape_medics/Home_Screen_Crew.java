package com.example.cape_medics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home_Screen_Crew extends AppCompatActivity {
    Button checkin;
    Button dashboard;
    Button HRform;
    Button MedRecords;
    Button timesheet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__screen_crew);
        checkin = findViewById(R.id.CheckIn);
        dashboard = findViewById(R.id.DashBoard);
        HRform = findViewById(R.id.HR_Forms);
        MedRecords = findViewById(R.id.MedicalRecords);
        timesheet = findViewById(R.id.TimeSheet);
    }

    public void Dash(View v){
        Intent i = new Intent(getApplicationContext(), DashBoard.class);
        startActivity(i);
    }

    public  void CheckIn(View v){

    }

    public void HR(View v){

    }

    public void MedRec(View v){

    }

    public void TimeSheet(View v){

    }
}
