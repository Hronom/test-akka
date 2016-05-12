package com.github.hronom.test.akka;

import akka.japi.Creator;

public class GreeterCreator implements Creator<Greeter> {
    @Override
    public Greeter create() throws Exception {
        return new Greeter();
    }
}