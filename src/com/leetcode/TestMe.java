package com.leetcode;

public class TestMe {
    public static void main(String[] args) {

        String s = "hello world";
        //System.out.println(s.substring(1));
        System.out.println(~5);
        int index = 1;
//        String pre = s.substring(0,index);
//        String post = s.substring(index+1,s.length());
//        System.out.println(pre+post);

        StringBuilder bldr = new StringBuilder(s);
        bldr.replace(index,index,'c'+"");

        System.out.println(bldr.toString());
//        int a = 1231%1000;
//        System.out.print(a);

//        T t1 = new T(1);
//        T t2 = t1;
//        t1 = new T(2);
//        t1.print();
//        t2.print();
    }

}
class  T{
    private int _a;
    T(int a){
        _a = a;
    }
    void print(){
        System.out.println(_a);
    }
}