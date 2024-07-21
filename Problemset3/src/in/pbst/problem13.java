package in.pbst;

import java.util.*;

public class problem13 {

    public static List<Integer> findRepeatingElements(int[] arr) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();
        List<Integer> repeatingElements = new ArrayList<>();

        for (int num : arr) {
            if (elementCountMap.containsKey(num)) {
                if (!repeatingElements.contains(num)) {
                    repeatingElements.add(num);
                }
            } else {
                elementCountMap.put(num, 1);
            }
        }

        return repeatingElements;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 5, 6, 2, 7, 5, 8, 8};
        System.out.println("Original array: " + Arrays.toString(array));

        List<Integer> repeatingElements = findRepeatingElements(array);
        System.out.println("Repeating elements in the array: " + repeatingElements);
    }
}

