package com.basics.lambda.methodreference;

public class MethodReference {
    public static void main(String[] args) {
        //Thread myThread = new Thread(() -> print());
        Thread myThread = new Thread(MethodReference::print);
        myThread.start();
    }

    public static void print(){
        System.out.println("Hello World!");
    }
}
