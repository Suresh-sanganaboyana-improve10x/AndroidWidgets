package com.example.andoridwidgets;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.andoridwidgets.databinding.ActivityAlertDialogBinding;

public class AlertDialogActivity extends AppCompatActivity {

    ActivityAlertDialogBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAlertDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleCloseApp();
    }

    private void handleCloseApp() {
        binding.closeBtn.setOnClickListener(v -> {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setTitle("Alert!");
            alertDialog.setMessage("Do you want go back");
            alertDialog.setPositiveButton("Yes",(dialogInterface, i) -> {
                finish();
            });
            alertDialog.setNegativeButton("No", (dialog, which) -> {
                alertDialog.setCancelable(true);
            });
            AlertDialog alertDialog1 = alertDialog.create();
            alertDialog1.show();
        });
    }
}