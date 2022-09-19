package com.missouristate.arnold.trafficlightapp;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view) {
        ImageView red = findViewById(R.id.redImageView);
        ImageView green = findViewById(R.id.greenImageView);
        ImageView yellow = findViewById(R.id.yellowImageView);
        Button go = findViewById(R.id.button);

        String yup = go.getText().toString();


        if(yup.equals("Stop")) {
            go.setText("Go");
            red.setVisibility(View.INVISIBLE);
            green.setVisibility(View.VISIBLE);
            go.setBackgroundColor(Color.GREEN);
        }

        else if(yup.equals("Go")) {
            go.setText("Wait");
            green.setVisibility(View.INVISIBLE);
            yellow.setVisibility(View.VISIBLE);
            go.setBackgroundColor(Color.YELLOW);
        }

        else{
            go.setText("Stop");
            yellow.setVisibility(View.INVISIBLE);
            red.setVisibility(View.VISIBLE);
            go.setBackgroundColor(Color.RED);
        }


        {



        }

    }
}

