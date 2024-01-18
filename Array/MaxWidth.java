package Array;

import java.util.Arrays;

public class MaxWidth {
    public int maxWidthOfVerticalArea(int[][] points) {
        int x[] = new int[points.length];
        for(int i=0;i<points.length;i++){
            for(int j=0;j<points[i].length;j++){
                x[i]=points[i][0];
            }
        }
        Arrays.sort(x);
        int max =0;
        for(int i=0;i<x.length-1;i++){
            int width = x[i+1] - x[i];
            max = Math.max(width,max);
        }
        return max;

    }
    public static void main(String[] args) {
        MaxWidth obj = new MaxWidth();
        int arr[][] = {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
        int max = obj.maxWidthOfVerticalArea(arr);
        System.out.println(max);
    }
}
