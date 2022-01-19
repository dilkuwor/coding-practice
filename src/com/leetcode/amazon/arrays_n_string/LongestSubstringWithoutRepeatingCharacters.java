package com.leetcode.amazon.arrays_n_string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters ls = new LongestSubstringWithoutRepeatingCharacters();

        String input = "abcabcbb";
        System.out.println("Longest substring..:"+ls.lengthOfLongestSubstring(input));
    }
    public int lengthOfLongestSubstring(String s){
        if(s.isEmpty())
            return 0;

        HashMap<Character, Integer> charIndex = new HashMap<>();
        int longest = 1;
        int startIndex = 0;
        for(int i =0;i<s.length();i++){
            if(charIndex.containsKey(s.charAt(i)) && charIndex.get(s.charAt(i))>=startIndex){
                int firstCharIndex = charIndex.get(s.charAt(i));
                longest = Math.max(longest, i- startIndex);
                startIndex = firstCharIndex+1;

            }
            charIndex.put(s.charAt(i),i);
        }
        longest = Math.max(longest, s.length() - startIndex);
        return longest;
    }

    public int lengthOfLongestSubstring1(String s){
        if(s.isEmpty())
            return 0;
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int i = 0, j = 0; i < n; i++) {
            if (map.containsKey(s.charAt(j))) {
                j = Math.max(map.get(s.charAt(i)), j);
            }
            ans = Math.max(ans, i - j + 1);
            map.put(s.charAt(i), i + 1);
        }
        return ans;
    }
}
