package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.andoridwidgets.checkbox.CheckBoxActivity;
import com.example.andoridwidgets.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        androidButton();
        customToast();
        toggleButton();
        checkBox();
        alertBox();
        radioButton();
        ratingBar();
        seekBar();
        datePicker();
        timePicker();
        verticalScrollView();
        horizontalScrollView();
        listView();
        customListView();
        imageSwitcher();
        imageSlider();
        progressDialog();
        webView();
        spinner();
        customAlertDialog();
        searchView();
        textWatcher();
        searchOnToolBar();
        autoCompleteTextView();
    }

    private void androidButton() {
        binding.androidButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, AndroidButtonActivity.class);
            startActivity(intent);
        });
    }

    private void customToast() {
        binding.customBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, CustomToastMainActivity.class);
            startActivity(intent);
        });
    }

    private void toggleButton() {
        binding.toggleBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ToggleButtonActivity.class);
            startActivity(intent);
        });
    }

    private void checkBox() {
        binding.checkBoxBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, CheckBoxActivity.class);
            startActivity(intent);
        });
    }

    private void alertBox() {
        binding.alertDialogBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, AlertDialogActivity.class);
            startActivity(intent);
        });
    }

    private void radioButton() {
        binding.radioBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, RadioButtonActivity.class);
            startActivity(intent);
        });
    }

    private void ratingBar() {
        binding.ratingBarBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, RatingBarActivity.class);
            startActivity(intent);
        });
    }

    private void seekBar() {
        binding.seekBarBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, SeekBarActivity.class);
            startActivity(intent);
        });
    }

    private void datePicker() {
        binding.datePickerBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, DatePickerActivity.class);
            startActivity(intent);
        });
    }

    private void timePicker() {
        binding.timePickerBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, TimePickerActivity.class);
            startActivity(intent);
        });
    }

    private void verticalScrollView() {
        binding.verticalSrollBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, VerticalScrollViewActivity.class);
            startActivity(intent);
        });
    }

    private void horizontalScrollView() {
        binding.horizontalScrollBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, HorizontalScrollViewActivity.class);
            startActivity(intent);
        });
    }

    private void listView() {
        binding.listViewBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ListViewActivity.class);
            startActivity(intent);
        });
    }

    private void customListView() {
        binding.customLvBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, CustomListViewActivity.class);
            startActivity(intent);
        });
    }

    private void imageSwitcher() {
        binding.imageSwitecherBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ImageSwitcherActivity.class);
            startActivity(intent);
        });
    }

    private void imageSlider() {
        binding.sliderBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ImageSliderActivity.class);
            startActivity(intent);
        });
    }

    private void progressDialog() {
        binding.progressDialogBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ProgressDialogActivity.class);
            startActivity(intent);
        });
    }

    private void webView() {
        binding.webViewBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, WebViewActivity.class);
            startActivity(intent);
        });
    }

    private void spinner() {
        binding.spinnerBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, SpinnerActivity.class);
            startActivity(intent);
        });
    }

    private void customAlertDialog() {
        binding.customAlertDialogBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, CustomAlertDialogBoxActivity.class);
            startActivity(intent);
        });
    }

    private void searchView() {
        binding.searchViewBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, SearchViewActivity.class);
            startActivity(intent);
        });
    }

    private void textWatcher() {
        binding.textWatcherBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, TextWatcherActivity.class);
            startActivity(intent);
        });
    }

    private void searchOnToolBar() {
        binding.searchToolBarBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, SearchViewToolBarActivity.class);
            startActivity(intent);
        });
    }

    private void autoCompleteTextView() {
        binding.autoCompleteBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, AutoCompleteTextViewActivity.class);
            startActivity(intent);
        });
    }
}