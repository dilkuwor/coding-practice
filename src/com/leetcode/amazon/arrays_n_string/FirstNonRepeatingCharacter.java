package com.leetcode.amazon.arrays_n_string;


import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        FirstNonRepeatingCharacter fs = new FirstNonRepeatingCharacter();
        String s = "leetcode";
        System.out.print(fs.firstUniqChar(s));
    }
    public int firstUniqChar(String s) {
        Map<Character,Integer> arr = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            int count = arr.getOrDefault(s.charAt(i),0);
            arr.put(s.charAt(i),++count);
        }
        for(int i = 0;i<s.length();i++){
            if(arr.get(s.charAt(i)).intValue() == 1)
                return i;
        }
        return -1;
    }

    public int firstUniqCharFreq(String s) {
        int[] charFreq = new int[26];
        for(int i = 0;i<s.length();i++){
            charFreq[s.charAt(i) - 'a']++;
        }
        for(int i = 0;i<s.length();i++){
            if(charFreq[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
}
