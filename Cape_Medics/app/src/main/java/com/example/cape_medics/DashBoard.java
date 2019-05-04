package com.example.cape_medics;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DashBoard extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView CurrentJobs;
    ListView PastJobs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        // will get arrays off database
        String[] currentArray = {"Current Job 1", "Current Job 2"} ;
        String[] pastArray ={"Past Job 1", "Past Job 2"} ;

        CurrentJobs = findViewById(R.id.Current_Jobs);
        PastJobs = findViewById(R.id.Past_Jobs);
        ArrayAdapter<String> currentJobs = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,currentArray);
        ArrayAdapter<String> pastJobs = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,pastArray);
        CurrentJobs.setAdapter(currentJobs);
        CurrentJobs.setOnItemClickListener(this);
        PastJobs.setAdapter(pastJobs);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Swap Shift")
                .setMessage("Do you want to swap this job shift with someone?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(getApplicationContext(), SwapShift.class);
                        i.putExtra("job", String.valueOf(CurrentJobs.getItemAtPosition(position)));
                        startActivity(i);
                    }
                });
        builder.create();

    }
}
