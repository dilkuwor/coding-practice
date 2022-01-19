package com.leetcode.amazon.arrays_n_string;

/**
 * 11. Container With Most Water
 * Medium
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines,
 * which, together with the x-axis forms a container, such that the container contains the most water.
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater c = new ContainerWithMostWater();
        System.out.println("Max Area: "+c.maxArea(height));
    }

    public int maxArea(int[] height){
        int leftWall = 0;
        int rightWall = height.length-1;
        int maxArea = 0;
        if(height.length == 0)
            return maxArea;
        while(leftWall<rightWall){
            int tempArea = Math.min(height[leftWall],height[rightWall]) * (rightWall-leftWall);
            System.out.println("LW: "+leftWall+" RW: "+rightWall+" "+tempArea);
            if(tempArea>maxArea){
                maxArea = tempArea;
            }
            if(height[leftWall]>=height[rightWall]){
                rightWall--;
            }
            else{
                leftWall++;
            }
        }
        return maxArea;
    }

}
