package in.pbst;

import java.util.Arrays;

public class problem22 {

    public static boolean canMakeEqual(int[] nums) {
        Arrays.sort(nums);

        int diff = nums[nums.length - 1] - nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[0] && nums[i] != nums[0] + diff) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 1, 1, 1, 1};
        int[] nums3 = {1, 2, 2, 3, 3, 4};

        System.out.println("Array 1: " + Arrays.toString(nums1));
        System.out.println("Can all numbers be made equal? " + canMakeEqual(nums1));

        System.out.println("Array 2: " + Arrays.toString(nums2));
        System.out.println("Can all numbers be made equal? " + canMakeEqual(nums2));

        System.out.println("Array 3: " + Arrays.toString(nums3));
        System.out.println("Can all numbers be made equal? " + canMakeEqual(nums3));
    }
}

