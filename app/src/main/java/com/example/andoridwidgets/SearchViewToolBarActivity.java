package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.SearchView;

import com.example.andoridwidgets.databinding.ActivitySearchViewToolBarBinding;

import java.util.ArrayList;

public class SearchViewToolBarActivity extends AppCompatActivity {

    private ActivitySearchViewToolBarBinding binding;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchViewToolBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setUpData();
        handleSearchViewOnToolBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_view_tool_bar_menu, menu);
        MenuItem searchViewItem = menu.findItem(R.id.app_bar_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchViewItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchView.clearFocus();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    private void setUpData() {
        list = new ArrayList<>();
        list.add("Sunday");
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
    }

    private void handleSearchViewOnToolBar() {
        adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, list);
        binding.toolBarLv.setAdapter(adapter);
    }
}