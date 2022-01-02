package com.prosper.helloworld;

import static com.prosper.helloworld.R.color.white;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
            }
        });

        findViewById(R.id.backColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.pink));
            }
        });

        findViewById(R.id.textString).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(getResources().getColor(R.color.black));
                textView.setText("Hello from Prosper!");
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.orange_yellow));
            }
        });

        findViewById(R.id.customText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (userText.isEmpty()) {
                    textView.setText("Enter your own text!");
                } else {
                    textView.setText(userText);
                }
            }
        });
    }
}
