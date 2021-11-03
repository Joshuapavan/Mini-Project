package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    //Declaring a navbar to navigate between Fragments
    BottomNavigationView navBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initNavBar();//initialises the Navigation Bar
    }

    public void initNavBar(){
        navBar = findViewById(R.id.navigationBar); //Assigning the Xml ID

        //making the initial commit where we just make the Home Fragment as the Primary fragment or initial fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.mainActivity,new home()).commit();
        //Assigning the Navigation Bar's initial selected option as home
        navBar.setSelectedItemId(R.id.home);

        //Setting an On item Selected listener for the navigation bar, since it returns a boolean value we need to return true at the end of this method
        // It is deprecated but there is no alternate for this in the latest versions of the SDK
        navBar.setOnNavigationItemSelectedListener(item -> {

            //Creating an empty fragment which will hold the value of the selected fragment icon
            Fragment currentFrag =  null;

            //Using a Switch Case to identify the selected icon/ item based on the id
            switch (item.getItemId()){
                //if selected id is home, then create a new fragment of home and assign it to current fragment
                case(R.id.home):
                    currentFrag =  new home();
                    break;
                //if selected id is search, then create a new fragment of search and assign it to current fragment
                case(R.id.search):
                    currentFrag = new search();
                    break;
                //if selected id is account, then create a new fragment of account and assign it to current fragment
                case(R.id.account):
                    currentFrag = new account();
                    break;
                //if selected id is settings, then create a new fragment of settings and assign it to current fragment
                case(R.id.settings):
                    currentFrag = new settings();
                    break;
            }
            //to avoid errors or exceptions that might occur when the current fragment is null
            assert currentFrag != null;
            //if the current fragment is not null, we are replacing the main activity with current fragment and making a commit
            getSupportFragmentManager().beginTransaction().replace(R.id.mainActivity,currentFrag).commit();
            //returning true since we have selected an item or fragment
            return true;
        });
    }
}