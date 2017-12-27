package in.androidmate.anujgupta.movify.network;


import in.androidmate.anujgupta.movify.models.MovieResponse;
import in.androidmate.anujgupta.movify.models.SearchResponse;
import io.reactivex.Observable;
import io.reactivex.Observer;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by anujgupta on 26/12/17.
 */

public interface NetworkInterface {

    @GET("discover/movie")
    Observable<MovieResponse> getMovies(@Query("api_key") String api_key);

    @GET("search/keyword")
    Observer<SearchResponse> getMoviesBasedOnQuery(@Query("api_key") String api_key, @Query("query") String q);
}
