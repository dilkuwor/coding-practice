package com.basics.lambda;

public class RunnableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        });

        myThread.run();

        Thread myLambdaThread = new Thread(() -> System.out.println("Hello World from Lambda function!"));
        myLambdaThread.run();
    }
}
