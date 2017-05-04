package com.example.arielyust.test01application.dagger2;

import android.util.Log;

import com.example.arielyust.test01application.dagger2.test03.Car;
import com.example.arielyust.test01application.dagger2.test03.components.DaggerCarComponent;
import com.example.arielyust.test01application.dagger2.test03.components.CarComponent;
import com.example.arielyust.test01application.dagger2.test03.modules.CarModule;
import com.example.arielyust.test01application.dagger2.test03.scenes.CarTestScene;
import com.example.arielyust.test01application.dagger2.test03.scenes.CarTests;


import javax.inject.Inject;

/**
 * Created by arielyust on 30/04/2017.
 */

public class Dagger2Test03 {

    @Inject
    Car simpleCar;

    public Dagger2Test03() {
        CarComponent component;

        CarTestScene scene;

        int testsAmount = CarTests.getTests().length;
        for (int i =0; i<testsAmount;i++) {
            scene = CarTests.getTests()[i];

            component = DaggerCarComponent
                    .builder()
                    .carModule(new CarModule(scene))
                    .build();

            component.inject(this);
            Log.e(scene.getCarModule(), simpleCar.toString());
        }
    }


}
