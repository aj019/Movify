package in.androidmate.anujgupta.movify.ui;

/**
 * Created by anujgupta on 26/12/17.
 */

public class MainPresenter implements MainPresenterInterface {

    MainViewInterface mvi;

    public MainPresenter(MainViewInterface mvi) {
        this.mvi = mvi;
    }

    @Override
    public String getToastMessage() {
        return "Hello World";
    }
}
