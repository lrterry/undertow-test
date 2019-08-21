package com.lane.uttest.provider;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Provides;
import io.undertow.Undertow;
import io.undertow.server.HttpHandler;

public class ServerProvider implements Provider<Undertow> {

    private final HttpHandler httpHandler;

    @Inject
    public ServerProvider(HttpHandler httpHandler) {
        this.httpHandler = httpHandler;
    }

    @Provides
    public Undertow get() {
        return Undertow.builder()
                .addHttpListener(8080, "0.0.0.0")
                .setHandler(httpHandler)
                .build();
    }
}
