package com.example.arielyust.test01application.dagger2.test03.scenes;

import com.example.arielyust.test01application.dagger2.test03.Engine;
import com.example.arielyust.test01application.dagger2.test03.Wheel;

import java.util.ArrayList;

/**
 * Created by arielyust on 03/05/2017.
 */

public class CarTestScene {
    private String carModule;
    private Engine engine;
    private Wheel[] wheelArrayList;

    public CarTestScene(String carModule, Engine engine, Wheel[] wheelArrayList) {
        this.carModule = carModule;
        this.engine = engine;
        this.wheelArrayList = wheelArrayList;
    }

    public String getCarModule() {
        return carModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel[] getWheelArrayList() {
        return wheelArrayList;
    }
}
