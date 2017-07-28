package com.example.a0.teaching;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by 3bood_000 on 7/28/2017.
 */

public class TeachersShow extends AppCompatActivity {

    String[] title = {

            "The Shawshank Redemption",
            "The Godfather",
            "The Dark Knight",
            "Schindler's List",
            "Fight Club",
            "Inception",
            "The Matrix",
            "The Silence of the Lambs",
            "Life Is Beautiful",
            "Interstellar"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardsview);

        MoviesAdapter adpater = new MoviesAdapter(TeachersShow.this, title);
        RecyclerView rview = (RecyclerView) findViewById(R.id.my_recycler_view);
        rview.setItemAnimator(new DefaultItemAnimator());
        rview.setAdapter(adpater);
        rview.setLayoutManager(new LinearLayoutManager(TeachersShow.this));

    }

}