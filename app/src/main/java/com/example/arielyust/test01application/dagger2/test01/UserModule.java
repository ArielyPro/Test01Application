package com.example.arielyust.test01application.dagger2.test01;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by arielyust on 30/04/2017.
 */
@Module
public class UserModule {
    @Provides
    @Singleton
    User provideUser() {
        return new User("Lars", "Vogel");
    }
}
