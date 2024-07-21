package in.pbst;

import java.util.Arrays;

public class problem23 {

    public static int minSumOfAbsoluteDifferences(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 1; i < nums.length; i++) {
            sum += Math.abs(nums[i] - nums[i - 1]);
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 1, 5, 6};
        System.out.println("Original array: " + Arrays.toString(nums));

        int minSum = minSumOfAbsoluteDifferences(nums);
        System.out.println("Minimum sum of absolute differences: " + minSum);
    }
}

