package com.basics.lambda.ExceptionHandling;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int a[] = {3, 34, 43, 34,0};
        int key = 2;
        process(a,key, wrapperLambda((i,j) -> System.out.println(j/i)));
    }

    private static void process(int[] arr, int key, BiConsumer<Integer,Integer> biconsumer){
        for(int i: arr){
            biconsumer.accept(i, key);
        }
    }
    private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> biconsumer){
        return (k,v) ->{
            try{
                biconsumer.accept(k,v);
            }catch (ArithmeticException ex){
                System.out.println("ArithmeticException thrown");
            }
        };
    }
}
