package com.lane.uttest.provider;

import io.undertow.server.HttpHandler;
import org.junit.Test;

public class HttpHandlerProviderTest {

    @Test
    public void testGet() {
        HttpHandlerProvider provider = new HttpHandlerProvider();

        HttpHandler handler = provider.get();

        assert null != handler;
    }
}
