package com.example.arielyust.test01application.dagger2;

import android.util.Log;

import com.example.arielyust.test01application.dagger2.test01.BackendService;
import com.example.arielyust.test01application.dagger2.test01.DaggerMyComponent;
import com.example.arielyust.test01application.dagger2.test01.MyComponent;

import javax.inject.Inject;

/**
 * Created by arielyust on 30/04/2017.
 */

public class Dagger2Test01 {
    @Inject
    BackendService backendService; //

    private MyComponent component;

    public Dagger2Test01() {
        component = DaggerMyComponent.builder().build();
        component.inject(this);
        callServer();
    }

    private void callServer() {
        boolean callServer = backendService.callServer();
        if (callServer) {
            Log.e("TAG", "Server call was successful. ");
        } else {
            Log.e("TAG", "Server call failed. ");
        }
    }
}
