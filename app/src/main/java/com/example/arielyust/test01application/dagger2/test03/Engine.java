package com.example.arielyust.test01application.dagger2.test03;

import javax.inject.Inject;

/**
 * Created by arielyust on 01/05/2017.
 */

public class Engine extends BaseCarClass {

    private int liters;

    @Inject
    public Engine(String module, int liters) {
        super(module);
        this.liters = liters;
    }

    @Override
    public String toString() {
        return "Engine{" + getModule().toString() +
                ", liters=" + liters +
                '}';
    }

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }
}
