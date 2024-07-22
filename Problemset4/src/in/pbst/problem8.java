package in.pbst;

import java.util.HashSet;

public class problem8 {

    public static int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        throw new IllegalArgumentException("No duplicate found in the array.");
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        
        int duplicate = findDuplicate(nums);
        System.out.println("Duplicate number in the array: " + duplicate);
    }
}

