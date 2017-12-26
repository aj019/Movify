package in.androidmate.anujgupta.movify.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import butterknife.BindView;
import in.androidmate.anujgupta.movify.R;

public class MainActivity extends AppCompatActivity implements MainViewInterface {

    @BindView(R.id.rvMovies)
    RecyclerView rvMovies;

    MainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupMVP();
        showToast();
    }

    private void setupMVP() {
        mainPresenter = new MainPresenter(this);
    }

    @Override
    public void showToast() {
        String str = mainPresenter.getToastMessage();
        Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();
    }
}
