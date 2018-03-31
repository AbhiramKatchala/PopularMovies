package com.popularmovies.popularmovies;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Srinivasan on 12-02-2018.
 */

public class MoviesAdapter extends ArrayAdapter<Movies> {

    public MoviesAdapter(Activity context, ArrayList<Movies> popularMovies){
        super(context, 0, popularMovies);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        Movies currentMovie = getItem(position);

        ImageView movieImage = (ImageView) listItemView.findViewById(R.id.movie_image);
        movieImage.setImageResource(currentMovie.getMovieImageResource());

        TextView movieTitle = (TextView) listItemView.findViewById(R.id.movie_title);
        movieTitle.setText(currentMovie.getMovieTitle());

        TextView movieDesc = (TextView) listItemView.findViewById(R.id.movie_desc);
        movieDesc.setText(currentMovie.getMovieDesc());


        return listItemView;
    }
}
