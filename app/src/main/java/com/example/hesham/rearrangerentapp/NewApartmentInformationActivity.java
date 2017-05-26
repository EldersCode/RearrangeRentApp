package com.example.hesham.rearrangerentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;

public class NewApartmentInformationActivity extends AppCompatActivity {

    // layout instances

    private EditText priceEditText;
    private EditText ApartmentAreaEditText;
    private EditText noOfBedRoomsEditText;
    private EditText noOfBathRoomsEditText;
    private Switch parkingLotsSwitch;
    private Switch LivingRoomSwitch;
    private Switch KitchenSwitch;
    private Switch coolingSystemSwitch;
    private Switch NegotiablePriceSwitch;
    private Switch petsSwitch;
    private LinearLayout petsLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_apartment_information);

        //declaring instances

        petsLayout = (LinearLayout) findViewById(R.id.switchOn_pets);
        petsSwitch = (Switch) findViewById(R.id.petSwitch);
        priceEditText = (EditText) findViewById(R.id.Price);
        ApartmentAreaEditText = (EditText) findViewById(R.id.area);
        noOfBedRoomsEditText = (EditText) findViewById(R.id.bedrooms);
        noOfBathRoomsEditText = (EditText) findViewById(R.id.bathrooms);
        parkingLotsSwitch = (Switch) findViewById(R.id.ParkingSwitch);
        LivingRoomSwitch = (Switch) findViewById(R.id.livingRoomSwitch);
        KitchenSwitch = (Switch) findViewById(R.id.kitchenSwitch);
        coolingSystemSwitch = (Switch) findViewById(R.id.coolingSystemSwitch);
        NegotiablePriceSwitch = (Switch) findViewById(R.id.negotiablePriceSwitch);

        // handling the pets switch

        petsLayout.setVisibility(View.GONE);
        petsSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    petsLayout.setVisibility(View.VISIBLE);
                } else {
                    petsLayout.setVisibility(View.GONE);

                }

            }
        });


    }
}
