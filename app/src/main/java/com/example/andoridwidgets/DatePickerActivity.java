package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.andoridwidgets.databinding.ActivityDatePickerBinding;

public class DatePickerActivity extends AppCompatActivity {

    ActivityDatePickerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDatePickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleChangeDate();
    }

    private void handleChangeDate() {
        binding.changeDate.setOnClickListener(v -> {
            int month = binding.datePicker.getMonth();
            int year = binding.datePicker.getYear();
            int day = binding.datePicker.getDayOfMonth();
            Toast.makeText(this, String.valueOf(day) + "-" + String.valueOf(month +1) + "-" + String.valueOf(year), Toast.LENGTH_SHORT).show();
        });
    }
}