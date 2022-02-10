package com.example.unconvert;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void decrement(View view){
        int num=1;
        display(num);
        displayPrice(num*5);
    }

    public void submitOrder(View view) {
        int num=2;
        display(num);
        displayPrice(num*5);
    }

    public void increment(View view){
        int num=3;
        display(num);
        displayPrice(num*5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.text2);
        quantityTextView.setText("" + number);
    }

    //    To display the price on screen
    private void displayPrice(int number){
        TextView priceTextView= findViewById(R.id.text4);
        priceTextView.setText(NumberFormat.getCurrencyInstance(Locale.US).format(number));
    }
}