package es.iessaladillo.pedrojoya.countingclicks;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import es.iessaladillo.pedrojoya.countingclicks.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {

    private MainActivityBinding b;
    private int times;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = MainActivityBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        setupViews();
    }

    private void setupViews() {
        b.btnClickMe.setOnClickListener(this::incrementAndShow);
    }

    private void incrementAndShow(View v) {
        times++;
        showTimes();
    }

    private void showTimes() {
        b.lblTimes.setText(getString(R.string.main_times, times));
    }

}
