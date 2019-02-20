package com.example.pvwav.handlerdemo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class FMHandler extends Handler {

    private MyInterface myInterface;
    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        int what = msg.what;
        Bundle data = msg.getData();
        boolean isPlaying = data.getBoolean("isPlaying");
        boolean isFM = data.getBoolean("isFM");
        String channelNo = data.getString("channelNo");

        if (myInterface != null) {
            myInterface.handlerMsg(isPlaying, isFM, channelNo);
        }
    }

    public void setMyInterface(MyInterface myInterface) {
        this.myInterface = myInterface;
    }

    public interface MyInterface {
        void handlerMsg(boolean isPlaying, boolean isFM, String channelNo);
    }
}
