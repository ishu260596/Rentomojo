package com.example.rentomojo.packageactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentomojo.R;


public class ElectronicsFragment extends Fragment {

    public static ElectronicsFragment newInstance(){
        ElectronicsFragment electronicsFragment = new ElectronicsFragment();
        return electronicsFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_electronics, container, false);
    }
}