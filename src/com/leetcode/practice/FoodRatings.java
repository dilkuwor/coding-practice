package com.leetcode.practice;

import java.util.*;

public class FoodRatings {
    PriorityQueue<Pair> pq;
    public static void main(String[] args) {
       // FoodRatings fr = new FoodRatings();

    }


    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        pq =  new PriorityQueue<>((n1, n2) -> {
            // compare n1 and n2
            if(n1.rating == n2.rating)
                return n2.food.compareTo(n1.food);
            return Integer.compare(n1.rating,n2.rating);
        });
        for(int i = 0;i<foods.length;i++)
        {

            pq.add(new Pair(cuisines[i],ratings[i],foods[i]));
        }
    }
    Map<String,Pair> map = new HashMap<>();
    public void changeRating(String food, int newRating) {

        Stack<Pair> st = new Stack<>();

        while(!pq.isEmpty())
        {
            Pair curr = pq.poll();
            if(curr.food.equals(food))
            {
                pq.add(new Pair(curr.cusine,newRating,curr.food));
                break;
            }
            else {
              st.add(curr);
            }
        }
        while (!st.isEmpty())
        {
            pq.add(st.pop());
        }
    }

    public String highestRated(String cuisine) {
        if(pq.isEmpty())
            return "";
       return pq.peek().food;
    }
}

class Pair
{
    public String cusine;
    public int rating;
    public String food;
    public Pair(String a, int b, String f)
    {
        this.cusine = a;
        this.rating = b;
        this.food = f;
    }
}
