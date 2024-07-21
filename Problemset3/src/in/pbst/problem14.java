package in.pbst;

import java.util.*;

public class problem14 {

    public static List<Integer> findNonRepeatingElements(int[] arr) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();
        
        for (int num : arr) {
            elementCountMap.put(num, elementCountMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> nonRepeatingElements = new ArrayList<>();

        for (int num : arr) {
            if (elementCountMap.get(num) == 1) {
                nonRepeatingElements.add(num);
            }
        }

        return nonRepeatingElements;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 5, 6, 2, 7, 5, 8, 8};
        System.out.println("Original array: " + Arrays.toString(array));

        List<Integer> nonRepeatingElements = findNonRepeatingElements(array);
        System.out.println("Non-repeating elements in the array: " + nonRepeatingElements);
    }
}

