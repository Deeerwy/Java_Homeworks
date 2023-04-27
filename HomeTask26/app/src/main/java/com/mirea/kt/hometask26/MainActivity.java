package com.mirea.kt.hometask26;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText inputText;
    TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.input_text);
        outputText = findViewById(R.id.output_text);

        Button reverseButton = findViewById(R.id.btn_reverse);
        Button vowelButton = findViewById(R.id.btn_vowel);
        Button caseButton = findViewById(R.id.btn_case);

        reverseButton.setOnClickListener(this);
        vowelButton.setOnClickListener(this);
        caseButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_reverse:
                reverseText();
                break;
            case R.id.btn_vowel:
                deleteVowels();
                break;
            case R.id.btn_case:
                increaseCase();
                break;
        }
    }

    private void reverseText() {
        String input = inputText.getText().toString();
        String output = new StringBuilder(input).reverse().toString();
        outputText.setText(output);
    }

    private void deleteVowels() {
        String input = inputText.getText().toString();
        String output = input.replaceAll("[aeiouAEIOU]", "");
        outputText.setText(output);
    }

    private void increaseCase() {
        String input = inputText.getText().toString();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i % 2 == 0) {
                output.append(Character.toUpperCase(c));
            } else {
                output.append(Character.toLowerCase(c));
            }
        }
        outputText.setText(output.toString());
    }
}