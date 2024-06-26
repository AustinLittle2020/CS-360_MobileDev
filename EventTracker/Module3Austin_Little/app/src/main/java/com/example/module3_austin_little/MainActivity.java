package com.example.module3_austin_little;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.Editable;
import android.text.TextWatcher;


public class MainActivity extends AppCompatActivity implements TextWatcher {
    EditText nameText;
    TextView textGreeting;
    Button buttonSayHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        nameText = findViewById(R.id.appName);
        textGreeting = findViewById(R.id.AppName);
        buttonSayHello = findViewById(R.id.buttonViewPermissions);
        nameText.addTextChangedListener(this);
        buttonSayHello.setEnabled(false);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    public void afterTextChanged(Editable s) {
        if (nameText.getText().toString().matches("")){
            buttonSayHello.setEnabled(false);
        } else {
            buttonSayHello.setEnabled(true);
        }
    }

    public void SayHello(View view){
        if (!nameText.getText().toString().matches("")){
            textGreeting.setText("Hello " + nameText.getText());
        }
        else {
            textGreeting.setText("You must enter a name");
        }
    }
}