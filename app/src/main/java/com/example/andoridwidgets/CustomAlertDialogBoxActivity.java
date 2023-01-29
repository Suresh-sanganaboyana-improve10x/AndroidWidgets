package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;

import com.example.andoridwidgets.databinding.ActivityCustomAlertDialogBoxBinding;
import com.example.andoridwidgets.databinding.CustomAlertDialogItemBinding;

public class CustomAlertDialogBoxActivity extends AppCompatActivity {

    private ActivityCustomAlertDialogBoxBinding binding;
    private Dialog dialog;
    private CustomAlertDialogItemBinding customAlertDialogItemBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomAlertDialogBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleAlertClick();
    }

    private void handleAlertClick() {
        binding.alertBtn.setOnClickListener(v -> {
            dialog = new Dialog(this);
            customAlertDialogItemBinding = CustomAlertDialogItemBinding.inflate(getLayoutInflater());
            dialog.setContentView(customAlertDialogItemBinding.getRoot());
            customAlertDialogItemBinding.dismissBtn.setOnClickListener(v1 -> {
                finish();
            });
            customAlertDialogItemBinding.closeIb.setOnClickListener(v1 -> {
                dialog.dismiss();
            });
            customAlertDialogItemBinding.alertMessageTxt.setText("Alert...!!!");
            dialog.show();
        });
    }
}