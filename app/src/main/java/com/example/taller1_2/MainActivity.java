package com.example.taller1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText valorA, valorB, valorC;
    Button btnCalc;
    TextView tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorA = findViewById(R.id.editTextTextPersonName);
        valorB = findViewById(R.id.editTextTextPersonName4);
        valorC = findViewById(R.id.editTextTextPersonName5);
        btnCalc =findViewById(R.id.calcular);
        tv5 = findViewById(R.id.textView6);

        btnCalc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(valorA.getText().toString());
                double b = Double.parseDouble(valorB.getText().toString());
                double c = Double.parseDouble(valorC.getText().toString());
                double x1 = (-b+(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
                double x2 = (-b-(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
                String r1 = String.format("%.2f", x1);
                String r2 = String.format("%.2f", x2);
                tv5.setText("X1: "+r1+"  X2: "+r2);

            }
        });
    }
}