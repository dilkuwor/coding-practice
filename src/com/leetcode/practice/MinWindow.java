package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class MinWindow {
    public static void main(String[] args) {

    }
    public String minWindow(String s, String t) {

        //unique character in the substring
        Map<Character, Integer> frequency = new HashMap<>();
        for(char c:t.toCharArray())
        {
            frequency.put(c,frequency.getOrDefault(c,0)+1);
        }

        int required = frequency.size();
        int formed = 0;

        int l = 0,r = 0;
        int[] marker = {-1,0,0};
        //unique character in the window
        Map<Character, Integer> window = new HashMap<>();
        while (r<s.length())
        {
            char c = s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);
            if(frequency.containsKey(c) && frequency.get(c).intValue() == window.get(c).intValue())
            {
                formed++;
            }

            while (l<=r && required == formed)
            {
                char cc = s.charAt(l);

                //save smallest window untill now
                if(marker[0] == -1 || r-l<marker[0])
                {
                    marker[0] = r-l;
                    marker[1] = l;
                    marker[2] = r;
                }
                window.put(cc, window.getOrDefault(cc,0) -1);
                if(frequency.containsKey(cc) && window.get(cc).intValue()<=frequency.get(cc).intValue())
                {

                    formed--;
                }

                l++;
            }

            r++;
        }

        return marker[0]>0?s.substring(marker[0],marker[1]):"";
    }
}
