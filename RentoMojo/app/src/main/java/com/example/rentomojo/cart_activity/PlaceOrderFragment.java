package com.example.rentomojo.cart_activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.rentomojo.R;

public class PlaceOrderFragment extends Fragment {

    private Button mBtnPlaceOrder;
    private TextView mTvPrice_1;
    private TextView mTvPrice_2;
    private TextView mTvPrice_3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_place_order, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    private void initViews(View view) {
        mBtnPlaceOrder=view.findViewById(R.id.btnPlaceOrder);
        mTvPrice_1=view.findViewById(R.id.tvPrice_1);
        mTvPrice_2=view.findViewById(R.id.tvPrice_2);
        mTvPrice_3=view.findViewById(R.id.tvPrice_3);
    }
}