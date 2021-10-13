package com.example.onclicksample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //getting reference to the button
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning value to the button variable
        button = findViewById(R.id.button);

        //creating onclick listener and attaching it to the button...
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //what the button should do, would be put here
                //how about a Toast (in Android)...
                Toast.makeText(getApplicationContext(), "Toast!", Toast.LENGTH_LONG).show();
            }
        });

        //creating onLongClick listener and attaching it to the button...
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                //what to do when the user presses and hold down the button, would be put here
                //we'll show a toast, for example
                Toast.makeText(getApplicationContext(), "User Long-clicked", Toast.LENGTH_LONG).show();
                //should tell the Android system that there was no error, everything is expected to work well...
                return true;
            }
        });
    }

}