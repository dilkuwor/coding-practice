package com.leetcode.review;

import java.util.HashMap;
import java.util.Map;

public class RLongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        RLongestSubstringWithoutRepeatingCharacter t = new RLongestSubstringWithoutRepeatingCharacter();
        String s = "abcabcbb";
        System.out.println(t.longest(s));

    }
    int longest(String s){
        Map<Character,Integer> charIndex = new HashMap<>();
        int start = 0;
        int currentIndex = 0;
        int longest = 0;
        while (currentIndex<s.length()){
            if(charIndex.containsKey(s.charAt(currentIndex))){
                int tmp = (currentIndex - start) + 1;
                if(tmp>longest)
                    longest = tmp;

                start = charIndex.get(s.charAt(currentIndex))+1;

                charIndex.put(s.charAt(currentIndex),currentIndex);
                currentIndex = start;

            }else{
                charIndex.put(s.charAt(currentIndex),currentIndex);
                currentIndex++;
            }


        }
        return longest;
    }
}
