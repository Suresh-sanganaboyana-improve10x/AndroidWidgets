package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.andoridwidgets.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity {

    ActivityCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        orderPage();
    }

    private void orderPage() {
        binding.orderBtn.setOnClickListener(v -> {
            int totalAmount = 0;
            if (binding.pizzaCb.isChecked()) {
                totalAmount += 500;
            }
            if (binding.coffeeCb.isChecked()) {
                totalAmount += 50;
            }
            if (binding.burgerCb.isChecked()) {
                totalAmount += 200;
            }
            Toast.makeText(this, String.valueOf(totalAmount), Toast.LENGTH_SHORT).show();
        });
    }
}