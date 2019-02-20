package com.example.pvwav.handlerdemo;

import android.os.Bundle;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FMHandler myHandler = ((App) getApplication()).getMyHandler();
                Message message = new Message();
                message.what = 1;
                Bundle bundle = new Bundle();
                bundle.putBoolean("isPlaying", true);
                bundle.putBoolean("isFM", false);
                bundle.putString("channelNo", "232323");
                message.setData(bundle);
                myHandler.sendMessage(message);

                finish();
            }
        });
    }
}
