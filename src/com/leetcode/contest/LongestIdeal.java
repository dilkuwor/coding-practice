package com.leetcode.contest;

public class LongestIdeal {
    public static void main(String[] args) {
        LongestIdeal l = new LongestIdeal();
        System.out.println(l.longestIdealString("acfgbd",2));
        //System.out.println(l.longestIdealString("abcd",3));

        //System.out.println('z'-'a');
    }

    public int longestIdealString(String s, int k) {
        StringBuilder bldr = new StringBuilder();
        char pre = ' ';
        boolean continues = false;

        int start = 0;
        int max = 0;
        while(start<s.length())
        {
            pre = ' ';
            bldr = new StringBuilder();
            int temp = start;
            for(int i = start;i<s.length();i++)
            {
                if(pre == ' ')
                    pre = s.charAt(i);
                else if(Math.abs(s.charAt(i)-pre)<=k)
                {
                    bldr.append(pre);
                    pre = s.charAt(i);
                    continues = true;
                }
                else {
                    if(temp==start)
                        temp = i;
                    continues = false;

                }
            }

            if(temp == start)
                break;;

            if(continues)
                bldr.append(pre);
            max = Math.max(bldr.length(),max);
        }


        return max;
    }
}
