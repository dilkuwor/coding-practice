package com.basics.datastructure.hashcode;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

public class MyHashDemo {
    public static void main(String[] args) {
//        Employee e = new Employee("A",23);
////        Employee e2 = new Employee("Sunita Kunwar",22);
//        int ch = (int)'a';
//        System.out.print(ch);
//        MyHashTable<Employee> employeeHashTable = new MyHashTable<>();
//        employeeHashTable.add(e);
//        employeeHashTable.add(e2);
//
//        List<Employee> _employees = employeeHashTable.getAll();
//        _employees.forEach((ee) ->{
//            if(ee!=null){
//                System.out.println(ee.getName());
//            }
//        });


        Map map = new HashMap<>();
        map.put("acr","This value is null");
        map.put("ddd","This is second null");
        map.put("1",1);
        map.put("2",1);

//        for (Object o : map.entrySet()) {
//            System.out.println(o);
//        }
//
//        map.computeIfAbsent("33", k-> 54);
//        for (Object o : map.entrySet()) {
//            System.out.println(o);
//        }

//        IdentityHashMap newMap = new IdentityHashMap();
//        Integer a = new Integer(10);
//        Integer b = new Integer(10);
//        System.out.println(a.equals(b));
//
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//
//        newMap.put(a,10);
//        newMap.put(b,10);
//
//        newMap.forEach((k,v) ->{
//            System.out.println(String.format("{%s,%s}",k,v));
//        });

        String e2 = "abc";
        String e = "bca";
        System.out.println(e2.hashCode());
        System.out.println(e.hashCode());
    }
}
