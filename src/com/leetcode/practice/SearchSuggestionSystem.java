package com.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSuggestionSystem {
    public static void main(String[] args) {
        String[] arr  = {"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord = "mouse";
        SearchSuggestionSystem s = new SearchSuggestionSystem();

        List<List<String>> tmp = s.suggestedProducts(arr,searchWord);
        for(List<String> strings: tmp)
        {
            System.out.println(Arrays.toString(strings.toArray()));
        }

    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord)
    {
        List<List<String>> result = new ArrayList<>();
        Arrays.sort(products);
        int bStart = 0;
        int start = 0;
        int n = products.length;
        String prefix = new String();
        for(char c: searchWord.toCharArray())
        {
            prefix +=c;
            result.add(new ArrayList<>());
            start = findLowerBound(products,bStart,prefix);
            for(int i = start;i<Math.min(start+3,n);i++)
            {
                if(products[i].length()<prefix.length() || !products[i].substring(0,prefix.length()).equals(prefix))
                    break;
                result.get(result.size()-1).add(products[i]);
            }
            bStart = Math.abs(start);
        }

        return result;
    }

    int findLowerBound(String[] products, int low, String searchWord)
    {
        int l = low;
        int h = products.length;
        while(l<h)
        {
            int mid = l + (h - l)/2;

            if(products[mid].compareTo(searchWord)>=0)
                h = mid;
            else
                l = mid + 1;

        }
        return l;
    }
}
