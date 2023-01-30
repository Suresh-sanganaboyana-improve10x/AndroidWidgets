package com.example.andoridwidgets.checkbox;

public class CheckBoxControllerImpl implements CheckBoxController{
    @Override
    public String orderDetails(boolean isPizzaSelected, boolean isCoffeeSelected, boolean isBurgerSelected) {
        String orderDetails = "Selected Items : ";
        int totalAmount = 0;
        if (isPizzaSelected) {
            totalAmount += 100;
            orderDetails += "\nPizza : 100Rs";
        }
        if (isCoffeeSelected) {
            totalAmount += 50;
            orderDetails += "\nCoffee : 50Rs";
        }
        if (isBurgerSelected) {
            totalAmount += 120;
            orderDetails += "\nBurger : 120Rs";
        }
        orderDetails += "\nTotal : " + totalAmount + "Rs";
        return orderDetails;
    }
}
