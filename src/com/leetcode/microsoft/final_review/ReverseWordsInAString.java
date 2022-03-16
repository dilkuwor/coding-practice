package com.leetcode.microsoft.final_review;

public class ReverseWordsInAString {
    public static void main(String[] args) {
//        Input: s = "the sky is blue"
//        Output: "blue is sky the"

        ReverseWordsInAString a = new ReverseWordsInAString();
        String s = "the sky is         blue    ";
        System.out.println(a.reverseWords(s));
    }

    public String reverseWords(String s) {
        char[] arr  = s.toCharArray();

        reverse(arr,0,arr.length-1);
        //skip whitespace
        boolean space = true;
        int j = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == ' ')
            {
                if(j == 0)
                {
                    continue;
                }
                else {
                    if(space)
                    {
                        arr[j++] = arr[i];
                        space = false;
                    }
                    continue;
                }
            }
            else{
                space = true;
            }
            arr[j++] = arr[i];
        }
        int last = j;
        while (j<arr.length)
        {
            arr[j++] = ' ';
        }
        int start = 0;
        while (start<s.length())
        {
            //skip whitespace
            while (start<s.length() && arr[start] == ' ')
            {
                start++;
            }
            int temp = start;

            while (temp<s.length() && arr[temp]!=' ')
            {
                temp++;
            }

            temp--;

            if(start<temp && temp<s.length())
                reverse(arr,start,temp);
            start = temp+1;
        }
        return new String(arr).substring(0,last);
    }

    void reverse(char[] arr, int start, int end)
    {
        while (start<end)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }
    }

//    public static String reverseWords(String s) {
//        String[] arr = s.split(" ");
//        int left = 0;
//        int right = arr.length - 1;
//        while (left<right)
//        {
//            String temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
//
//        return String.join(" ", arr);
//    }
}
