package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.andoridwidgets.databinding.ActivityRadioButtonBinding;

public class RadioButtonActivity extends AppCompatActivity {

    ActivityRadioButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRadioButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        radioButtonShowToast();
    }

    private void radioButtonShowToast() {
        binding.showSelectedBtn.setOnClickListener(v -> {
            if (binding.maleRadioBtn.isChecked()) {
                Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show();
            }
        });
    }
}