package com.example.arielyust.test01application.dagger2.test01;

import com.example.arielyust.test01application.dagger2.Dagger2Test01;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by arielyust on 30/04/2017.
 */

@Singleton
@Component(modules = { BackEndServiceModule.class, UserModule.class })
public interface MyComponent {

    // provide the dependency for dependent components
    // (not needed for single-component setups)
//    BackendService provideBackendService();

    // allow to inject into our Main class
    // method name not important
    void inject(Dagger2Test01 main);
}
