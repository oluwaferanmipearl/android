package com.example.practiseimage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;


public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        final TextView Page1 = (TextView) findViewById(R.id.number1);
        Button buttonOne = (Button)findViewById(R.id.button1) ;

        Intent intent = getIntent();
        int number = intent.getIntExtra("number", -1);
        Page1.setText(number+"");

        buttonOne.setOnClickListener(new OnClickListener() {


            @Override
            public void onClick(View view) {
                Random random = new Random();
                int number = random.nextInt(100-10)+10;
                Intent intent  = new Intent(Activity2.this, MainActivity.class);
                intent.putExtra("number", number);
                Activity2.this.startActivity(intent);



            }


});

    }
}