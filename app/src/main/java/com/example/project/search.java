package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public  class search extends Fragment {

    //Declaring widget objects
    Button newButton;
    EditText searchBar;
    View searchView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Creating a View object called searchView which will contain all the widgets that are created inside the fragment
        searchView = inflater.inflate(R.layout.search_fragment,container,false);

        initialise(searchView); //method to initialise all the widgets object to the Xml
        newDiary(newButton); //method that has on click listener for the new note fragment or activity

        return (searchView);//returning the view to the inflater which will display all the contents
    }

    //method to initialise all the widget objects
    void initialise(View searchView){
        newButton = searchView.findViewById(R.id.newButton);
        searchBar = searchView.findViewById(R.id.search);
    }

    //method that contains the onclick listener for the new button which basically holds the intent which is to be passed when creating a fragment/ Activity
    void newDiary(Button newButton){
//        newButton.setOnClickListener(v -> {
//                Intent createNewDiary = new Intent(getActivity(),NewNote.class);
//                startActivity(createNewDiary);
//        });
    }
}