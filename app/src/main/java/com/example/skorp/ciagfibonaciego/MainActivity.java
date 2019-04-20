package com.example.skorp.ciagfibonaciego;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView wynik;
    Button button;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wynik = findViewById(R.id.wynik);
        button = findViewById(R.id.button);
        input = findViewById(R.id.input);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n = Integer.parseInt(input.getText().toString());
                int ciag = ciag(n);

                wynik.setText("Fibonacci " + n +" : "+ ciag);

            }
        });

    }

    protected static int ciag(int n){
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return ciag(n - 1) + ciag(n - 2);


    }
}
