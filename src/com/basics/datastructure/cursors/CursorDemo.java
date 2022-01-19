package com.basics.datastructure.cursors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//An indicator used to show the current position for respective object or element
//Enumeration
//Iterator
//ListIterator
//Split
public class CursorDemo {
    public static void main(String[] str){
        Vector v = new Vector();
        for(int i =0;i<10;i++){
            v.add(i);
        }

        Enumeration e = v.elements();
        while(e.hasMoreElements()){

            Integer val = (Integer)e.nextElement();
            System.out.println(val);
        }

        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i =0;i<10;i++){
            arrList.add(i);
        }

        Iterator itr = arrList.iterator();
        while(itr.hasNext()){
            Integer a = (Integer) itr.next();
            System.out.println(a);
            itr.remove();
        }


    }
}
