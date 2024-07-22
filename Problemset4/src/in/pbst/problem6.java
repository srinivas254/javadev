package in.pbst;

import java.util.Arrays;

public class problem6 {

    public static int minimizeMaxDiff(int[] heights, int k) {
        int n = heights.length;
        Arrays.sort(heights);
        int result = heights[n-1] - heights[0];
       
        for (int i = 1; i < n; i++) {
            int currentHeight = heights[i];
            int minAdjusted = Math.min(heights[0] + k, currentHeight - k);
            int maxAdjusted = Math.max(heights[n-1] - k, currentHeight + k);
            result = Math.min(result, maxAdjusted - minAdjusted);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] heights = {1, 15, 10};
        int k = 6;
        
        int minMaxDiff = minimizeMaxDiff(heights, k);
        System.out.println("Minimum maximum difference after adjustments: " + minMaxDiff);
    }
}

