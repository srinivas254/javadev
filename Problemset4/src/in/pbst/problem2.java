package in.pbst;

import java.util.Arrays;

public class problem2 {

    public static int findKthMax(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 7, 4, 9, 5};
        int k = 2;

        int kthMax = findKthMax(nums, k);
        System.out.println("Kth maximum element: " + kthMax);
    }
}

