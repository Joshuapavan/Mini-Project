package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class login extends Fragment {

    EditText email, password;
    Button loginButton, skipButton;
    ImageButton googleButton, facebookButton;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View loginView = super.onCreateView(inflater, container, savedInstanceState);

        //edit Text
        assert loginView != null;
        email = loginView.findViewById(R.id.email);
        password =  loginView.findViewById(R.id.password);
        //Buttons
        loginButton = loginView.findViewById(R.id.login);
        skipButton = loginView.findViewById(R.id.skip);
        //image button
        googleButton =  loginView.findViewById(R.id.googleSignIn);
        facebookButton = loginView.findViewById(R.id.facebookSignIn);
        return(loginView);
    }
}
