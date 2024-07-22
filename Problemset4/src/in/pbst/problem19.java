package in.pbst;

import java.util.*;

public class problem19 {

    public static List<Integer> findElements(int[] nums, int k) {
        int n = nums.length;
        int threshold = n / k;
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
        }  
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 2, 1, 2, 3, 3};
        int k = 4;
        List<Integer> elements = findElements(nums, k);
        System.out.println("Elements appearing more than " + nums.length / k + " times:");
        System.out.println(elements);
    }
}

