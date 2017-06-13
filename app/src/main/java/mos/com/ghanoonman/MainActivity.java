package mos.com.ghanoonman;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Movie1> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);

        mAdapter = new MoviesAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        Movie1 movie = new Movie1("Mad Max: Fury Road", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie1("Inside Out", "Animation, Kids & Family", "2015");
        movieList.add(movie);

        movie = new Movie1("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);

        movie = new Movie1("Shaun the Sheep", "Animation", "2015");
        movieList.add(movie);

        movie = new Movie1("The Martian", "Science Fiction & Fantasy", "2015");
        movieList.add(movie);

        movie = new Movie1("Mission: Impossible Rogue Nation", "Action", "2015");
        movieList.add(movie);

        movie = new Movie1("Up", "Animation", "2009");
        movieList.add(movie);

        movie = new Movie1("Star Trek", "Science Fiction", "2009");
        movieList.add(movie);

        movie = new Movie1("The LEGO mos.com.ghanoonman.Movie", "Animation", "2014");
        movieList.add(movie);

        movie = new Movie1("Iron Man", "Action & Adventure", "2008");
        movieList.add(movie);

        movie = new Movie1("Aliens", "Science Fiction", "1986");
        movieList.add(movie);

        movie = new Movie1("Chicken Run", "Animation", "2000");
        movieList.add(movie);

        movie = new Movie1("Back to the Future", "Science Fiction", "1985");
        movieList.add(movie);

        movie = new Movie1("Raiders of the Lost Ark", "Action & Adventure", "1981");
        movieList.add(movie);

        movie = new Movie1("Goldfinger", "Action & Adventure", "1965");
        movieList.add(movie);

        movie = new Movie1("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieList.add(movie);

        mAdapter.notifyDataSetChanged();
    }


}
