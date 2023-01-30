package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import com.example.andoridwidgets.databinding.ActivityMultiAutoCompleteTextViewBinding;

public class MultiAutoCompleteTextVIewActivity extends AppCompatActivity {

    private ActivityMultiAutoCompleteTextViewBinding binding;
    private ArrayAdapter<String> arrayAdapter;
    private String[] movies = {"Mahanati", "96", "Majili", "RRR", "Magadheera", "Pillazamindar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMultiAutoCompleteTextViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        multiAutoCompleteTextView();
    }

    private void multiAutoCompleteTextView() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, movies);
        binding.multiAutoCompleteText.setAdapter(arrayAdapter);
        binding.multiAutoCompleteText.setThreshold(1);
        binding.multiAutoCompleteText.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}