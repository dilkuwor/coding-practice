package com.leetcode.contest;

import java.util.ArrayList;
import java.util.List;

public class Substring {
    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        char[] arr = str.toCharArray();
        List<String> subs = new ArrayList<>();
        for(int i = 0;i<=(1<<n)-1;i++)
        {
            StringBuilder bldr = new StringBuilder();
            String binary = Integer.toBinaryString(i);
            System.out.println(binary);
            //System.out.println(binary);
            for(int k = 0;k<n;k++)
            {
                if((i&(1<<k)) > 0)
                {
                    bldr.append(arr[k]);
                }
            }
            subs.add(bldr.toString());
        }
        for(String s: subs)
        {
            //System.out.println(s);
        }

        for(int i  = 0;i<n;i++)
        {
            for(int j = 0;j<i;j++)
            {
                //System.out.println(str.substring(j,i));
            }
        }
    }
}
