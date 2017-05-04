package com.example.arielyust.test01application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.arielyust.test01application.dagger2.Dagger2Test01;
import com.example.arielyust.test01application.dagger2.Dagger2Test02;
import com.example.arielyust.test01application.dagger2.Dagger2Test03;
import com.example.arielyust.test01application.dagger2.Dagger2Test04;
import com.example.arielyust.test01application.lambda.LambdaTest01;
import com.example.arielyust.test01application.lambda.LambdaTest02;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        LambdaTest01 lambdaTest01 = new LambdaTest01();
//        LambdaTest02 lambdaTest02 = new LambdaTest02();
//        Dagger2Test01 dagger2Test01 = new Dagger2Test01();
//        Dagger2Test02 dagger2Test02 = new Dagger2Test02();
//        Dagger2Test03 dagger2Test03 = new Dagger2Test03();

        Intent test04Activity = new Intent(this,Dagger2Test04.class);
        test04Activity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(test04Activity);
    }
}
