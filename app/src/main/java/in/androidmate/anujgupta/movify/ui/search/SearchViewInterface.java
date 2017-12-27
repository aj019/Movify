package in.androidmate.anujgupta.movify.ui.search;

import in.androidmate.anujgupta.movify.models.MovieResponse;

/**
 * Created by anujgupta on 27/12/17.
 */

public interface SearchViewInterface {

    void showToast(String str);
    void displayResult(MovieResponse movieResponse);
    void displayError(String s);
}
