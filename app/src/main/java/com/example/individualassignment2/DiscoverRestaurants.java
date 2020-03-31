package com.example.individualassignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DiscoverRestaurants extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "au.edu.unsw.infs3634.beers.message";
    public static final String IMAGES = "au.edu.unsw.infs3634.beers.message";
    private RecyclerView rList;
    private RecyclerView.Adapter rAdapter;
    private RecyclerView.LayoutManager rLayoutManager;
    private int[] images = {R.drawable.sokyo, R.drawable.restaurant_hubert, R.drawable.gelato_messina, R.drawable.bourke_street_bakery, R.drawable.cow_and_the_moon,
    R.drawable.bennelong_restaurant, R.drawable.lumi_bar_and_dining, R.drawable.baxter_inn, R.drawable.mappen_noodle_restaurant, R.drawable.cafe_cre_asion};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover_restaurants);

        rList = findViewById(R.id.restaurantList);
        rList.setHasFixedSize(true);

        rLayoutManager = new LinearLayoutManager(this);
        rList.setLayoutManager(rLayoutManager);
        RestaurantAdapter.RecyclerViewClickListener listener = new RestaurantAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                launchDetailActivity(position, images);
            }
        };
        rAdapter = new RestaurantAdapter(Restaurant.getRestaurants(), images, listener);
        rList.setAdapter(rAdapter);
    }

    private void launchDetailActivity(int position, int[] images) {
        Intent intent = new Intent(this, RestaurantDetails.class);
        Bundle extras = new Bundle();
        extras.putInt("EXTRA_MESSAGE", position);
        extras.putIntArray("IMAGES", images);
        intent.putExtras(extras);
        startActivity(intent);
    }
}
