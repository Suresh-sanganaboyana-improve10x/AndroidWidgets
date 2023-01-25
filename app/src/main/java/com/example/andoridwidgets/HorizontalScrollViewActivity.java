package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.andoridwidgets.databinding.ActivityHorizontalScrollViewBinding;

public class HorizontalScrollViewActivity extends AppCompatActivity {

    ActivityHorizontalScrollViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHorizontalScrollViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}