package com.example.andoridwidgets.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.andoridwidgets.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity implements CheckBoxView {

    ActivityCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleOrderBtn();
    }

    @Override
    public void handleOrderBtn() {
        binding.orderBtn.setOnClickListener(v -> {
            String orderDetails = new CheckBoxControllerImpl().orderDetails(binding.pizzaCb.isChecked(),
                    binding.coffeeCb.isChecked(), binding.burgerCb.isChecked());
            showToast(orderDetails);
        });
    }

    @Override
    public void showToast(String message) {
        binding.orderDetailsTxt.setText(message);
    }
}