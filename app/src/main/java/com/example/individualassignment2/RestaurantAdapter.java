package com.example.individualassignment2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {
//Declare variables
    private ArrayList<Restaurant> rList;
    private RecyclerViewClickListener rListener;
    private int[] rPreview;

//Constructor
    public RestaurantAdapter(ArrayList<Restaurant> restaurants, int[] images, RecyclerViewClickListener listener) {
        rList = restaurants;
        rListener = listener;
        rPreview = images;
    }

    public interface RecyclerViewClickListener {
        void onClick(View v, int position);
    }
//Create ViewHolder class
    public static class RestaurantViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name, rating, cuisine;
        public ImageView preview;
        private RecyclerViewClickListener rListener;

        public RestaurantViewHolder(View v, RecyclerViewClickListener listener) {
            super(v);
            rListener = listener;
            v.setOnClickListener(this);
            name = v.findViewById(R.id.txvName);
            cuisine = v.findViewById(R.id.txvCuisine);
            rating = v.findViewById(R.id.txvRating);
            preview = v.findViewById(R.id.imvPreview);
        }

        @Override
        public void onClick(View view) {
            rListener.onClick(view, getAdapterPosition());
        }
    }
//Define view for viewholder
    @Override
    public RestaurantAdapter.RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_row, parent, false);
        return new RestaurantViewHolder(v, rListener);
    }
//Bind data to view
    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position) {
        Restaurant restaurant = rList.get(position);
        int previewPosition = rPreview[position];
        holder.name.setText(restaurant.getName());
        holder.cuisine.setText(restaurant.getCuisine());
        holder.rating.setText(String.valueOf(restaurant.getRating()));
        holder.preview.setImageResource(previewPosition);
    }
//Return amount of data needed
    @Override
    public int getItemCount() {
        return rList.size();
    }
}
