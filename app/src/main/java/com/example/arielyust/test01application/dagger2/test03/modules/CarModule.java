package com.example.arielyust.test01application.dagger2.test03.modules;

import com.example.arielyust.test01application.dagger2.test03.Car;
import com.example.arielyust.test01application.dagger2.test03.Engine;
import com.example.arielyust.test01application.dagger2.test03.Wheel;
import com.example.arielyust.test01application.dagger2.test03.scenes.CarTestScene;

import java.util.ArrayList;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by arielyust on 01/05/2017.
 */
@Module
public class CarModule {

    private CarTestScene scene;

    public CarModule(CarTestScene scene) {
        this.scene = scene;
    }

    @Provides
    public Car provideSimpleCar() {
        return new Car(scene.getCarModule(), scene.getEngine(), scene.getWheelArrayList());
    }

}
