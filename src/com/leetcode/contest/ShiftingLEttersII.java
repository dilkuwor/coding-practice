package com.leetcode.contest;

public class ShiftingLEttersII {
    public static void main(String[] args) {
        ShiftingLEttersII s = new ShiftingLEttersII();
        String str = "jacoxz";
        int[][] matr =
        {{0,4,0},{0,2,1},{1,3,1},{0,4,1},{4,4,1},{2,3,0},{5,5,0},{3,3,0},{2,3,0},{5,5,1},{5,5,1},{5,5,0}};
        System.out.println(s.shiftingLetters(str,matr));
    }

    public String shiftingLetters(String s, int[][] shifts) {
        char[] carr = s.toCharArray();
        for(int[] arr: shifts)
        {
            for(int i = arr[0];i<=arr[1];i++)
            {
                //forward
                if(arr[2] == 1)
                {
                    carr[i] = (char)(((carr[i] - 'a' + 1)%26)+'a');
                    System.out.println(carr[i]);
                }
                else{
                    int temp = carr[i] - 'a' - 1;
                    if(temp<0)
                        temp +=26;
                    carr[i] = (char)(((temp)%26)+'a');
                    System.out.println(carr[i]);
                }
            }
        }

        return new String(carr);
    }
}
