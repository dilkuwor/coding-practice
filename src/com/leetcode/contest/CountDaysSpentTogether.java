package com.leetcode.contest;

import java.util.HashSet;
import java.util.Set;

public class CountDaysSpentTogether {
    public static void main(String[] args) {
        CountDaysSpentTogether s = new CountDaysSpentTogether();
        String arriveAlice = "09-01", leaveAlice = "10-19", arriveBob = "06-19", leaveBob = "10-20";
        /*
        "09-01"
"10-19"
"06-19"
"10-20"
         */
        System.out.println(s.countDaysTogether(arriveAlice,leaveAlice,arriveBob,leaveBob));
    }
    int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] aa = split(arriveAlice);
        int[] al = split(leaveAlice);

        int[] ba = split(arriveBob);
        int[] bl = split(leaveBob);

        int[] prefix = new int[13];
        for(int i = 1;i<days.length;i++)
        {
            prefix[i] = prefix[i-1]+days[i-1];
        }

        int a0 = prefix[aa[0]]+aa[1];
        int a1 = prefix[al[0]]+al[1];

        int b0 = prefix[ba[0]]+ba[1];
        int b1 = prefix[bl[0]]+bl[1];
        if(a0>b1 || b0>a1)
            return 0;
        int amax = Math.max(a0,b0);
        int lmin = Math.min(a1,b1);
        return lmin - amax + 1;

//        Set<Integer> first = new HashSet<>();
//        for(int i = (prefix[aa[0]]+aa[1]);i<=(prefix[al[0]]+al[1]);i++)
//        {
//            first.add(i);
//        }
//        int count = 0;
//        for(int i = (prefix[ba[0]]+ba[1]);i<=(prefix[bl[0]]+bl[1]);i++)
//        {
//            if(first.contains(i))
//                count++;
//        }
//        return count;
    }

    int[] split(String time)
    {
        int[] tt = {Integer.parseInt(time.split("-")[0]), Integer.parseInt(time.split("-")[1])};
        return tt;
    }
}
