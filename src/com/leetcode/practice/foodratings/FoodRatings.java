package com.leetcode.practice.foodratings;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class FoodRatings {
    @Override
    public String toString()
    {
        StringBuilder bldr = new StringBuilder();

        System.out.println(bldr);
        return bldr.toString();
    }
    Map<String,PriorityQueue<Food>> map = new HashMap<>();
    Map<String,Food> foodMap = new HashMap<>();
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        PriorityQueue<Food> pqq = new PriorityQueue<>((n1, n2) -> {
            // compare n1 and n2
            if(n1.rating == n2.rating)
                return n1.food.compareTo(n2.food);
            return Integer.compare(n2.rating, n1.rating);
        });
        for(int i = 0;i<foods.length;i++)
        {
            Food food = new Food(foods[i], cuisines[i],ratings[i]);
            foodMap.put(foods[i],food);
            map.putIfAbsent(cuisines[i], new PriorityQueue<>((n1, n2) -> {
                // compare n1 and n2
                if(n1.rating == n2.rating)
                    return n1.food.compareTo(n2.food);
                return Integer.compare(n2.rating, n1.rating);
            }));

            map.get(cuisines[i]).add(food);
        }
    }
    public void changeRating(String food, int newRating) {


        PriorityQueue<Food> pq = map.get(foodMap.get(food).cuisine);
        Food curr = foodMap.get(food);
        pq.remove(curr);
        curr.rating = newRating;
        pq.offer(curr);
        map.put(foodMap.get(food).cuisine,pq);
    }

    public String highestRated(String cuisine) {

        if(!map.isEmpty())
            return map.get(cuisine).peek().food;
        return "";
    }
}

class Food
{
    public String cuisine;
    public int rating;
    public String food;
    public Food(String f, String c, int r)
    {
        this.food = f;
        this.cuisine = c;
        this.rating = r;
    }

    @Override
    public String toString(){
        return "\nFood: "+this.food+", Cuisine: "+this.cuisine+" Ratings: "+this.rating;
    }
}

