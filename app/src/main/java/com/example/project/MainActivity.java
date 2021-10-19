package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView navBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initNavBar();//initialises the Navigation Bar
    }

    public void initNavBar(){
        navBar = findViewById(R.id.navigationBar);

        getSupportFragmentManager().beginTransaction().replace(R.id.mainActivity,new home()).commit();
        navBar.setSelectedItemId(R.id.home);

        navBar.setOnNavigationItemSelectedListener(item -> {

            Fragment currentFrag =  null;
            switch (item.getItemId()){
                case(R.id.home):
                    currentFrag =  new home();
                    break;
                case(R.id.search):
                    currentFrag = new search();
                    break;
                case(R.id.account):
                    currentFrag = new account();
                    break;
                case(R.id.settings):
                    currentFrag = new settings();
                    break;
            }
            assert currentFrag != null;
            getSupportFragmentManager().beginTransaction().replace(R.id.mainActivity,currentFrag).commit();
            return true;
        });

    }
}