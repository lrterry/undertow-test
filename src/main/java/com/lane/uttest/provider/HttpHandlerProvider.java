package com.lane.uttest.provider;

import com.google.inject.Provider;
import com.google.inject.Provides;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;
import io.undertow.util.Methods;

public class HttpHandlerProvider implements Provider<HttpHandler> {

    @Provides
    public HttpHandler get() {
        return Handlers.routing().add(Methods.GET, "/", new HttpHandler() {
            @Override
            public void handleRequest(HttpServerExchange exchange) throws Exception {
                exchange.getResponseHeaders().add(Headers.CONTENT_TYPE, "text/plain");
                exchange.getResponseSender().send("Hello World");
            }
        });
    }
}
