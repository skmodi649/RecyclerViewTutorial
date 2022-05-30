package com.example.recyclerviewtutorial;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {
    @NonNull
    @Override
    public MovieAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // This is where we are going to inflate the layout (Basically giving a look to the rows)
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MyViewHolder holder, int position) {
        // assigning values to the views we created in the recycler_view_row layout file
        // based on the position of the recycler view
    }

    @Override
    public int getItemCount() {
        // the recycler view just wants to know the number of items you want to be displayed
        return 0;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        // grabbing the views from our recycler_view_row layout file
        // kinda like in the onCreate method

        ImageView imageView;
        TextView name, rating;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.movie_poster);
            name = itemView.findViewById(R.id.movie_name);
            rating = itemView.findViewById(R.id.movie_rating);
        }
    }

}
