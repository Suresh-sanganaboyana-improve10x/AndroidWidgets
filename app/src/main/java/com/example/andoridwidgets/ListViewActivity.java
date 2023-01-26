package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.andoridwidgets.databinding.ActivityListViewBinding;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ActivityListViewBinding binding;
    private ArrayList<String> names;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        handleNamesListView();
    }

    private void setData() {
        names = new ArrayList<>();
        names.add("Suresh");
        names.add("Anupama");
        names.add("Rajesh");
        names.add("Omprakash");
        names.add("ShreeHarsha");
        names.add("Hareesh");
        names.add("Pullaiah");
        names.add("Manoj");
        names.add("Roopa");
        names.add("Sriraghu");
        names.add("Sunitha");
        names.add("Vinodh");
        names.add("Sumanth");
        names.add("Viswa");
        names.add("Renu");
        names.add("Suresh");
        names.add("Anupama");
        names.add("Rajesh");
        names.add("Omprakash");
        names.add("ShreeHarsha");
        names.add("Hareesh");
        names.add("Pullaiah");
        names.add("Manoj");
        names.add("Roopa");
        names.add("Sriraghu");
        names.add("Sunitha");
        names.add("Vinodh");
        names.add("Sumanth");
        names.add("Viswa");
        names.add("Renu");

    }

    private void handleNamesListView() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        binding.namesLv.setAdapter(arrayAdapter);
        binding.namesLv.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, String.valueOf(names.get(position)), Toast.LENGTH_SHORT).show();
        });
    }
}