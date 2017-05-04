package com.example.arielyust.test01application.dagger2.test02;

/**
 * Created by arielyust on 01/05/2017.
 */

class BaseCarClass {
    private String module;

    public String getModule() {
        return module;
    }

    @Override
    public String toString() {
        return "module='" + module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public BaseCarClass(String module) {
        this.module = module;
    }
}
