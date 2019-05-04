package com.example.cape_medics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login_Page extends AppCompatActivity {
    Button login;
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Login_Page);
        login = findViewById(R.id.LoginButton);
        username = findViewById(R.id.Username);
        password = findViewById(R.id.Password);
    }

    public void Login (View v){
        //add code to check username and password here (add else disp toast) and decide whether manager or crew
        if (username.equals("manager")){
            Intent i = new Intent(getApplicationContext(), Home_Screen_Manager.class);
            startActivity(i);
        }
        else {
            Intent i = new Intent(getApplicationContext(), Home_Screen_Crew.class);
            startActivity(i);
        }
    }
}
