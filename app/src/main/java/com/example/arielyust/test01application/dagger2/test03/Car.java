package com.example.arielyust.test01application.dagger2.test03;

/**
 * Created by arielyust on 01/05/2017.
 */

public class Car extends BaseCarClass {

    private Engine engine;
    private Wheel[] wheelArrayList;

    public Car(String module, Engine engine, Wheel[] wheelArrayList) {
        super(module);
        this.engine = engine;
        this.wheelArrayList = wheelArrayList;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        int size = wheelArrayList.length;
        for (int i=0;i<size;i++){
            stringBuilder.append(wheelArrayList[i]);
            if (i<size-1)stringBuilder.append(",");
        }

        return "Car{" + getModule().toString() +
                ", engine=" + engine +
                ", wheelArrayList=" + stringBuilder.toString() +
                '}';
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheelArrayList() {
        return wheelArrayList;
    }

    public void setWheelArrayList(Wheel[] wheelArrayList) {
        this.wheelArrayList = wheelArrayList;
    }
}
