package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class LoginActivity extends AppCompatActivity {

    EditText email, password;
    Button loginButton, skipButton;
    ImageButton googleButton, facebookButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        assignId();
    }

    public void assignId(){
        //edit Text
        email = findViewById(R.id.email);
        password =  findViewById(R.id.password);
        //Buttons
        loginButton = findViewById(R.id.login);
        skipButton = findViewById(R.id.skip);
        //image button
        googleButton =  findViewById(R.id.googleSignIn);
        facebookButton = findViewById(R.id.facebookSignIn);
    }
}