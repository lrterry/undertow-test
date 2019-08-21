package com.lane.uttest.module;

import com.google.inject.AbstractModule;
import com.lane.uttest.provider.ServerProvider;
import com.lane.uttest.provider.HttpHandlerProvider;
import io.undertow.Undertow;
import io.undertow.server.HttpHandler;

public class DefaultModule extends AbstractModule {
    @Override
    public void configure() {
        bind(HttpHandler.class).toProvider(HttpHandlerProvider.class);
        bind(Undertow.class).toProvider(ServerProvider.class);
    }
}
