package com.leetcode.microsoft.other;
/*
1578. Minimum Time to Make Rope Colorful
Medium
 */
public class MinimumTimeToTakeRopeColorful {
    public static void main(String[] args) {
        MinimumTimeToTakeRopeColorful m = new MinimumTimeToTakeRopeColorful();
        int[] neededTime = {1,2,3,4,1};
        String colors = "aabaa";
        System.out.println(m.minCost(colors,neededTime));
    }
    public int minCost(String colors, int[] neededTime) {

        int totalCost = 0;
        int start = 0;
        while(start<colors.length())
        {

            //move forward to find max index
            int temp = start;
            char color = colors.charAt(start);
            int maxIndex = start;
            int tempTotal = 0;
            while(temp<colors.length() && color == colors.charAt(temp))
            {
                if(neededTime[maxIndex]<neededTime[temp])
                {
                    maxIndex = temp;
                }
                tempTotal +=neededTime[temp];
                temp++;
            }

            if(start!=temp-1)
            {
                totalCost +=(tempTotal - neededTime[maxIndex]);
                start = temp;
            }
            else{
                start++;
            }

        }
        return totalCost;

    }
}
