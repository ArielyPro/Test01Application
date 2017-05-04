package com.example.arielyust.test01application.dagger2;

import android.util.Log;

import com.example.arielyust.test01application.dagger2.test02.Car;
import com.example.arielyust.test01application.dagger2.test02.components.DaggerSimpleCarComponent;
import com.example.arielyust.test01application.dagger2.test02.components.SimpleCarComponent;
import com.example.arielyust.test01application.dagger2.test02.modules.AudiCarModule;
import com.example.arielyust.test01application.dagger2.test02.modules.KiaCarModule;

import javax.inject.Inject;

/**
 * Created by arielyust on 30/04/2017.
 */

public class Dagger2Test02 {

    @Inject
    Car simpleCar;

    public Dagger2Test02() {
        SimpleCarComponent component;

        /* Kia Injection */
        component = DaggerSimpleCarComponent
                .builder()
                .simpleCarModule(new KiaCarModule())
                .build();

        component.inject(this);
        Log.e("Kia", simpleCar.toString());

        /* Audi Injection */
        component = DaggerSimpleCarComponent
                .builder()
                .simpleCarModule(new AudiCarModule())
                .build();

        component.inject(this);
        Log.e("Audi", simpleCar.toString());
    }
}
