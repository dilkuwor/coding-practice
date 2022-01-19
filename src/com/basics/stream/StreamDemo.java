package com.basics.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(new Integer(10));
        arrayList.add(new Integer(10));
        arrayList.add(new Integer(50));
        arrayList.add(new Integer(10));
        arrayList.add(new Integer(40));
        arrayList.add(new Integer(30));

        ArrayList<Integer> greaterThan = (ArrayList<Integer>) arrayList.stream().filter(k-> k>30
                ).collect(Collectors.toList());
        System.out.println(greaterThan);

        ArrayList<Integer> mapper = (ArrayList<Integer>) arrayList.stream().map(r -> r*5).collect(Collectors.toList());
        System.out.println(mapper);
    }
}
