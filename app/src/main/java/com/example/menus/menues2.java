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

public class menues2 extends AppCompatActivity {
    Intent gi;
    LinearLayout backgrounder2;
    Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menues2);
        backgrounder2 = findViewById(R.id.backgrounder2);// finding id of layout.
        bt2 = findViewById(R.id.button2);// finding id of button
        gi = getIntent();// getting intent of the first activity.
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    /*
    Function creates the title of the program
     */
    {

        getMenuInflater().inflate(R.menu.main,menu);// setting menu of program as in the exemel.
        menu.add(0,10002,400,"Green"); // adding an option to the program menu.

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
            backgrounder2.setBackgroundColor(Color.argb(255,0,0,255));
        } else if (id == R.id.YELLOW) {
            backgrounder2.setBackgroundColor(Color.argb(255,255,255,0));
        }
        else if(id == R.id.RED) {
            backgrounder2.setBackgroundColor(Color.argb(255,255,0,0));
        }
        else {
            backgrounder2.setBackgroundColor(Color.argb(255, 0, 255, 0));
        }

        return super.onOptionsItemSelected(item);
    }

    public void back(View view)
    /*
    Function goes back to first activity.
     */
    {
        finish();
    }
}