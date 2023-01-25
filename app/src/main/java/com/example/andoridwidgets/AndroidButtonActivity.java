package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AndroidButtonActivity extends AppCompatActivity {

    private EditText numberOneTxt;
    private EditText numberTwoTxt;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_button);
        addTwoNumbers();
    }

    public void addTwoNumbers() {
        numberOneTxt = findViewById(R.id.number_one_txt);
        numberTwoTxt = findViewById(R.id.number_two_txt);
        addButton = findViewById(R.id.add_btn);
        addButton.setOnClickListener(v -> {
            String value1 = numberOneTxt.getText().toString();
            String value2 = numberTwoTxt.getText().toString();
            int a = Integer.parseInt(value1);
            int b = Integer.parseInt(value2);
            int sum = a+b;
            Toast.makeText(this, String.valueOf(sum), Toast.LENGTH_SHORT).show();
        });
    }
}