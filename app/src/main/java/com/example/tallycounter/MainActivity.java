package com.example.tallycounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private Button increaseBIN;
    private Button decreaseBIN;
    private Button resetBIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUI();
        increaseBIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newText = Integer.toString(Integer.parseInt(textView.getText().toString()) + 1);
                textView.setText(newText);
            }
        });
        decreaseBIN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (Integer.parseInt(textView.getText().toString()) != 0) {
                    String newText = Integer.toString(Integer.parseInt(textView.getText().toString()) - 1);
                    textView.setText(newText);
                }
            }

        });

    }

    public void resetTextView(View view) {
        textView.setText("0");
    }

    private void setUI() {
        textView = findViewById(R.id.textView);
        increaseBIN = findViewById(R.id.increase);
        decreaseBIN = findViewById(R.id.decrease);
        resetBIN = findViewById(R.id.reset);

    }

}