package com.leetcode.tree;

public class MyTreeTest {
    public static void main(String[] args) {
        int[] arr = {16,2,5,7,8,9,11};
        MyTree m = new MyTree();
        for(int a:arr){
            m.add(a);
        }

        System.out.println("Tree traversal:");
        System.out.print(m.toString());
    }
}
