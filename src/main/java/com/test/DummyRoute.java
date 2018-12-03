package com.test;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class DummyRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("seda:in").to("seda:out");
    }
}
