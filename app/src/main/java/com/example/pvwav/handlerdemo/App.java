package com.example.pvwav.handlerdemo;

import android.app.Application;

public class App extends Application {

    private FMHandler myHandler;

    public FMHandler getMyHandler() {
        return myHandler;
    }

    public void setMyHandler(FMHandler myHandler) {
        this.myHandler = myHandler;
    }
}
