package es.iessaladillo.pedrojoya.countingclicks;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import es.iessaladillo.pedrojoya.countingclicks.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {

    private MainActivityBinding binding;
    private int times;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MainActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupViews();
    }

    private void setupViews() {
        binding.btnClickMe.setOnClickListener(this::incrementAndShow);
        showTimes();
    }

    private void incrementAndShow(View v) {
        times++;
        showTimes();
    }

    private void showTimes() {
        binding.lblTimes.setText(getResources().getQuantityString(R.plurals.main_times, times, times));
    }

}
