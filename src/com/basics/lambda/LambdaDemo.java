package com.basics.lambda;

public class LambdaDemo {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greetings greeting = new HelloWorldGreeting();
        greeting.greet();

        Greetings myLambdaFunction = () -> System.out.println("Hello World!");

        Greetings greeting1 = new Greetings() {

            public void greet() {
                System.out.println("Hello world Anynomous class!");
            }
        };

        greeter.greet(greeting1);
        greeter.greet(myLambdaFunction);


    }


}

interface MyLambda{
    public void foo();
}

interface  MyAdd{
    int add(int a, int b);
}
