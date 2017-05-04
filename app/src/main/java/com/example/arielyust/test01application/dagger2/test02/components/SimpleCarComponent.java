package com.example.arielyust.test01application.dagger2.test02.components;

import com.example.arielyust.test01application.dagger2.Dagger2Test02;
import com.example.arielyust.test01application.dagger2.test02.modules.SimpleCarModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by arielyust on 01/05/2017.
 */
@Singleton
@Component(modules = {SimpleCarModule.class})
public interface SimpleCarComponent {

    void inject(Dagger2Test02 obj);
}
