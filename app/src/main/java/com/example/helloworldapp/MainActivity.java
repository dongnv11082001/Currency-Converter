package com.example.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view) {

        EditText myTextField = findViewById(R.id.myTextField);

        Log.i("Information", "Hello " + myTextField.getText().toString());

        double dollarAmount = Double.parseDouble(myTextField.getText().toString());

        String result = "$" + dollarAmount + " = " + dollarAmount * 22700;

        Toast.makeText(MainActivity.this, result + " VND", Toast.LENGTH_SHORT).show();

    }
}