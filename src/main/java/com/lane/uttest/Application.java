package com.lane.uttest;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.lane.uttest.module.DefaultModule;
import io.undertow.Undertow;

public class Application {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new DefaultModule());
        Undertow defaultServer = injector.getInstance(Undertow.class);
        try {
            defaultServer.start();
        } catch (Exception ex) {
            defaultServer.stop();
        }
    }
}
