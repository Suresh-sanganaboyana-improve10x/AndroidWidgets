package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.andoridwidgets.databinding.ActivityCustomToastMainBinding;
import com.example.andoridwidgets.databinding.CustomToastLayoutBinding;

public class CustomToastMainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast_main);
        CustomToastLayoutBinding toastLayoutBinding = CustomToastLayoutBinding.inflate(getLayoutInflater());

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setView(toastLayoutBinding.getRoot());
        toast.show();
    }
}