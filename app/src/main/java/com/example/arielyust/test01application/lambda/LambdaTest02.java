package com.example.arielyust.test01application.lambda;

import android.util.Log;

import java.util.function.Consumer;

/**
 * Created by arielyust on 26/04/2017.
 */

public class LambdaTest02 {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {

            // The following statement causes the compiler to generate
            // the error "local variables referenced from a lambda expression
            // must be final or effectively final" in statement A:
            //
            // x = 99;

            int max = 0;

            Runnable r = new Runnable() {
                @Override
                public void run() {
                 int y = max;
                }
            };

//            max++; /* uncomment this for an error */

            Consumer<Integer> myConsumer = (y) ->
            {
                Log.e("TAG","x = " + x); // Statement A
                Log.e("TAG","y = " + y);
                Log.e("TAG","this.x = " + this.x);
                Log.e("TAG","LambdaScopeTest.this.x = " +
                        LambdaTest02.this.x);
            };

            myConsumer.accept(x);
        }
    }

    public LambdaTest02() {
//        LambdaTest02 st = new LambdaTest02();
        FirstLevel fl = new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}
