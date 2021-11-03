package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class LoginActivity extends AppCompatActivity {

    //Declaring all the widgets objects
    EditText email, password;
    Button loginButton, skipButton;
    ImageButton googleButton, facebookButton;
    String googleUrl, facebookUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        assignId();

        skip(skipButton); //Method for skip button
        google(googleButton,googleUrl); //Method to validate google login
        facebook(facebookButton,facebookUrl); //method to validate facebook login
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
        //assigning urls
        googleUrl = "https://accounts.google.com/signin/v2/identifier?continue..&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
        facebookUrl = "https://www.facebook.com/";
    }

    //Method for skip button, Which just moves from login activity to main Activity
    void skip(Button skipButton){
        skipButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        });
    }

    //Method that contains an onclickListener for google ImageButton which, creates an implicit intent and the url parsed is the google login url
    void facebook(ImageButton googleButton, String googleUrl){
        googleButton.setOnClickListener(v ->{
            Intent googleIntent = new Intent(Intent.ACTION_VIEW);
            googleIntent.setData(Uri.parse(googleUrl));
            startActivity(googleIntent);
        });
    }

    //Method that contains an onclickListener for facebook ImageButton which, creates an implicit intent and the url parsed is the google login url
    void google(ImageButton facebookButton, String  facebookUrl){
        facebookButton.setOnClickListener(v ->{
            Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
            facebookIntent.setData(Uri.parse(facebookUrl));
            startActivity(facebookIntent);
        });
    }
}