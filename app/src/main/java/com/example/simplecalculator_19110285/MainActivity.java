package com.example.simplecalculator_19110285;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;


public class MainActivity extends AppCompatActivity {
    EditText Number1, Number2;
    Button btnadd,btnsub,btndiv,btnmul,btnpow,btngiaithua,btnlogarith;
    TextView output;
    double a,b, ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Number1 = (EditText) findViewById(R.id.TextNumber1);
        Number2 = (EditText) findViewById(R.id.TextNumber2);
        btnadd = (Button) findViewById(R.id.add);
        btnmul = (Button) findViewById(R.id.mul);
        btndiv = (Button) findViewById(R.id.div);
        btnsub = (Button) findViewById(R.id.sub);
        btngiaithua = (Button) findViewById(R.id.giaithua);
        btnlogarith = (Button) findViewById(R.id.logarith);
        btnpow = (Button) findViewById(R.id.pow);
        output = (TextView) findViewById(R.id.output);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(Number1.getText().toString());
                b = Double.parseDouble(Number2.getText().toString());
                ans = a + b;

                output.setText(String.valueOf(ans));
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(Number1.getText().toString());
                b = Double.parseDouble(Number2.getText().toString());
                ans = a - b;

                output.setText(String.valueOf(ans));
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(Number1.getText().toString());
                b = Double.parseDouble(Number2.getText().toString());
                ans = a * b;

                output.setText(String.valueOf(ans));
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(Number1.getText().toString());
                b = Double.parseDouble(Number2.getText().toString());
                ans = a / b;

                output.setText(String.valueOf(ans));
            }
        });

        btnpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(Number1.getText().toString());
                b = Double.parseDouble(Number2.getText().toString());
                ans = Math.pow(a,b);;

                output.setText(String.valueOf(ans));
            }
        });

        btngiaithua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(Number1.getText().toString());
                ans = a;
                for(int i = 1; i <= a; i++)
                {
                    ans = ans*i;
                }
                output.setText(String.valueOf(ans));
            }
        });

        btnlogarith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(Number1.getText().toString());
                ans = Math.log(a);
                output.setText(String.valueOf(ans));
            }
        });
    }

}