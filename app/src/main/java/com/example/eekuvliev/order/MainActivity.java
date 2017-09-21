package com.example.eekuvliev.order;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * Order pizza.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quantity=0;
    /**
     * Order button gets clicked.
     */
    public void submitOrder(View view) {
        //int quantity=0;
        //display(quantity);
        displayPrice(quantity*5);
    }

    /**
     *
     * @param view
     */
    public void increment(View view){
        //int quantity=0;
        quantity++;
        display(quantity);
    }

    public void decrement(View view){
        //int quantity=0;
        quantity--;
        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.howMany);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.howMuch);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}