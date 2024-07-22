package in.pbst;

import java.util.Arrays;

public class problem21 {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int k = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                k = i;
                break;
            }
        }
        
        if (k == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
 
        int l = -1;
        for (int i = n - 1; i > k; i--) {
            if (nums[i] > nums[k]) {
                l = i;
                break;
            }
        }
 
        swap(nums, k, l);
     
        reverse(nums, k + 1, n - 1);
    }
    
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println("Next permutation: " + Arrays.toString(nums));
        
        int[] nums2 = {3, 2, 1};
        nextPermutation(nums2);
        System.out.println("Next permutation: " + Arrays.toString(nums2));
        
        int[] nums3 = {1, 1, 5};
        nextPermutation(nums3);
        System.out.println("Next permutation: " + Arrays.toString(nums3));
    }
}

