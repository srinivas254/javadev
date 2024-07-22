package in.pbst;
import java.util.*;

public class problem15 {

    public static boolean hasSubarraySumZero(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum == 0 || map.containsKey(currentSum)) {
                return true;
            }
            map.put(currentSum, i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 2, -3, 2, 6};
        int[] nums2 = {4, 2, 0, 1, 6};

        System.out.println("Does nums1 contain subarray with sum 0? " + hasSubarraySumZero(nums1));
        System.out.println("Does nums2 contain subarray with sum 0? " + hasSubarraySumZero(nums2));
    }
}
