package com.example.arielyust.test01application.dagger2.test03.scenes;

import com.example.arielyust.test01application.dagger2.test03.Engine;
import com.example.arielyust.test01application.dagger2.test03.Wheel;

/**
 * Created by arielyust on 03/05/2017.
 */

public class CarTests {

    private static CarTestScene[] tests = {
            new CarTestScene("Kia",new Engine("Kia_E1250",1250),new Wheel[]{new Wheel("Kia_TF16",16),new Wheel("Kia_TF16",16),new Wheel("Kia_TB16",16),new Wheel("Kia_TB16",16)}),
            new CarTestScene("Audi",new Engine("Audi_E2000",2000),new Wheel[]{new Wheel("Audi_TF18",18),new Wheel("Audi_TF18",18),new Wheel("Audi_TB18",18),new Wheel("Audi_TB18",18)}),
            new CarTestScene("BMW",new Engine("BMW_E2600",2600),new Wheel[]{new Wheel("BMW_TF18",18),new Wheel("BMW_TF18",18),new Wheel("BMW_TB18",18),new Wheel("BMW_TB18",18)})
    };

    public static CarTestScene[] getTests() {
        return tests;
    }
}
