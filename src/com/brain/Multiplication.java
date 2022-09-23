package com.brain;

public class Multiplication {
    public static void main(String[] args) {
        int x = 9;
        int y = -9;
        Multiplication m = new Multiplication();
        System.out.println(m.multiply(x,y));
    }

    int multiply(int x, int y)
    {
        if(y == 0)
            return 0;

        if(y>0)
            return x + multiply(x,y-1);
        if(y<0)
            return  -multiply(x,-y);
        return -1;
    }
}
