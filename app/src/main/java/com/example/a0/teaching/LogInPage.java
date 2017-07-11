package com.example.a0.teaching;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class LogInPage extends AppCompatActivity {

    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_log_in_page);


        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);

        Typeface cairo = Typeface.createFromAsset(getAssets(),"fonts/Cairo-Regular.ttf");

        b1.setTypeface(cairo);
        b2.setTypeface(cairo);


        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(LogInPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
