package com.example.individualassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RestaurantDetails extends AppCompatActivity {
    private ImageView headerImage;
    private TextView title, location, rating, description, cuisine;
    private Restaurant restaurants;
//    private int[] images = {R.drawable.sokyo, R.drawable.restaurant_hubert, R.drawable.gelato_messina, R.drawable.bourke_street_bakery, R.drawable.cow_and_the_moon,
//            R.drawable.bennelong_restaurant, R.drawable.lumi_bar_and_dining, R.drawable.baxter_inn, R.drawable.mappen_noodle_restaurant, R.drawable.cafe_cre_asion};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_details);

        Intent intent = getIntent();
        Bundle receiveExtras = intent.getExtras();
        int position = receiveExtras.getInt("EXTRA_MESSAGE");

        int[] imageArray = receiveExtras.getIntArray("IMAGES");

        restaurants = Restaurant.getRestaurants().get(position);

        headerImage = findViewById(R.id.imgPhoto);
        title = findViewById(R.id.txvName);
        location = findViewById(R.id.txvLocation);
        rating = findViewById(R.id.txvRating);
        description = findViewById(R.id.txvDescription);
        cuisine = findViewById(R.id.txvCuisine);

        headerImage.setImageResource(imageArray[position]);
        title.setText(restaurants.getName());
        location.setText(restaurants.getLocation());
        rating.setText(String.valueOf(restaurants.getRating()));
        description.setText(restaurants.getDescription());
        cuisine.setText(restaurants.getCuisine());
    }
}
