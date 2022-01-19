package com.basics.lambda.unit1excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Java7Solution {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Samir","Bista",89),
                new Person("Samir","Kunwar",89),
                new Person("Samir","Tamang",89),
                new Person("Samir","Kunwar",89)
        );

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        printAll(persons);

        printConditionally(persons, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("K");
            }
        });
    }

    private static void printAll(List<Person> persons) {
        for(Person p:persons){
            System.out.println(p);
        }
    }

    private static void printConditionally(List<Person> people, Condition condition){
        for(Person person: people){
            if(condition.test(person)){
                System.out.println("Print conditionally"+person);
            }
        }
    }

}

interface  Condition{
    boolean test(Person person);
}
