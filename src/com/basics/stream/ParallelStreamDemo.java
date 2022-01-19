package com.basics.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        long time1, time2;
        List<Employee> employes = new ArrayList<Employee>();
        for(int i =0;i<500;i++){
            employes.add(new Employee("samir",98989));
            employes.add(new Employee("john",3343));
            employes.add(new Employee("kane",333));
            employes.add(new Employee("sunita",3343));
        }

        time1 = System.currentTimeMillis();
        System.out.println("Sequential Stream Count:"+employes.stream().filter( r->r.getSalary()>1000).count());
        time2 = System.currentTimeMillis();
        System.out.println("\n\nSequential Stream Count time taken:"+(time2 - time1));
        time1 = System.currentTimeMillis();
        System.out.println("PArallel Stream Count:"+employes.parallelStream().filter( r->r.getSalary()>1000).count());
        time2 = System.currentTimeMillis();
        System.out.println("\n\nParallel Stream Count time taken:"+(time2-time1));

        StringBuilder builder = new StringBuilder();



    }
}
