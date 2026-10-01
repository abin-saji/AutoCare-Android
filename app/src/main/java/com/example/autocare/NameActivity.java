package com.example.autocare;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NameActivity extends AppCompatActivity {

    private EditText firstNameEditText;
    private EditText lastNameEditText;
    private TextView greetingText;
    private TextView startMessageText;
    private Button letsGoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        firstNameEditText = findViewById(R.id.firstNameEditText);
        lastNameEditText = findViewById(R.id.lastNameEditText);
        greetingText = findViewById(R.id.greetingText);
        startMessageText = findViewById(R.id.startMessageText);
        letsGoButton = findViewById(R.id.letsGoButton);

        firstNameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String firstName = s.toString().trim();

                if (!firstName.isEmpty()) {
                    greetingText.setText("Hey, " + firstName + "! 👋");
                    startMessageText.setText("Let's get started 🚗");
                } else {
                    greetingText.setText("");
                    startMessageText.setText("");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        letsGoButton.setOnClickListener(v -> {

            String firstName = firstNameEditText.getText().toString().trim();

            if (firstName.isEmpty()) {
                firstNameEditText.setError("Please enter your first name");
                firstNameEditText.requestFocus();
                return;
            }

            // We'll decide what happens after "Let's Go"
            // when we build the next AutoCare page.

        });
    }
}