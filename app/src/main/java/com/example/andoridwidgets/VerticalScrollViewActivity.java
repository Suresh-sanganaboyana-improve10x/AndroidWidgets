package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.andoridwidgets.databinding.ActivityVerticalScrollViewBinding;

public class VerticalScrollViewActivity extends AppCompatActivity {

    ActivityVerticalScrollViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVerticalScrollViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}