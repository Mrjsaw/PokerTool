package com.example.android.poker_odds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {
    private Spinner spinnerSuitHand1;
    private Spinner spinnerValueHand1;
    private Spinner spinnerSuitHand2;
    private Spinner spinnerValueHand2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAdapaters();
    }
    public void initAdapaters() {
        spinnerSuitHand1 = findViewById(R.id.suit_hand1);
        spinnerValueHand1 = findViewById(R.id.value_hand1);
        spinnerSuitHand2 = findViewById(R.id.suit_hand2);
        spinnerValueHand2 = findViewById(R.id.value_hand2);

        String[] valueArray = getResources().getStringArray(R.array.values);
        String[] suitArray = getResources().getStringArray(R.array.suits);

        ArrayAdapter<String> adapterValueHand1 = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, valueArray);
        ArrayAdapter<String> adapterValueHand2 = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, valueArray);
        ArrayAdapter<String> adapterSuitHand1 = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, suitArray);
        ArrayAdapter<String> adapterSuitHand2 = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, suitArray);

        adapterValueHand1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterValueHand2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterSuitHand1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterSuitHand2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerSuitHand1.setAdapter(adapterSuitHand1);
        spinnerValueHand1.setAdapter(adapterValueHand1);
        spinnerSuitHand2.setAdapter(adapterSuitHand2);
        spinnerValueHand2.setAdapter(adapterValueHand2);
    }
}
