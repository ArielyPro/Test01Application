package com.example.arielyust.test01application.dagger2.test02;

import java.util.ArrayList;

/**
 * Created by arielyust on 01/05/2017.
 */

public class Car extends BaseCarClass {

    private Engine engine;
    private ArrayList<Wheel> wheelArrayList;

    public Car(String module, Engine engine, ArrayList<Wheel> wheelArrayList) {
        super(module);
        this.engine = engine;
        this.wheelArrayList = wheelArrayList;
    }

    @Override
    public String toString() {
        return "Car{" + getModule().toString() +
                ", engine=" + engine +
                ", wheelArrayList=" + wheelArrayList +
                '}';
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ArrayList<Wheel> getWheelArrayList() {
        return wheelArrayList;
    }

    public void setWheelArrayList(ArrayList<Wheel> wheelArrayList) {
        this.wheelArrayList = wheelArrayList;
    }
}
