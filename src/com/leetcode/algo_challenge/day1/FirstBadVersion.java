package com.leetcode.algo_challenge.day1;

public class FirstBadVersion {
    public static void main(String[] args) {
        FirstBadVersion fs = new FirstBadVersion();
        System.out.println(fs.firstBadVersion(3));
    }

    public int firstBadVersion(int n) {

        int low = 1;
        int high = n;
        while(low<high){
            int mid = low+(high-low)/2;
            if(isBadVersion(mid)){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    boolean isBadVersion(int a){
        if (a>=2)
            return true;
        else
            return false;

    }
}
