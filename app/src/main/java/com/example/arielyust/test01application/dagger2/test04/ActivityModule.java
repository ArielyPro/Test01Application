package com.example.arielyust.test01application.dagger2.test04;

import android.app.Activity;

import com.example.arielyust.test01application.dagger2.Dagger2Test04;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by arielyust on 04/05/2017.
 */


@Module(subcomponents = {IDagger2Test04ActivitySubcomponent.class})
public abstract class ActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(Dagger2Test04.class)
    abstract AndroidInjector.Factory<? extends Activity> bindYourActivityInjectorFactory(
            IDagger2Test04ActivitySubcomponent.Builder builder
    );
}


