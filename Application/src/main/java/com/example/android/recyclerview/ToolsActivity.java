package com.example.android.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.common.logger.Log;

public class ToolsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);
        Intent intent = getIntent();
        int  data = intent.getIntExtra("num",0);
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText("手套"+data +"");
    }
}
