package in.co.chicmic.retrofitdemo.dataModels;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class MovieApiResponse {
    @SerializedName("page")
    private int mPage;
    @SerializedName("total_results")
    private int mTotalResults;
    @SerializedName("total_pages")
    private int mTotalPages;
    @SerializedName("results")
    private List<Movie> mMovieList = new ArrayList<>();

    public MovieApiResponse(int mPage, int mTotalResults, int mTotalPages, List<Movie> mMovieList) {
        this.mPage = mPage;
        this.mTotalResults = mTotalResults;
        this.mTotalPages = mTotalPages;
        this.mMovieList = mMovieList;
    }

    public int getmPage() {
        return mPage;
    }

    public void setmPage(int mPage) {
        this.mPage = mPage;
    }

    public int getmTotalResults() {
        return mTotalResults;
    }

    public void setmTotalResults(int mTotalResults) {
        this.mTotalResults = mTotalResults;
    }

    public int getmTotalPages() {
        return mTotalPages;
    }

    public void setmTotalPages(int mTotalPages) {
        this.mTotalPages = mTotalPages;
    }

    public List<Movie> getmMovieList() {
        return mMovieList;
    }

    public void setmMovieList(List<Movie> mMovieList) {
        this.mMovieList = mMovieList;
    }
}
