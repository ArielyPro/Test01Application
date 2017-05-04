package com.example.arielyust.test01application.lambda;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

/**
 * Created by arielyust on 26/04/2017.
 */

public class LambdaTest01 {

    public LambdaTest01() {
        List<Animal> list = new ArrayList<>();

        list.add(new Animal("cat"));
        list.add(new Animal("dog"));
        list.add(new Animal("bird"));
        list.add(new Animal("turtle"));
        list.add(new Animal("rat"));

        actionAll(
                list,
                a -> Log.d(getClass().getSimpleName(), a.getName())
        );
    }

    private void actionAll(List<Animal> list, Consumer<Animal> action) {
        for (Animal animal : list) {
            action.accept(animal);
        }
    }

    private class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
