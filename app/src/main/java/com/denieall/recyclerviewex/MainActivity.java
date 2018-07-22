package com.denieall.recyclerviewex;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.denieall.recyclerviewex.Adapter.MyAdapter;
import com.denieall.recyclerviewex.Model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler_view;
    private  RecyclerView.Adapter adapter;

    private ArrayList<Movie> movies_list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_view = findViewById(R.id.recycler_view_movies);
        recycler_view.setHasFixedSize(true);

        recycler_view.setLayoutManager(new LinearLayoutManager(this));

        prepareMovieList();

        adapter = new MyAdapter(getApplicationContext(), movies_list);
        recycler_view.setAdapter(adapter);

    }

    private void prepareMovieList() {

        movies_list.add(new Movie(
                "Iron Man 3",
                R.drawable.ironman_logo,
                "2013",
                "When Tony Stark's world is torn apart by a formidable terrorist called the Mandarin, he starts an odyssey of rebuilding and retribution.",
                R.drawable.ironman_wallpaper
        ));

        movies_list.add(new Movie(
                "Batman Begins",
                R.drawable.batman_logo,
                "2005",
                "After training with his mentor, Batman begins his fight to free crime-ridden Gotham City from the corruption that Scarecrow and the League of Shadows have cast upon it.",
                R.drawable.batman_wallpaper
        ));

        movies_list.add(new Movie(
                "Superman Returns",
                R.drawable.superman_logo,
                "2006",
                "Superman reappears after a long absence, but is challenged by an old foe who uses Kryptonian technology for world domination.",
                R.drawable.superman_wallpaper
        ));

        movies_list.add(new Movie(
                "Green Lantern",
                R.drawable.green_lantern_logo,
                "2011",
                "Reckless test pilot Hal Jordan is granted an alien ring that bestows him with otherworldly powers that inducts him into an intergalactic police force, the Green Lantern Corps.",
                R.drawable.green_lantern_wallpaper
        ));

        movies_list.add(new Movie(
                "Captain America",
                R.drawable.captain_america_logo,
                "2011",
                "Steve Rogers, a rejected military soldier transforms into Captain America after taking a dose of a \"Super-Soldier serum\". But being Captain America comes at a price as he attempts to take down a war monger and a terrorist organization.",
                R.drawable.captain_america_wallpaper
        ));

        movies_list.add(new Movie(
                "Thor",
                R.drawable.thor_logo,
                "2011",
                "The powerful, but arrogant god Thor, is cast out of Asgard to live amongst humans in Midgard (Earth), where he soon becomes one of their finest defenders.",
                R.drawable.thor_wallpaper
        ));

        movies_list.add(new Movie(
                "Avengers",
                R.drawable.avengers_logo,
                "2012",
                "Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.",
                R.drawable.avengers_wallpaper
        ));
    }
}
