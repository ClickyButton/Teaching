package com.example.a0.teaching;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class LogInPage extends AppCompatActivity {

    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_page);

        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);

        Typeface cairo = Typeface.createFromAsset(getAssets(),"fonts/Cairo-Regular.ttf");

        b1.setTypeface(cairo);
        b2.setTypeface(cairo);
    }
}
