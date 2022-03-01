package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numOne, numTwo;
    Button buttonAdd, buttonMul, buttonDiv, buttonSub;
    TextView titleTab, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numOne = findViewById(R.id.numOne);
        numTwo = findViewById(R.id.numTwo);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonMul = findViewById(R.id.buttonMul);
        buttonSub = findViewById(R.id.buttonSub);
        titleTab = findViewById(R.id.titleTab);
        result = findViewById(R.id.result);



        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num_one, num_two, res;
                num_one = Double.parseDouble(numOne.getText().toString());
                num_two = Double.parseDouble(numTwo.getText().toString());
                res = num_one + num_two;
                result.setText(num_one + " added with " + num_two + " is " + res);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num_one, num_two, res;
                num_one = Double.parseDouble(numOne.getText().toString());
                num_two = Double.parseDouble(numTwo.getText().toString());
                res = num_one * num_two;
                result.setText(num_one + " multiplied with " + num_two + " is " + res);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num_one, num_two, res;
                num_one = Double.parseDouble(numOne.getText().toString());
                num_two = Double.parseDouble(numTwo.getText().toString());
                res = num_one / num_two;
                result.setText(num_one + " divided by " + num_two + " is " + res);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num_one, num_two, res;
                num_one = Double.parseDouble(numOne.getText().toString());
                num_two = Double.parseDouble(numTwo.getText().toString());
                res = num_one - num_two;
                result.setText(num_one + " subtracted from " + num_two + " is " + res);
            }
        });
    }
}