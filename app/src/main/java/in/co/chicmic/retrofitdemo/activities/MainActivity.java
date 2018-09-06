package in.co.chicmic.retrofitdemo.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import in.co.chicmic.retrofitdemo.R;
import in.co.chicmic.retrofitdemo.adapters.MoviesAdapter;
import in.co.chicmic.retrofitdemo.dataModels.Movie;
import in.co.chicmic.retrofitdemo.dataModels.MovieApiResponse;
import in.co.chicmic.retrofitdemo.rest.ApiClient;
import in.co.chicmic.retrofitdemo.rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private final static String API_KEY = "2155e6d81b494968ac2af6f8bd30b807";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = findViewById(R.id.movies_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<MovieApiResponse> call = apiService.getTopRatedMovies(API_KEY);
        call.enqueue(new Callback<MovieApiResponse>() {
            @Override
            public void onResponse(@NonNull Call<MovieApiResponse> call, @NonNull Response<MovieApiResponse> response) {
                List<Movie> movies;
                if (response.body() != null) {
                    movies = response.body().getmMovieList();
                } else {
                    movies = new ArrayList<>();
                }
                recyclerView.setAdapter(new MoviesAdapter(movies, R.layout.movie_list_item));
            }

            @Override
            public void onFailure(@NonNull Call<MovieApiResponse> call, @NonNull Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });
    }
}
