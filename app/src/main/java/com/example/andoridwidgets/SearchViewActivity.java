package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.andoridwidgets.databinding.ActivitySearchViewBinding;

import java.util.ArrayList;

public class SearchViewActivity extends AppCompatActivity {

    private ActivitySearchViewBinding binding;
    private ArrayList<String> list;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        setSearchView();
    }

    private void setData() {
        list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Orange");
        list.add("Water Melon");
        list.add("Papaya");
    }

    private void setSearchView() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        binding.listView.setAdapter(arrayAdapter);
        binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if (list.contains(query)) {
                    arrayAdapter.getFilter().filter(query);
                } else {
                    Toast.makeText(SearchViewActivity.this, "Nat match found", Toast.LENGTH_SHORT).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }
}