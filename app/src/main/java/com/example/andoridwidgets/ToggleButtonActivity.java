package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.andoridwidgets.databinding.ActivityToggleButtonBinding;

public class ToggleButtonActivity extends AppCompatActivity {

    ActivityToggleButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityToggleButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleSubmitBtn();
    }

    private void handleSubmitBtn() {
        binding.submitBtn.setOnClickListener(v -> {
            StringBuilder result = new StringBuilder();
            result.append("ToggleButton1 : ").append(binding.toggleBtn1.getText());
            result.append("\nToggleButton2 : ").append(binding.toggleBtn2.getText());
            Toast.makeText(this, result.toString(), Toast.LENGTH_SHORT).show();
        });
    }
}