package com.ianmunene.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findBeer(View view) {
        TextView brands = findViewById(R.id.brands);
        Spinner color = findViewById(R.id.color);
        String selectedColor = String.valueOf(color.getSelectedItem());

        List<String> newExpert = expert.getBrands(selectedColor);
        // first clear the text view
        brands.setText("");
        for (String beer: newExpert) {
            brands.append(beer+"\n");
        }

        // Alternate way to add text to the textview
        /*
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
        brandsFormatted.append(brand).append('\n');
        }
        //Display the beers
        brands.setText(brandsFormatted);
        * */
    }
}
