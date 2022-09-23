package com.leetcode.graph.algorithm;

public class MaxAreaOfIsland {
    public static void main(String[] args) {
        MaxAreaOfIsland m = new MaxAreaOfIsland();
        int[][] grid = {{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        System.out.println(m.maxAreaOfIsland(grid));
    }

    public int maxAreaOfIsland(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        DisjointSet ds = new DisjointSet(m*n);
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {

                if(grid[i][j] == 1)
                {
                    int current = i*n + j;
                    ds.setSize(current);
                    //union - create edge between current cell and top/left cell
                    if((i-1)>=0 && grid[i-1][j] == 1)
                    {
                        int top = (i-1)*n + j;
                        ds.union(top,current);
                    }

                    if((j-1)>=0 && grid[i][j-1] == 1)
                    {
                        int left = i*n + j-1;
                        ds.union(left,current);
                    }
                }
            }
        }
        return ds.getMaxArea();
    }

    class DisjointSet
    {
        int[] parent;
        int[] size;
        int maxArea = 0;
        public DisjointSet(int size)
        {
            parent = new int[size];
            this.size = new int[size];
            for(int i =0;i<size;i++)
            {
                parent[i] = i;
            }
        }

        void setSize(int i)
        {
            this.size[i] = 1;
            if(maxArea == 0)
                maxArea = 1;
        }

        int find(int x)
        {
            if(x == parent[x])
                return x;
            return parent[x] = find(parent[x]);
        }

        void union(int x, int y)
        {
            int px = find(x);
            int py = find(y);
            if(px == py)
                return;

            parent[py] = px;
            size[px] += size[py];
            maxArea = Math.max(maxArea, size[px]);
        }

        int getMaxArea()
        {
            return maxArea;
        }
    }
}
