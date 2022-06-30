package com.naufal.foodmapping10119259;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ViewPagerItem extends AppCompatActivity {

    int imageID;
    String heading, description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_item);
    }

    public  ViewPagerItem(int imageID, String heading, String description) {
        this.imageID = imageID;
        this.heading = heading;
        this.description = description;
    }
}