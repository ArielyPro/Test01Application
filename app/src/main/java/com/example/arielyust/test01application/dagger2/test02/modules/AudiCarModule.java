package com.example.arielyust.test01application.dagger2.test02.modules;

import com.example.arielyust.test01application.dagger2.test02.Car;
import com.example.arielyust.test01application.dagger2.test02.Engine;
import com.example.arielyust.test01application.dagger2.test02.Wheel;

import java.util.ArrayList;

/**
 * Created by arielyust on 01/05/2017.
 */

public class AudiCarModule extends SimpleCarModule{

    public Car provideSimpleCar(String module,
                         Engine engine,
                         ArrayList<Wheel> wheelArrayList) {
        return new Car(module, engine, wheelArrayList);
    }

    public String provideCarModule() {
        return "Audi A100";
    }

    public Engine provideEngine() {
        return new Engine("Audi_L2000Turbo", 2000);
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
        return new Wheel("Audi_FW18", 18);
    }

    public Wheel provideBackWheel() {
        return new Wheel("Audi_BW18", 18);
    }

}
