package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;

import com.example.andoridwidgets.databinding.ActivityProgressDialogBinding;

public class ProgressDialogActivity extends AppCompatActivity {

    private ActivityProgressDialogBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgressDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleButton();
    }

    private void handleButton() {
        binding.clickBtn.setOnClickListener(v -> {
           ProgressDialog progressDialog = new ProgressDialog(this);
           progressDialog.setTitle("Please wait");
           progressDialog.setMessage("preparing to download..");
           progressDialog.show();
        });
    }
}