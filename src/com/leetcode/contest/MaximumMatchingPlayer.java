package com.leetcode.contest;

import java.util.Arrays;

public class MaximumMatchingPlayer {
    public static void main(String[] args) {
        MaximumMatchingPlayer m = new MaximumMatchingPlayer();
        int[] players = {4,7,9}, trainers = {8,2,5,8};
        System.out.println(m.matchPlayersAndTrainers(players,trainers));
    }

    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int res = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);

        int p = players.length-1;
        int t = trainers.length-1;
        while(p>=0 && t>=0)
        {
            if(trainers[t]<players[p])
            {
                p--;
                continue;
            }
            t--;
            p--;
            res++;
        }
        return res;
    }
}
