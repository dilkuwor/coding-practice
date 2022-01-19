package com.basics.lambda.thisreference;

public class ThisReferenceExample {
    public static void main(String[] args) {

        ThisReferenceExample reference = new ThisReferenceExample();
        reference.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i);
                System.out.println(this);
            }

            @Override
            public String toString(){
                return "This is anynomous function";
            }
        });

    }

    void doProcess(int i, Process p){
        p.process(i);
    }
}

interface Process{
    void process(int i);
}
