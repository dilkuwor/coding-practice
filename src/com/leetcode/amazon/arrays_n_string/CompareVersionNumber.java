package com.leetcode.amazon.arrays_n_string;

public class CompareVersionNumber {
    public static void main(String[] args) {
        CompareVersionNumber cv = new CompareVersionNumber();

        String version1 = "1.01";
        String version2 = "2.001";
        System.out.println(cv.compareVersion(version1,version2));
    }

    public int compareVersion(String version1, String version2) {
        //version1 = "1.01", version2 = "1.001"
        String[] level1 = version1.split("\\.");
        String[] level2 = version2.split("\\.");

        int maxLength = Math.max(level1.length,level2.length);
        for(int i =0;i<maxLength;i++){
            Integer v1 = i<level1.length? Integer.parseInt(level1[i]):0;
            Integer v2 = i<level2.length? Integer.parseInt(level2[i]):0;
            int c = v1.compareTo(v2);
            if(c!=0)
                return c;
        }
        return 0;
    }
}
