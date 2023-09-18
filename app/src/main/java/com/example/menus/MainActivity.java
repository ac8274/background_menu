package com.example.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout backgrounder1;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backgrounder1 = findViewById(R.id.backgrounder1); // finding id of layout.
        bt = findViewById(R.id.button); // finding id of button
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    /*
    Function creates the title of the program
     */
    {

        getMenuInflater().inflate(R.menu.main,menu);  // setting menu of program as in the exemel.

        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    /*
    Function changes layout background as the option clicked.
     */
    {
        int id = item.getItemId();

        if(id == R.id.BLUE)
        {
            backgrounder1.setBackgroundColor(Color.argb(255,0,0,255));
        } else if (id == R.id.YELLOW) {
            backgrounder1.setBackgroundColor(Color.argb(255,255,255,0));
        }
        else {
            backgrounder1.setBackgroundColor(Color.argb(255,255,0,0));
        }
        return super.onOptionsItemSelected(item);
    }

    public void Go(View view)
    /*
    Function starts next activity.
     */
    {
        Intent si = new Intent(this, menues2.class);
        startActivity(si);
    }
}