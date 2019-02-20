package com.example.pvwav.handlerdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    FMHandler myHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((App) getApplication()).setMyHandler(myHandler);
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        myHandler = new FMHandler();
        FMHandler.MyInterface myInterface = new FMHandler.MyInterface() {
            @Override
            public void handlerMsg(boolean isPlaying, boolean isFM, String channelNo) {
                textView.setText(channelNo);
            }
        };

        myHandler.setMyInterface(myInterface);
    }
}
