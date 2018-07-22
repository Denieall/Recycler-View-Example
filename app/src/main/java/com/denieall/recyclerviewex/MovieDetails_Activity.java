package com.denieall.recyclerviewex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class MovieDetails_Activity extends AppCompatActivity {

    TextView title_tv_1, year, plot;
    ImageView wallpaper;
    CircleImageView poster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        title_tv_1 = findViewById(R.id.title_text_view);
        year = findViewById(R.id.movie_year);
        wallpaper = findViewById(R.id.walllpaper_imageView);
        plot = findViewById(R.id.movie_plot);
        poster = findViewById(R.id.logo_imageView);

        Intent i = getIntent();

        title_tv_1.setText(i.getStringExtra("name"));
        Log.i("title", i.getStringExtra("name"));

        year.setText(i.getStringExtra("year"));
        plot.setText(i.getStringExtra("plot"));
        Glide.with(this).asBitmap().load(i.getIntExtra("poster", 0)).into(poster);
        Glide.with(this).asBitmap().load(i.getIntExtra("wallpaper", 0)).into(wallpaper);

    }
}
