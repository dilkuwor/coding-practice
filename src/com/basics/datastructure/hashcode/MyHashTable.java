package com.basics.datastructure.hashcode;

import java.util.Arrays;
import java.util.List;

public class MyHashTable<T> {
    private int size;
    private T[] data;
    MyHashTable(){
        this.size = 16;
        this.data = (T[])new Object[16];
    }

    public void add(T item){
        int index = this.getIndex(item);
        data[index] = item;
    }
    public List<T> getAll(){

        List<T> myList = Arrays.asList(this.data);
        Arrays.stream(this.data).sequential().forEach((e) ->{
            if(e!=null)
            System.out.println(e.hashCode());
        });

        return myList;

    }

    private int getIndex(T item){
         int hascode = item.hashCode();
        int index = hascode%this.size;
        return index;
    }
}
