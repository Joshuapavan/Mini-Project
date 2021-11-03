package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class settings extends Fragment {

    // creating a view object, settingsView which will hold all the widgets of the account fragment
    View settingView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        settingView = (inflater.inflate(R.layout.settings_fragment,container,false));

        initialse(settingView);//method used to initialise all the widgets of the settings Fragment using settingsView
        return(settingView); //returning the settingsView to inflate in th layout
    }

    //method used to initialise all the widgets of the settings Fragment using settingsView
    void initialse(View settingView){

    }
}
