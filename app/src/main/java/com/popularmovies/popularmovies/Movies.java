package com.popularmovies.popularmovies;

/**
 * Created by Srinivasan on 12-02-2018.
 */

public class Movies {

    private String mMovieTitle;

    private String mMovieDesc;

    private int mMovieImageResource;

    public Movies(int movieImageResource, String movieTitle, String movieDesc){

        this.mMovieImageResource = movieImageResource;
        this.mMovieTitle = movieTitle;
        this.mMovieDesc = movieDesc;

    }

    public void setmMovieTitle(String mMovieTitle) {
        this.mMovieTitle = mMovieTitle;
    }

    public void setmMovieDesc(String mMovieDesc) {
        this.mMovieDesc = mMovieDesc;
    }

    public void setmMovieImageResource(int mMovieImageResource) {
        this.mMovieImageResource = mMovieImageResource;
    }

    public int getMovieImageResource(){
        return mMovieImageResource;
    }

    public String getMovieTitle(){
        return mMovieTitle;
    }

    public String getMovieDesc(){
        return mMovieDesc;
    }
}
