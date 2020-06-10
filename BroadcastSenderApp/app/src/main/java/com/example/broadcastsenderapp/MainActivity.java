package com.example.broadcastsenderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textSend);
        Button btn = findViewById(R.id.btnSend);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent("com.example.broadcastsender.EXAMPLE_ACTION");
        String text = new SpannableString(textView.getText()).toString();
        intent.putExtra("com.example.broadcastsender.EXTRA_TEXT", text);
        sendBroadcast(intent);
    }
}
