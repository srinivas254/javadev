package in.pbst;

import java.util.Arrays;

public class problem19 {

    public static long maxProduct(int[] nums) {
        long maxProduct = nums[0];
        long minProduct = nums[0];
        long maxOverall = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            long tempMax = Math.max(current, Math.max(maxProduct * current, minProduct * current));
            long tempMin = Math.min(current, Math.min(maxProduct * current, minProduct * current));

            maxProduct = tempMax;
            minProduct = tempMin;

            if (maxProduct > maxOverall) {
                maxOverall = maxProduct;
            }
        }

        return maxOverall;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Original array: " + Arrays.toString(nums));

        long maxProduct = maxProduct(nums);
        System.out.println("Maximum product of a subarray: " + maxProduct);
    }
}

