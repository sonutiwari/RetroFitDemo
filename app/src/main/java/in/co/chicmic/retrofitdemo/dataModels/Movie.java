package in.co.chicmic.retrofitdemo.dataModels;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    @SerializedName("vote_count")
    private int mVoteCount;
    @SerializedName("id")
    private int mID;
    @SerializedName("video")
    private boolean mVideo;
    @SerializedName("vote_average")
    private double mVoteAverage;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("popularity")
    private double mPopularity;
    @SerializedName("poster_path")
    private String mPosterPath;
    @SerializedName("original_language")
    private String mOriginalLanguage;
    @SerializedName("original_title")
    private String mOriginalTitle;
    @SerializedName("genre_ids")
    private List<Integer> mGenreIds = new ArrayList<>();
    @SerializedName("backdrop_path")
    private String mBackdropPath;
    @SerializedName("adult")
    private boolean mAdult;
    @SerializedName("overview")
    private String mOverView;
    @SerializedName("release_date")
    private String mReleaseDate;

    public Movie(int mVoteCount, int mID, boolean mVideo, double mVoteAverage, String mTitle
            , double mPopularity, String mPosterPath, String mOriginalLanguage
            , String mOriginalTitle, List<Integer> mGenreIds, String mBackdropPath
            , boolean mAdult, String mOverView, String mReleaseDate) {
        this.mVoteCount = mVoteCount;
        this.mID = mID;
        this.mVideo = mVideo;
        this.mVoteAverage = mVoteAverage;
        this.mTitle = mTitle;
        this.mPopularity = mPopularity;
        this.mPosterPath = mPosterPath;
        this.mOriginalLanguage = mOriginalLanguage;
        this.mOriginalTitle = mOriginalTitle;
        this.mGenreIds = mGenreIds;
        this.mBackdropPath = mBackdropPath;
        this.mAdult = mAdult;
        this.mOverView = mOverView;
        this.mReleaseDate = mReleaseDate;
    }

    public int getVoteCount() {
        return mVoteCount;
    }

    public void setVoteCount(int mVoteCount) {
        this.mVoteCount = mVoteCount;
    }

    public int getID() {
        return mID;
    }

    public void setID(int mID) {
        this.mID = mID;
    }

    public boolean isVideo() {
        return mVideo;
    }

    public void setVideo(boolean mVideo) {
        this.mVideo = mVideo;
    }

    public double getVoteAverage() {
        return mVoteAverage;
    }

    public void setVoteAverage(double mVoteAverage) {
        this.mVoteAverage = mVoteAverage;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public double getPopularity() {
        return mPopularity;
    }

    public void setPopularity(double mPopularity) {
        this.mPopularity = mPopularity;
    }

    public String getPosterPath() {
        return mPosterPath;
    }

    public void setPosterPath(String mPosterPath) {
        this.mPosterPath = mPosterPath;
    }

    public String getOriginalLanguage() {
        return mOriginalLanguage;
    }

    public void setOriginalLanguage(String mOriginalLanguage) {
        this.mOriginalLanguage = mOriginalLanguage;
    }

    public String getOriginalTitle() {
        return mOriginalTitle;
    }

    public void setOriginalTitle(String mOriginalTitle) {
        this.mOriginalTitle = mOriginalTitle;
    }

    public List<Integer> getGenreIds() {
        return mGenreIds;
    }

    public void setGenreIds(List<Integer> mGenreIds) {
        this.mGenreIds = mGenreIds;
    }

    public String getBackdropPath() {
        return mBackdropPath;
    }

    public void setBackdropPath(String mBackdropPath) {
        this.mBackdropPath = mBackdropPath;
    }

    public boolean isAdult() {
        return mAdult;
    }

    public void setAdult(boolean mAdult) {
        this.mAdult = mAdult;
    }

    public String getOverView() {
        return mOverView;
    }

    public void setOverView(String mOverView) {
        this.mOverView = mOverView;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(String mReleaseDate) {
        this.mReleaseDate = mReleaseDate;
    }
}
