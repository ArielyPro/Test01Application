package com.example.arielyust.test01application.dagger2.test02.modules;

import com.example.arielyust.test01application.dagger2.test02.Car;
import com.example.arielyust.test01application.dagger2.test02.Engine;
import com.example.arielyust.test01application.dagger2.test02.Wheel;

import java.util.ArrayList;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by arielyust on 01/05/2017.
 */
@Module
public class SimpleCarModule {

    @Provides
    public Car provideSimpleCar(@Named("CarModule") String module,
                                Engine engine,
                                @Named("SimpleWheelSet") ArrayList<Wheel> wheelArrayList) {
        return null;
    }

    @Provides
    @Named("CarModule")
    public String provideCarModule() {
        return null;
    }

    @Provides
    public Engine provideEngine() {
        return null;
    }

    @Provides
    @Named("SimpleWheelSet")
    public ArrayList<Wheel> provideSimpleWheelSet() {
        return null;
    }

    @Provides
    @Named("FrontWheel")
    public Wheel provideFrontWheel() {
        return null;
    }

    @Provides
    @Named("BackWheel")
    public Wheel provideBackWheel() {
        return null;
    }

}
