package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.andoridwidgets.databinding.ActivityTextWatcherBinding;

import java.util.ArrayList;

public class TextWatcherActivity extends AppCompatActivity {

    private ActivityTextWatcherBinding binding;
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTextWatcherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        setTextWatcher();
    }

    private void setData() {
        arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Pine apple");
        arrayList.add("Orange");
        arrayList.add("Dragon fruit");
        arrayList.add("Mango");
        arrayList.add("Lemon");
    }

    private void setTextWatcher() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        binding.listView.setAdapter(arrayAdapter);
        binding.editTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Toast.makeText(TextWatcherActivity.this, "before text changed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                arrayAdapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {
                Toast.makeText(TextWatcherActivity.this, "After text changed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}