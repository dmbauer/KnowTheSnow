package com.dmbauer.knowthesnow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button hoodButton = (Button) findViewById(R.id.hood_button);

        hoodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create a new intent to open the MountHood activity
                Intent hoodIntent = new Intent(MainActivity.this, MountHood.class);

                // Start the new activity
                startActivity(hoodIntent);
            }
        });

        Button adamsButton = (Button) findViewById(R.id.adams_button);

        adamsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "This button will launch a snow and weather report for Mt. Adams!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button helensButton = (Button) findViewById(R.id.helens_button);

        helensButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "This button will launch a snow and weather report for Mt. St. Helens!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button rainierButton = (Button) findViewById(R.id.rainier_button);

        rainierButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "This button will launch a snow and weather report for Mt. Rainier!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button bachelorButton = (Button) findViewById(R.id.bachelor_button);

        bachelorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "This button will launch a snow and weather report for Mt. Bachelor!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button shastaButton = (Button) findViewById(R.id.shasta_button);

        shastaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "This button will launch a snow and weather report for Mt. Shasta!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
