package com.leetcode.amazon.arrays_n_string;

public class TrappingRainWater {
    public static void main(String[] args) {
        TrappingRainWater tr = new TrappingRainWater();
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int totalWater = tr.trap4(height);
        System.out.println(totalWater);

    }

    public int trap(int[] height) {
        int start = 0;
        int end = 0;
        int totalWater = 0;
        int wall = 0;
        while (wall < height.length - 1) {
            if (start == 0 && height[wall] == 0) {
                wall++;
            } else {
                start = wall;
                end = start + 1;
                if (end < height.length && height[end] < height[start]) {
                    int obs = 0;
                    int secondHighestWall = end;
                    while (height[end] < height[start] && end < height.length - 1) {
                        obs += height[end];
                        end++;
                        if (height[end] > height[end - 1] && height[end] < height[start] && height[end] > height[secondHighestWall]) {
                            secondHighestWall = end;
                        }
                    }

                    if (end > start && height[secondHighestWall] < height[end]) {
                        int diff = end - 1 > start ? end - start - 1 : end - start;
                        totalWater += (Math.min(height[start], height[end])) * diff - obs;
                        wall = end;
                    } else if (secondHighestWall > start + 1) {
                        obs = 0;
                        for (int i = start + 1; i < secondHighestWall; i++) {
                            obs += Math.min(height[i], height[secondHighestWall]);
                        }
                        int diff = secondHighestWall - 1 > start ? secondHighestWall - start - 1 : secondHighestWall - start;
                        totalWater += (Math.min(height[start], height[secondHighestWall])) * diff - obs;
                        wall = secondHighestWall;
                    } else
                        wall++;
                } else {
                    wall++;
                }
            }
        }

        return totalWater;
    }

    public int trap1(int[] height) {
        int totalWater = 0;
        int startIndex = 0;
        int secondHightest = 0;
        int i = 0;
        while (i < height.length - 1) {
            while (height[i] == 0 && startIndex == 0 && i < height.length - 1) {
                i++;
            }
            startIndex = i;
            i++;
            if (height[secondHightest] < height[i])
                secondHightest = i;
            //find second wall
            int tempWall = 0;
            while (height[startIndex] > height[i] && i < height.length - 1) {
                tempWall += height[i];
                i++;
            }
            if (height[i] >= height[startIndex]) {
                totalWater += ((i - startIndex) * Math.min(height[i], height[startIndex]) - tempWall - Math.min(height[i], height[startIndex]));
                startIndex = i;
            } else {
                i = startIndex + 1;
            }
            if (height[startIndex] > height[i]) {
                tempWall = 0;
                for (int j = startIndex; j < secondHightest; j++) {
                    tempWall += Math.max(height[secondHightest], height[j]);
                }

                totalWater += ((secondHightest - startIndex) * Math.min(height[secondHightest], height[startIndex]) - tempWall - Math.min(height[secondHightest], height[startIndex]));
                i = secondHightest;
            }
        }
        return totalWater;
    }

    public int trap2(int[] arr) {
        if(arr.length<3)
            return 0;

        int n = arr.length;
        int totalWater = 0;
        for(int i = 1;i<n-1;i++){

            int left = arr[i];
            int right = arr[i];

            //find left wall
            for(int k = 0;k<i;k++){
                left = Math.max(left,arr[k]);
            }

            for(int j = i+1;j<n;j++){
                right = Math.max(right,arr[j]);
            }

            //find right wall

            totalWater +=Math.min(left,right) - arr[i];
        }
        return totalWater;
    }

    public int trap3(int[] arr){
        if(arr.length<3)
            return 0;

        int totalWater = 0;
        int n = arr.length;
        int[] leftArr = new int[n];
        int[] rightArr = new int[n];

        //fill the left array

        leftArr[0] = arr[0];
        for(int i =1;i<n-1;i++){
            leftArr[i] = Math.max(leftArr[i-1],arr[i]);
        }

        //fill the right array

        rightArr[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            rightArr[i] = Math.max(rightArr[i+1],arr[i]);
        }


        for(int i = 1;i<n-1;i++){




            //find right wall

            totalWater +=Math.min(leftArr[i],rightArr[i]) - arr[i];
        }
        return totalWater;
    }

    public int trap4(int[] arr){

        int totalWater = 0;

        int n = arr.length;
        int leftMax = 0;
        int rightMax = 0;
        int low = 0;
        int hi = n - 1;

        while(low<=hi){

            if(arr[low]<arr[hi])
            {
                if(arr[low]>leftMax)
                    leftMax = arr[low];
                else
                    totalWater +=leftMax - arr[low];

                low++;
            }
            else{

                if(arr[hi]>rightMax)
                    rightMax = arr[hi];
                else
                    totalWater +=rightMax - arr[hi];
                hi--;
            }

        }
        return totalWater;
    }
}
