package com.ianmunene.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findBeer(View view) {
        TextView brands = findViewById(R.id.brands);
        Spinner color = findViewById(R.id.color);
        String selectedColor = String.valueOf(color.getSelectedItem());
        brands.setText(selectedColor);
    }
}
