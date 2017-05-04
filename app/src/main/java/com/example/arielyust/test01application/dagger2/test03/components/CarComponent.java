package com.example.arielyust.test01application.dagger2.test03.components;

import com.example.arielyust.test01application.dagger2.Dagger2Test03;
import com.example.arielyust.test01application.dagger2.test03.modules.CarModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by arielyust on 01/05/2017.
 */
@Singleton
@Component(modules = {CarModule.class})
public interface CarComponent {

    void inject(Dagger2Test03 obj);
}
