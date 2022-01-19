package com.basics.oops.polymorphism;

public class RunTimePolymorphism {
    public static void main(String[] args){

        Bird b = new SecondBird();
        b.action();

    }

}

class Bird{
    public void action(){
        System.out.print("Bird Fly");
    }
}

class SecondBird extends Bird{

    @Override
    public void action(){
        System.out.print("This Bird Fly");
    }
}
