package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.andoridwidgets.databinding.ActivityTimePickerBinding;

public class TimePickerActivity extends AppCompatActivity {

    ActivityTimePickerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTimePickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        timePicker();
    }

    private void timePicker() {
        binding.changeTimeBtn.setOnClickListener(v -> {
                int hour = binding.timePicker.getCurrentHour();
                int minutes = binding.timePicker.getCurrentMinute();
                Toast.makeText(this, String.valueOf(hour) + ":" + String.valueOf(minutes), Toast.LENGTH_SHORT).show();
        });
    }
}