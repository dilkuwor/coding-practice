package com.leetcode.contest;

public class MinimumRecolors {
    public static void main(String[] args) {
        MinimumRecolors m = new MinimumRecolors();
        String blocks = "WBBWWBBWBW";
        int k = 7;
        System.out.println(m.minimumRecolors(blocks,k));
    }

    public int minimumRecolors(String blocks, int k) {

        int res = Integer.MAX_VALUE;
        for(int i = 0;i<blocks.length();i++)
        {
            int b = 0;
            int w = 0;
            for(int j = i;j<blocks.length();j++)
            {
                if(blocks.charAt(j) =='B')
                {
                    b++;
                }
                else{
                    w++;
                }
                if(b+w == k)
                {
                    res = Math.min(res,w);
                }
            }
        }
        return res;
    }

}
