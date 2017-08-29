package com.umutjan.nightmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnNight;

    RelativeLayout layout;

    TextView text;

    boolean nightModeOn = false;

    int nightOrDay = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNight = (Button) findViewById(R.id.btnNight);

        layout = (RelativeLayout) findViewById(R.id.relativeLayout);

        text = (TextView) findViewById(R.id.textView);

        btnNight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nightOrDay++;
                if (nightOrDay % 2 != 0) {
                    nightModeOn = true;
                } else {
                    nightModeOn = false;
                }
                changeColor();
            }
        });



    }

    public void changeColor() {

        if (nightModeOn) {
            layout.setBackgroundColor(getResources().getColor(R.color.navy));
            text.setTextColor(getResources().getColor(R.color.white));
        } else {
            layout.setBackgroundColor(getResources().getColor(R.color.white));
            text.setTextColor(getResources().getColor(R.color.black));
        }

    }
}
