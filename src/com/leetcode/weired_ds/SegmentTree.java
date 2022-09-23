package com.leetcode.weired_ds;

public class SegmentTree {
    public static void main(String[] args) {

    }

    void constructTree(int[] input, int[] segTree, int low, int high, int pos)
    {
        if(low == high)
        {
            segTree[pos] = input[low];
            return;
        }
        int mid = (low+high)/2;
        constructTree(input, segTree,low,mid, 2*pos+1);
        constructTree(input, segTree, mid+1, high, 2*pos+2);
        segTree[pos] = Math.min(segTree[2*pos+1], segTree[2*pos+2]);
    }

    int rangeMinQuery(int[] segTree, int qlow, int qhigh, int low, int high, int pos)
    {
        if(qlow<=low && qhigh>= high) //total overlap
        {
            return segTree[pos];
        }

        if(qlow>high || qhigh<low) //no overlap
        {
            return Integer.MAX_VALUE;
        }

        int mid = (low + high)/2;
        return  Math.min(rangeMinQuery(segTree,qlow,qhigh, low,mid,2*pos+1),
                rangeMinQuery(segTree, qlow, qhigh, mid+1, high, 2*pos+2));
    }
}
