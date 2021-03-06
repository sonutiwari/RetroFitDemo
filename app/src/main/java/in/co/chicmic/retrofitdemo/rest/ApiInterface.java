package in.co.chicmic.retrofitdemo.rest;

import in.co.chicmic.retrofitdemo.dataModels.MovieApiResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("movie/top_rated")
    Call<MovieApiResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MovieApiResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
