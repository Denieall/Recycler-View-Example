package com.denieall.recyclerviewex.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.denieall.recyclerviewex.Model.Movie;
import com.denieall.recyclerviewex.MovieDetails_Activity;
import com.denieall.recyclerviewex.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    public static final String TAG = "MyAdapter";

    private static Context context;
    private static ArrayList<Movie> movies;

    public MyAdapter(Context c, ArrayList<Movie> listitems) {
        context = c;
        movies = listitems;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        // view now holds the entire list_row layout
        // LayoutInflater will turn xml into design view form
        // Passing view to the ViewHolder inner class

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movies_row, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder viewHolder, int i) {

        Log.d(TAG, "onBindViewHolder: " + i);

        // viewHolder is an object of ViewHolder inner class
        // As such, all its fields and methods are available here

        viewHolder.name.setText(movies.get(i).getName());
        viewHolder.plot.setText("Year: " + movies.get(i).getYear());
        Glide.with(context).asBitmap().load(movies.get(i).getPoster()).apply(new RequestOptions().fitCenter()).into(viewHolder.poster);

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        TextView plot;
        CircleImageView poster;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.title_tv);
            plot = itemView.findViewById(R.id.description_tv);
            poster = itemView.findViewById(R.id.circleImageView);
            cardView = itemView.findViewById(R.id.cardView);

            // Setting onclick listener for items in the list
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // Get which item is clicked in the recycler view
                    int i = getAdapterPosition();

                    // Send to another activity onclick
                    Intent intent = new Intent(context, MovieDetails_Activity.class);
                    intent.putExtra("name", movies.get(i).getName());
                    intent.putExtra("year", movies.get(i).getYear());
                    intent.putExtra("wallpaper", movies.get(i).getWallpaper());
                    intent.putExtra("poster", movies.get(i).getPoster());
                    intent.putExtra("plot", movies.get(i).getPlot());
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);

                }
            });
        }
    }
}
