package in.co.chicmic.retrofitdemo.adapters;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import in.co.chicmic.retrofitdemo.R;
import in.co.chicmic.retrofitdemo.dataModels.Movie;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {

    private List<Movie> movies;
    private int rowLayout;
    private Context mContext;


    static class MovieViewHolder extends RecyclerView.ViewHolder {
        LinearLayout moviesLayout;
        TextView movieTitle;
        TextView data;
        TextView movieDescription;
        TextView rating;
        ImageView mPosterImage;


        MovieViewHolder(View v) {
            super(v);
            moviesLayout = v.findViewById(R.id.movies_layout);
            movieTitle = v.findViewById(R.id.title);
            data = v.findViewById(R.id.subtitle);
            movieDescription = v.findViewById(R.id.description);
            rating = v.findViewById(R.id.rating);
            mPosterImage = v.findViewById(R.id.movie_poster);
        }
    }

    public MoviesAdapter(List<Movie> movies, int rowLayout) {
        this.movies = movies;
        this.rowLayout = rowLayout;
    }

    @NonNull
    @Override
    public MoviesAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                            int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MovieViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, final int position) {
        holder.movieTitle.setText(movies.get(position).getTitle());
        holder.data.setText(movies.get(position).getOriginalTitle());
        holder.movieDescription.setText(movies.get(position).getOverView());
        holder.rating.setText(String.valueOf(movies.get(position).getVoteAverage()));
        Glide.with(mContext).load(Uri.parse("http://image.tmdb.org/t/p/w185/" + movies.get(position).getPosterPath())).into(holder.mPosterImage);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
