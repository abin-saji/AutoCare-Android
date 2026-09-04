package com.example.autocare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LanguageSelectionActivity extends AppCompatActivity {

    private Toast currentToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_selection);

        Button englishButton = findViewById(R.id.button);
        Button malayalamButton = findViewById(R.id.button2);
        Button kannadaButton = findViewById(R.id.button3);

        englishButton.setOnClickListener(v -> {
            Intent intent = new Intent(LanguageSelectionActivity.this, MainActivity.class);
            startActivity(intent);
        });

        malayalamButton.setOnClickListener(v -> {
            if (currentToast != null) {
                currentToast.cancel();
            }
            currentToast = Toast.makeText(
                    LanguageSelectionActivity.this,
                    "മലയാളം പതിപ്പ് നിർമ്മാണത്തിലാണ്.",
                    Toast.LENGTH_SHORT
            );
            currentToast.show();
        });

        kannadaButton.setOnClickListener(v -> {
            if (currentToast != null) {
                currentToast.cancel();
            }
            currentToast = Toast.makeText(
                    LanguageSelectionActivity.this,
                    "ಕನ್ನಡ ಆವೃತ್ತಿಯು ನಿರ್ಮಾಣ ಹಂತದಲ್ಲಿದೆ.",
                    Toast.LENGTH_SHORT
            );
            currentToast.show();
        });
    }
}