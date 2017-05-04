package com.example.arielyust.test01application.dagger2.test04;

import com.example.arielyust.test01application.dagger2.Dagger2Test04;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by arielyust on 04/05/2017.
 */

@Subcomponent
public interface IDagger2Test04ActivitySubcomponent extends AndroidInjector<Dagger2Test04> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Dagger2Test04> {}
}
