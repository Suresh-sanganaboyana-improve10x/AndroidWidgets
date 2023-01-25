package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

import com.example.andoridwidgets.databinding.ActivitySeekBarBinding;

public class SeekBarActivity extends AppCompatActivity {

    ActivitySeekBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySeekBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        seekBar();
    }
    
    private void seekBar() {
        binding.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(SeekBarActivity.this, "seekbar progress:" + progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarActivity.this, "seekbar touch started", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarActivity.this, "seekbar touch stopped", Toast.LENGTH_SHORT).show();
            }
        });
    }
}