package com.example.arielyust.test01application.dagger2.test04;

import javax.inject.Inject;

/**
 * Created by arielyust on 04/05/2017.
 */

public class NetworkApi {

    @Inject
    public NetworkApi(){
    }

    public boolean validateUser(String username, String password) {
        // imagine an actual network call here
        // for demo purpose return false in "real" life
        if (username == null || username.length() == 0) {
            return false;
        } else {
            return true;
        }
    }
}
