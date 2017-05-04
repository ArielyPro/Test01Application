package com.example.arielyust.test01application.dagger2.test04;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by arielyust on 04/05/2017.
 */

@Component(modules = {ActivityModule.class, AndroidInjectionModule.class})
public abstract class IApplicationComponent {
    public abstract void inject(MyApplication application);
}
