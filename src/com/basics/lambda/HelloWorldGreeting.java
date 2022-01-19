package com.basics.lambda;

public class HelloWorldGreeting implements Greetings{
    @Override
    public void greet() {
        System.out.println("Hello world!");
    }
}
