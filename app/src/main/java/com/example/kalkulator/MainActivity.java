package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button bttn_sin, bttn_cos, bttn_tan, bttn_cosec, bttn_sec, bttn_ctg, bttn_log;
    private TextView result;
    private EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bttn_sin = findViewById(R.id.bttn_sin);
        bttn_cos = findViewById(R.id.bttn_cos);
        bttn_tan = findViewById(R.id.bttn_tan);
        bttn_cosec = findViewById(R.id.bttn_cosec);
        bttn_sec = findViewById(R.id.bttn_sec);
        bttn_ctg = findViewById(R.id.bttn_ctg);
        bttn_log = findViewById(R.id.bttn_log);
        result = findViewById(R.id.result);
        input = findViewById(R.id.input);

        bttn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sInput = input.getText().toString();
                double input = Double.parseDouble(sInput);

                double _result = Math.sin(input);
                String sResult = String.valueOf(_result);

                result.setText(sResult);
            }
        });
        bttn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sInput = input.getText().toString();
                double input = Double.parseDouble(sInput);

                double _result = Math.cos(input);
                String sResult = String.valueOf(_result);

                result.setText(sResult);
            }
        });
        bttn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sInput = input.getText().toString();
                double input = Double.parseDouble(sInput);

                double _result = Math.tan(input);
                String sResult = String.valueOf(_result);

                result.setText(sResult);
            }
        });
        bttn_cosec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sInput = input.getText().toString();
                double input = Double.parseDouble(sInput);

                double _result = 1.0/Math.sin(input);
                String sResult = String.valueOf(_result);

                result.setText(sResult);
            }
        });

        bttn_sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sInput = input.getText().toString();
                double input = Double.parseDouble(sInput);

                double _result = 1.0/Math.cos(input);
                String sResult = String.valueOf(_result);

                result.setText(sResult);
            }
        });

        bttn_ctg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sInput = input.getText().toString();
                double input = Double.parseDouble(sInput);

                double _result = 1.0/Math.tan(input);
                String sResult = String.valueOf(_result);

                result.setText(sResult);

            }
        });
        bttn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sInput = input.getText().toString();
                double input = Double.parseDouble(sInput);

                double _result = Math.log10(input);
                String sResult = String.valueOf(_result);

                result.setText(sResult);

            }
        });
    }
}
