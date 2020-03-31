package com.example.individualassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnDiscover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDiscover = findViewById(R.id.btnA2);
        btnDiscover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchDiscoverRestaurants();
            }
        });
    }

    private void launchDiscoverRestaurants() {
        Intent intent = new Intent(this, DiscoverRestaurants.class);
        startActivity(intent);
    }
}


