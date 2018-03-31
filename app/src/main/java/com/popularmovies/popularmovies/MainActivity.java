package com.popularmovies.popularmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Movies> popularMovies = new ArrayList<Movies>();

        popularMovies.add(new Movies(R.drawable.tholiprema ,"Tholiprema", "This is New Movie"));
        popularMovies.add(new Movies(R.drawable.intjent ,"Intelligent", "This is New Movie"));


        ListView listView = (ListView) findViewById(R.id.movie_list);
        MoviesAdapter adapter = new MoviesAdapter(this, popularMovies);
        listView.setAdapter(adapter);
    }
}
