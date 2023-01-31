package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.andoridwidgets.databinding.ActivityCustomCheckBoxBinding;

public class CustomCheckBoxActivity extends AppCompatActivity {

    private ActivityCustomCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}