package com.example.arielyust.test01application.dagger2.test01;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by arielyust on 30/04/2017.
 */

public class BackendService {

    private User user;
    private String serverUrl;

    @Inject
    public BackendService(String serverUrl, User user) {
        this.serverUrl = serverUrl;
        this.user = user;
    }

    public boolean callServer() {
        if (user !=null && serverUrl!=null && serverUrl.length()>0) {
            System.out.println("User: " + user + " ServerUrl: "  + serverUrl);
            return true;
        }
        return false;
    }}
