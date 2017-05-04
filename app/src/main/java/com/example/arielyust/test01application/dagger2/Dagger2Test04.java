package com.example.arielyust.test01application.dagger2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.arielyust.test01application.R;
import com.example.arielyust.test01application.dagger2.test04.NetworkApi;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

/**
 * Created by arielyust on 04/05/2017.
 */

public class Dagger2Test04 extends Activity {
    @Inject
    NetworkApi networkApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean injected =  networkApi == null ? false : true;
        TextView userAvailable = (TextView) findViewById(R.id.target);
        userAvailable.setText("Dependency injection worked: " + String.valueOf(injected));
    }
}
