package com.example.practiseimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final TextView Page1 = (TextView) findViewById(R.id.number);
        Button buttonOne = (Button)findViewById(R.id.button) ;

        final Intent intent = getIntent();
        int random =  intent.getIntExtra("number", -1);
        if (random == -1){random = 0;}
        Page1.setText(random + "");

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random1= new Random();
                int number = random1.nextInt(100 -10) +10;


                Intent intent1 = new Intent(MainActivity.this, Activity2.class);
                intent1.putExtra("number",number);
                MainActivity.this.startActivity(intent1);







            }

        });

    }
}