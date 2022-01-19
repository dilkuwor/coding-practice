package com.leetcode.amazon.arrays_n_string;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        MinimumWindowSubstring ms = new MinimumWindowSubstring();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(ms.minWindow(s,t));

    }
    public String minWindow(String s, String t) {
        //create char frequency

        Map<Character, Integer> dictT = new HashMap<>();
        for(Character c: t.toCharArray()){
            int d = dictT.getOrDefault(c,0);
            dictT.put(c,d+1);
        }

        int required = dictT.size(); //unique character required in the window


        int formed = 0;
        int l = 0,r = 0;

        int ans[] = {-1,0,0};

        Map<Character,Integer> windowSize = new HashMap<>();


        while (r<s.length()){
            Character c = s.charAt(r);

            int count = windowSize.getOrDefault(c,0);
            windowSize.put(c,count + 1);

            if(dictT.containsKey(c) && windowSize.get(c).intValue() == dictT.get(c).intValue()){
                formed++;
            }

            while (l<=r && formed == required){
                if(ans[0] == -1 || r-l+1<ans[0]){
                    ans[0] = r-l+1;
                    ans[1] = l;
                    ans[2] = r;

                }

                char tmp = s.charAt(l);
                int tmpCount = windowSize.getOrDefault(tmp,0);
                windowSize.put(tmp,tmpCount-1);
                if(dictT.containsKey(tmp) && windowSize.get(tmp).intValue()<dictT.get(tmp).intValue()){
                    formed--;
                }
                l++;
            }

            r++;


        }

        return ans[0] ==-1?"":s.substring(ans[1],ans[2]);
    }
}
