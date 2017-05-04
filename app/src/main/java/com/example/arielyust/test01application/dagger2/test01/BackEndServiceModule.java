package com.example.arielyust.test01application.dagger2.test01;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by arielyust on 30/04/2017.
 */
@Module
public class BackEndServiceModule {
    @Provides
    @Singleton
    BackendService provideBackendService(@Named("anotherUrl") String serverUrl, User user) {
        return new BackendService(serverUrl, user);
    }

    @Provides
    @Named("serverUrl")
    String provideServerUrl() {
        return "http://www.vogella.com";
    }

    @Provides
    @Named("anotherUrl")
    String provideAnotherUrl() {
        return "http://www.google.com";
    }
}
