package in.pbst;

import java.util.*;

public class problem12 {

    public static int countDistinct(int[] arr) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        for (int num : arr) {
            if (elementCountMap.containsKey(num)) {
                elementCountMap.put(num, elementCountMap.get(num) + 1);
            } else {
                elementCountMap.put(num, 1);
            }
        }
        return elementCountMap.size();
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 5, 6, 2, 7, 5, 8, 8};
        System.out.println("Original array: " + Arrays.toString(array));
        int distinctCount = countDistinct(array);
        System.out.println("Number of distinct elements: " + distinctCount);
    }
}

