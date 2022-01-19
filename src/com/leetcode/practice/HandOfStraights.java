package com.leetcode.practice;

import java.util.*;

/**
 * 846
 * Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of size groupSize, and consists of groupSize consecutive cards.
 *
 * Given an integer array hand where hand[i] is the value written on the ith card and an integer groupSize, return true if she can rearrange the cards, or false otherwise.
 * Medium
 */
public class HandOfStraights {
    public static void main(String[] args) {
        int[] hand = {8,9,10,10,11,12};
        int groupSize = 3;
        HandOfStraights hs = new HandOfStraights();
        System.out.println(hs.isStraightHand(hand,groupSize));
    }

    public boolean isNStraightHand(int[] hand, int groupSize){
        if(hand == null || groupSize == 0 || hand.length%groupSize!=0)
            return false;
        Arrays.sort(hand); //sort the array


        List<Stack<Integer>> groups = new ArrayList<>();

        for(int a: hand){
            boolean added = false;
            for(Stack<Integer> grp: groups){
                if(grp.size()<groupSize && !grp.contains(a)){
                    if(grp.size()>0){
                        int pre = grp.peek();
                        if(pre+1!=a)
                        {
                            return false;
                        }
                    }
                    grp.add(a);
                    added = true;
                    break;
                }

            }
            if(!added){
                Stack<Integer> newGroup = new Stack<>();
                newGroup.add(a);
                groups.add(newGroup);
            }
        }
        for(Stack<Integer> grp:groups){
            if(grp.size()!=groupSize)
                return false;
        }
        return true;
    }

    public boolean isStraightHand(int[] hand, int groupSize){
        Arrays.sort(hand);
        TreeMap<Integer,Integer> map =  new TreeMap<>();
        for(int a: hand){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else {
                map.put(a, 1);
            }
        }
        while(!map.isEmpty()){
            int key = map.firstKey();
            int counter = 0;
            while(counter<groupSize){
                if(map.containsKey(counter+key)){
                    if(map.get(key+counter)>1){
                        map.put(key+counter,map.get(key+counter)-1);
                    }
                    else{
                        map.remove(key+counter);
                    }
                }else{
                    return false;
                }

                counter++;
            }
        }
        return true;
    }

}
