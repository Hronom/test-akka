package com.github.hronom.test.akka;

public class App {
    public static void main(String[] args) throws InterruptedException {
        akka.Main.main(new String[] { HelloWorld.class.getName() });
        //Thread.sleep(1_000_000);
    }
}
