package com.leetcode.uber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNumber {
    private List<String> combinations = new ArrayList<>();
    private Map<Character, String> letters = Map.of(
            '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
    private String phoneDigits;
    public static void main(String[] args) {
        LetterCombinationOfPhoneNumber l = new LetterCombinationOfPhoneNumber();
        List<String>  ans = l.letterCombinations("234");
        System.out.println(ans);
    }

    public List<String> letterCombinations(String digits) {
        this.phoneDigits = digits;
        backTrack(0,new StringBuilder());
        return combinations;
    }

    public void backTrack(int index, StringBuilder path)
    {
        if(path.length() == phoneDigits.length())
        {
            combinations.add(path.toString());
            return; //backtrack
        }

        String possibleLetters = letters.get(phoneDigits.charAt(index));
        for(char c: possibleLetters.toCharArray())
        {
            path.append(c);
            backTrack(index+1,path);
            //clear before leaving
            path.deleteCharAt(path.length() - 1);
        }

    }
}
