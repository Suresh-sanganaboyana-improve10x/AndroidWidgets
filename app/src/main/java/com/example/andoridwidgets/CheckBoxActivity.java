package com.example.andoridwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.andoridwidgets.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity {

    ActivityCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        orderPage();
    }

    private void orderPage() {
        binding.orderBtn.setOnClickListener(v -> {
            boolean isPizzaChecked = binding.pizzaCb.isChecked();
            boolean isCoffeeChecked = binding.coffeeCb.isChecked();
            boolean isBurgerChecked = binding.burgerCb.isChecked();
            String orderDetails = createOrder(isPizzaChecked, isCoffeeChecked, isBurgerChecked);
            binding.orderDetailsTxt.setText(orderDetails);
//            Toast.makeText(this, orderDetails, Toast.LENGTH_LONG).show();
        });
    }

    private String createOrder(boolean pizza, boolean coffee, boolean burger) {
        int totalamount = 0;
        String orderDetails = "Selected Items";
        if (pizza) {
            totalamount += 100;
            orderDetails += "\npizza: Rs.100";
        }
        if (coffee) {
            totalamount += 50;
            orderDetails += "\ncoffee: Rs.50";
        }
        if (burger) {
            totalamount += 200;
            orderDetails += "\nburger: Rs.200";
        }

        orderDetails+="Total Rs" +totalamount;
        return orderDetails;
    }
}