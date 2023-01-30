package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.andoridwidgets.databinding.ActivityAutoCompleteTextViewBinding;

import java.util.ArrayList;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    String[] language = {"C", "C++", "NET", "iPhone", "Android", "ASP.NET", "PHP"};
    private ActivityAutoCompleteTextViewBinding binding;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAutoCompleteTextViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        autoCompleteTextView();
    }

    private void autoCompleteTextView() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,language);
        binding.autoCompleteText.setThreshold(1);
        binding.autoCompleteText.setAdapter(arrayAdapter);
        binding.autoCompleteText.setTextColor(Color.BLUE);
    }
}