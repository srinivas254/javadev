package in.pbst;

import java.util.*;

public class problem10 {

    public static int[] sortByFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                int freqCompare = frequencyMap.get(num2).compareTo(frequencyMap.get(num1));
                if (freqCompare == 0) {
                    return num1.compareTo(num2); 
                }
                return freqCompare;
            }
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 5, 6, 2, 7, 5, 8, 8};
        System.out.println("Original array: " + Arrays.toString(array));
        int[] sortedArray = sortByFrequency(array);
        System.out.println("Sorted array by frequency: " + Arrays.toString(sortedArray));
    }
}

