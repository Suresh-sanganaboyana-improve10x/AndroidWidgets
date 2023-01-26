package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.andoridwidgets.databinding.ActivityAndroidButtonBinding;

public class AndroidButtonActivity extends AppCompatActivity {

    private ActivityAndroidButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAndroidButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        addTwoNumbers();
    }

    public void addTwoNumbers() {
        binding.addBtn.setOnClickListener(v -> {
            //read a and b
            String value1 = binding.numberOneTxt.getText().toString();
            String value2 =binding.numberTwoTxt.getText().toString();
            // convert to it int
            String sum = add(value1, value2);
            Toast.makeText(this, String.valueOf(sum), Toast.LENGTH_SHORT).show();
        });
    }

    //Business Logic - Only main operation.Strictly no ui changes
    private String add(String value1, String value2) {
        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        int sum = num1 + num2;
        return String.valueOf(sum);
    }
}