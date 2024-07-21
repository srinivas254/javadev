package in.pbst;

import java.util.*;

public class problem15 {

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> uniqueElements = new ArrayList<>();

        for (int num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                uniqueElements.add(num);
            }
        }

        int[] result = new int[uniqueElements.size()];
        for (int i = 0; i < uniqueElements.size(); i++) {
            result[i] = uniqueElements.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 5, 6, 2, 7, 5, 8, 8};
        System.out.println("Original array: " + Arrays.toString(array));

        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}

