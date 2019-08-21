package com.lane.uttest.provider;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.lane.uttest.module.DefaultModule;
import io.undertow.Undertow;
import io.undertow.server.HttpHandler;
import org.junit.Test;

public class ServerProviderTest {

    @Test
    public void testGet() {
        Injector injector = Guice.createInjector(new DefaultModule());
        HttpHandler handler = injector.getInstance(HttpHandler.class);

        ServerProvider serverProvider = new ServerProvider(handler);
        Undertow server = serverProvider.get();

        assert null != server;
    }
}
