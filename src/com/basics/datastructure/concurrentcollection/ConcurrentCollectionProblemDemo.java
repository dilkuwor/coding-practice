package com.basics.datastructure.concurrentcollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ConcurrentCollectionProblemDemo extends Thread{
    private static List<String> myList = new LinkedList<>();
    public static void main(String[] args) {

        ConcurrentCollectionProblemDemo child = new ConcurrentCollectionProblemDemo();
        child.run();


        myList.add("Samir Kunwar");
        myList.add("Sunita Tamang");

        Iterator it = myList.iterator();
        child.start();
        while(it.hasNext()){
            String name = (String)it.next();
            System.out.println("Name"+name);
            try{
                Thread.sleep(3000);
            }catch (Exception ex){
                ex.printStackTrace();

            }
        }
    }
    public void run(){
        try{
            myList.add("Ganesh");
            Thread.sleep(3000);
        }catch (Exception ex){
            ex.printStackTrace();

        }
    }
}
