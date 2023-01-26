package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.andoridwidgets.databinding.ActivityCustomListViewBinding;

import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity {

    private ActivityCustomListViewBinding binding;
    private ArrayList<CustomListView> namesLv;
    private CustomListViewAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        customLv();
    }

    private void setData() {
        namesLv = new ArrayList<>();
        CustomListView name1 = new CustomListView();
        name1.imageUrl = "https://i.pinimg.com/736x/00/45/44/00454410e796933e356007e57d3c56dd.jpg";
        name1.title = "Pawan kalyan";
        name1.subTitle = "Janasena";
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
        namesLv.add(name1);
    }

    private void customLv() {
       customAdapter = new CustomListViewAdapter(this, R.layout.custom_list_view_item, namesLv);
       binding.customLv.setAdapter(customAdapter);
    }
}