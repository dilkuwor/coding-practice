package com.basics.serialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee emp = new Employee("samir kunwar",2);

        FileOutputStream fileStream = new FileOutputStream("emp.txt");
        ObjectOutputStream objStream = new ObjectOutputStream(fileStream);
        objStream.writeObject(emp);

        Employee emp2 = null;
        FileInputStream fileInputStream = new FileInputStream("emp.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        emp2 = (Employee)inputStream.readObject();
        System.out.println(emp2.getName());

    }
}

class Employee implements Serializable{
    private String name;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
}
