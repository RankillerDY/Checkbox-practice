package com.example.checkboxpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBoxVisibility;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxVisibility = findViewById(R.id.checkBox_visibility);
        text = findViewById(R.id.txtHelloWorld);
        boolean isChecked = checkBoxVisibility.isChecked();

        updateTextVisibility(isChecked);

        checkBoxVisibility.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                updateTextVisibility(isChecked);
            }
        });
    }

    private void updateTextVisibility(boolean isChecked) {
        if(isChecked) {
            text.setVisibility(View.VISIBLE);
        } else {
            text.setVisibility(View.INVISIBLE);
        }
    }
}