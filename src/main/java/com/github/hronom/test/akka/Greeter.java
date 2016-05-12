package com.github.hronom.test.akka;

import net.moznion.random.string.RandomStringGenerator;

import akka.actor.UntypedActor;

public class Greeter extends UntypedActor {
    private final RandomStringGenerator generator = new RandomStringGenerator();

    private final TestRocket testRocket;

    public enum Msg {
        GREET,
        DONE
    }

    public Greeter(){
        testRocket = new TestRocket();
        System.out.println();
    }

    @Override
    public void onReceive(Object msg) {
        if (msg == Msg.GREET) {
            System.out.println("Hello World!");
            getSender().tell(Msg.DONE, getSelf());
        } else
            unhandled(msg);
    }

}