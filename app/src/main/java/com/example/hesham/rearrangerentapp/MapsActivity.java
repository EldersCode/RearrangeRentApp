package com.example.hesham.rearrangerentapp;


import android.os.Bundle;

public class MapsActivity extends HandlingMaps {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        onCreateHandle();

    }


}
