package com.example.arielyust.test01application.dagger2.test02.modules;

import com.example.arielyust.test01application.dagger2.test02.Car;
import com.example.arielyust.test01application.dagger2.test02.Engine;
import com.example.arielyust.test01application.dagger2.test02.Wheel;

import java.util.ArrayList;

/**
 * Created by arielyust on 01/05/2017.
 */

public class KiaCarModule extends SimpleCarModule {

    public Car provideSimpleCar(String module,
                                Engine engine,
                                ArrayList<Wheel> wheelArrayList) {
        return new Car(module, engine, wheelArrayList);
    }

    public String provideCarModule() {
        return "Kia Picanto";
    }

    public Engine provideEngine() {
        return new Engine("Kia_L1250", 1250);
    }

    public ArrayList<Wheel> provideSimpleWheelSet() {
        ArrayList<Wheel> wheels = new ArrayList<>();
        wheels.add(provideFrontWheel());
        wheels.add(provideFrontWheel());
        wheels.add(provideBackWheel());
        wheels.add(provideBackWheel());
        return wheels;
    }

    public Wheel provideFrontWheel() {
        return new Wheel("kia_FW16", 16);
    }

    public Wheel provideBackWheel() {
        return new Wheel("kia_BW16", 16);
    }

}
