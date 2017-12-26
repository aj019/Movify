package in.androidmate.anujgupta.movify.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import in.androidmate.anujgupta.movify.R;

public class MainActivity extends AppCompatActivity implements MainViewInterface {

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
