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
        b.btnClickMe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                incrementAndShow();
            }
        });
    }

    private void incrementAndShow() {
        times++;
        showTimes();
    }

    private void showTimes() {
        b.lblTimes.setText(String.valueOf(times));
    }

}
