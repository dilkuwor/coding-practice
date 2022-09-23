package com.leetcode.practice.foodratings;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*
        ["FoodRatings","highestRated","highestRated","changeRating","highestRated","changeRating","highestRated"]
[[["kimchi","miso","sushi","moussaka","ramen","bulgogi"],["korean","japanese","japanese","greek","japanese","korean"],[9,12,8,15,14,7]],["korean"],["japanese"],["sushi",16],["japanese"],["ramen",16],["japanese"]]
         */

        String[] foods = {"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"};
        String[] cuisine = {"korean", "japanese", "japanese", "greek", "japanese", "korean"};
        int[] ratings = {9, 12, 8, 15, 14, 7};
        FoodRatings fd = new FoodRatings(foods,cuisine,ratings);
        //fd.toString();
        List<String> result = new ArrayList<>();
        result.add(null);
        result.add(fd.highestRated("korean"));
        result.add(fd.highestRated("japanese"));
        fd.changeRating("sushi", 16);
        result.add(null);
        result.add(fd.highestRated("japanese"));
        result.add(null);
        fd.changeRating("ramen", 16);
        result.add(fd.highestRated("japanese"));

        System.out.println(result.toString());

    }
}
