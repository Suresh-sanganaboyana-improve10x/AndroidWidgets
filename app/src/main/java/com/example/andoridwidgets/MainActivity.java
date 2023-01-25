package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.andoridwidgets.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        androidButton();
        customToast();
        toggleButton();
        checkBox();
        alertBox();
    }

    private void androidButton() {
        binding.androidButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, AndroidButtonActivity.class);
            startActivity(intent);
        });
    }

    private void customToast() {
        binding.customBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, CustomToastMainActivity.class);
            startActivity(intent);
        });
    }

    private void toggleButton() {
        binding.toggleBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ToggleButtonActivity.class);
            startActivity(intent);
        });
    }

    private void checkBox() {
        binding.checkBoxBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, CheckBoxActivity.class);
            startActivity(intent);
        });
    }

    private void alertBox() {
        binding.alertDialogBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, AlertDialogActivity.class);
            startActivity(intent);
        });
    }
}