package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class account extends Fragment {

    Boolean LoggedIn = true;

    // creating a view object, accountView which will hold all the widgets of the account fragment
    View accountView;

    //Declaring the widget objects
    Button logoutButton,editButton;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Creating a View object called accountView which will contain all the widgets that are created inside the fragment
        accountView = inflater.inflate(R.layout.account_fragment,container,false);

        initialise(accountView); //method used to initialise all the widget objects

        logOut(logoutButton); //method for logout button
        edit(editButton); //method for edit button

        return(accountView); //returning the accountView to inflate in th layout
    }

    //method used to initialise all the widget objects
    void initialise(View accountView){
        logoutButton =  accountView.findViewById(R.id.logoutButton);
        editButton =  accountView.findViewById(R.id.editButton);
    }

    //method which holds onclickListener for logout button, which is used to logout from the current account and display a toast saying that we have logged out
    void logOut(Button logoutButton){
        logoutButton.setOnClickListener(v -> {
            Intent logoutIntent = new Intent(getActivity(),LoginActivity.class);
            startActivity(logoutIntent);
            Toast.makeText(getActivity(),R.string.logoutToast,Toast.LENGTH_SHORT).show();
        });
    }
    //method which holds onclickListener for edit button
    void edit(Button editButton){
        editButton.setOnClickListener(v -> {

        });
    }
}
