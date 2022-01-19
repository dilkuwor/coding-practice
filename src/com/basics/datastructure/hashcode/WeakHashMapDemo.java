package com.basics.datastructure.hashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        //Issue with HashMap
        System.out.println("**** ISSUE WITH HASH MAP *****");
        Map myMap = new WeakHashMap();
        Temp key1 = new Temp();
        myMap.put(key1,343);

        System.out.println(myMap);
        key1 = null;
        System.gc();
        Thread.sleep(3000);

        System.out.println(myMap);

        System.out.println("**** Weak Hash Map *****");
    }
}
class Temp{

    @Override
    public String toString(){
        return "temp";
    }
}
