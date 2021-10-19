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

public class 
account extends Fragment {

    Boolean LoggedIn = true;

    Button logoutButton,editButton;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.account_fragment,container,false);

        logoutButton =  view.findViewById(R.id.logoutButton);
        editButton =  view.findViewById(R.id.editButton);

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logoutIntent =  new Intent(getActivity(),LoginActivity.class);
                startActivity(logoutIntent);
                Toast.makeText(getActivity(),R.string.logoutToast,Toast.LENGTH_LONG).show();
            }
        });


        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return(view);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(!LoggedIn){
            Intent LoginIntent =  new Intent(getContext(),LoginActivity.class);
            startActivity(LoginIntent);
        }//else{
        //          code to retrive the profile from the database and display it
        //}
    }
}
