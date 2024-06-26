package com.kailas.ui_components;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MySimpleButton extends AppCompatActivity {
    Button button_simple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_simple_button);
        button_simple = findViewById(R.id.button_simple);
        button_simple.setOnClickListener(view -> {
            Toast.makeText(MySimpleButton.this, "This is your simple button", Toast.LENGTH_SHORT).show();
        });
    }
}