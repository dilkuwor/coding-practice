package com.leetcode.microsoft.online_assessment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*-----Question 2------*/
/* Given a string s, find the minimum number of substrings you can create
 * without having the same letters repeating in each substring.
* Example:
 * world -> 1, as the string has no letters that occur more than once.
    dddd -> 4, as you can only create substring of each character.
    abba -> 2, as you can make substrings of ab, ba.
    cycle-> 2, you can create substrings of (cy, cle) or (c, ycle)
*
*/
public class MinimumSubstring {
    public static void main(String[] args) {
String world = "cycle";
System.out.println(minimum(world));
    }

    static int minimumSubstring(String str)
    {
        if(str.length() == 0)
            return 0;
        List<String> result = new ArrayList<>();
        char[] tmp = new char[str.length()];
        int charUsed = 0;
        int total = 0;
        while(charUsed<tmp.length)
        {
            Set<Character> t = new HashSet<>();
            for(int i = 0;i<str.length();i++)
            {
                if(tmp[i] == 0 && t.add(str.charAt(i)))
                {
                    tmp[i] = 1;
                    charUsed++;
                }
            }
            total++;
        }
        return total;
    }

    static int minimum(String s)
    {
        int total = 1;
        Set unique = new HashSet();
        for(char c: s.toCharArray())
        {
            if(unique.contains(c))
            {
                total++;
                unique.clear();
            }
            unique.add(c);
        }
        return total;
    }
}
