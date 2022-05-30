package com.example.recyclerviewtutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    
    ArrayList<ModelClass> list = new ArrayList<>();
    String[] Movie_names = {"RRR" , "cinema" , "matrix" , "pushpa" , "war"};
    String[] Movie_rating = {"6.0" , "5.0" , "9.0" , "8.0" , "10.0"};

    int[] MovieImages = {R.drawable.rrr , R.drawable.cinema , R.drawable.matrix , R.drawable.pushpa , R.drawable.war};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Attaching the adapter to the recycler view

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        setUpModel();

        // Create the adapter after the models are setup

        MovieAdapter adapter = new MovieAdapter(this, list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpModel(){

        for(int i = 0 ; i < MovieImages.length ; i++){
            list.add(new ModelClass(Movie_names[i] , Movie_rating[i] , MovieImages[i]));
        }
    }
}