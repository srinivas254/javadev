package in.pbst;

import java.util.Arrays;

public class problem26 {

    public static void threeWayPartition(int[] array, int pivot) {
        int n = array.length;
        int low = 0, mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (array[mid] < pivot) {
                swap(array, low, mid);
                low++;
                mid++;
            } else if (array[mid] > pivot) {
                swap(array, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 0, 2, 1, 0, 2, 1, 0, 2};
        int pivot = 1;

        System.out.println("Original Array: " + Arrays.toString(array));
        threeWayPartition(array, pivot);
        System.out.println("After Three-way Partitioning around " + pivot + ": " + Arrays.toString(array));
    }
}

