package com.example.learnmandarin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_numbers, btn_family, btn_greetings, btn_places, btn_transportation, btn_basics, btn_animals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_numbers = (Button) findViewById(R.id.btn_numbers);
        btn_numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numIntent = new Intent(getBaseContext(), NumbersActivity.class);
                startActivity(numIntent);
            }
        });

        btn_family = (Button) findViewById(R.id.btn_family);
        btn_family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent famIntent = new Intent(getBaseContext(), Families.class);
                startActivity(famIntent);
            }
        });

        btn_greetings = (Button) findViewById(R.id.btn_greetings);
        btn_greetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent greetIntent = new Intent(getBaseContext(), Greetings.class);
                startActivity(greetIntent);
            }
        });

        btn_places = (Button) findViewById(R.id.btn_places);
        btn_places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placeIntent = new Intent(getBaseContext(), Places.class);
                startActivity(placeIntent);
            }
        });

        btn_transportation = (Button) findViewById(R.id.btn_transportation);
        btn_transportation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent transIntent = new Intent(getBaseContext(), Transportation.class);
                startActivity(transIntent);
            }
        });

        btn_basics = (Button) findViewById(R.id.btn_basics);
        btn_basics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent basicIntent = new Intent(getBaseContext(), Basics.class);
                startActivity(basicIntent);
            }
        });

        btn_animals = (Button) findViewById(R.id.btn_animals);
        btn_animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent animalIntent = new Intent(getBaseContext(), Animals.class);
                startActivity(animalIntent);
            }
        });

    }
}
