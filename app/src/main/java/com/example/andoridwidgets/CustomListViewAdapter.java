package com.example.andoridwidgets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.andoridwidgets.databinding.CustomListViewItemBinding;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomListViewAdapter extends ArrayAdapter<CustomListView> {

    private CustomListViewItemBinding binding;

    public CustomListViewAdapter(@NonNull Context context, int resource, @NonNull List<CustomListView> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        binding = CustomListViewItemBinding.inflate(LayoutInflater.from(getContext()), parent, false);
        CustomListView customListView = getItem(position);
        Picasso.get().load(customListView.imageUrl).into(binding.profileImg);
        binding.titleTxt.setText(customListView.title);
        binding.subtitleTxt.setText(customListView.subTitle);
        return binding.getRoot();
    }
}
