package com.basics.lambda.unit1excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Excercise {
    public static void main(String[] args) {
            List<Person> persons = Arrays.asList(
                    new Person("Samir","Bista",89),
                    new Person("Samir","Kunwar",89),
                    new Person("Samir","Tamang",89),
                    new Person("Samir","Kunwar",89)
            );

            // sort collection
            Collections.sort(persons, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
//            Collections.sort(persons, new Comparator<Person>() {
//                @Override
//                public int compare(Person o1, Person o2) {
//                    return o1.getLastName().compareTo(o2.getLastName());
//                }
//            });

        printConditionally(persons, (p) ->true, p -> System.out.println("Print conditionally"+p));

            printConditionally(persons, (p) -> p.getLastName().startsWith("T"), p -> System.out.println("Print conditionally"+p));
        }


        private static void printConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer){
            for(Person person: people){
                if(condition.test(person)){
                    consumer.accept(person);
                    System.out.println("Print conditionally"+person);
                }
            }
        }

    }

