package com.leetcode.facebook_practice;

import java.util.HashMap;
import java.util.Map;

public class MinSubstring {
    public static void main(String[] args) {
        String s = "dcbefebce";
        String t = "fd";

        System.out.print(getMinSubstring(s,t));


    }

    public  static int getMinSubstring(String s1, String s2)
    {
        Map<Character, Integer> charFrequency = new HashMap<>();
        String shortest = s1;
        if(s1.length()>s2.length())
        {
            shortest = s2;
        }
        for(char c: shortest.toCharArray())
        {
            int count = charFrequency.getOrDefault(c,0);
            charFrequency.put(c,++count);
        }

        int[] window = {0,1,1};
        int size = shortest.length();
        int low = 0;
        int high = s1.length();

        while(low<high)
        {

            while(!charFrequency.containsKey(s1.charAt(low)))
            {
                low++;
            }

            int tempCounter = 0;
            int t = low;
            Map<Character, Integer> tempMap = new HashMap<>();
            while (t<s1.length() && tempCounter<size)
            {
                char cc = s1.charAt(t);
                int fre = tempMap.getOrDefault(cc,0);
                if(charFrequency.containsKey(cc))
                {
                    if(fre<=charFrequency.get(cc))
                    {
                        tempCounter++;
                    }
                    tempMap.put(cc,++fre);
                }
                t++;

            }
            if(t>=s1.length())
            {
                low = t;
            }
            int left = low;
            for(int i = low;i<t;i++)
            {
                //
                //        ////s = "ddaaaaefebce" t = "fdd"
                //
                //
                char cc = s1.charAt(i);
                //int counter = tempMap.getOrDefault(cc);
                if(tempMap.containsKey(cc))
                {
                    int counter = tempMap.getOrDefault(cc,0);
                    tempMap.put(cc,--counter);
                    if(charFrequency.get(cc)<counter)
                    {
                        left++;
                    }
                    else{

                        if(low-left<window[2])
                        {
                            window[0] = left;
                            window[1] = low;
                            window[2] = low-left;
                        }
                        low = left;
                    }
                }
            }

        }

        //
        return window[2]>=shortest.length()?window[2]:-1;
    }
}
