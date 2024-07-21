package in.pbst;

import java.util.Arrays;
import java.util.Collections;

public class problem7 {

    public static void sortHalfAscendingDescending(int[] arr) {
        int n = arr.length;
        int mid = n / 2;
       
        Arrays.sort(arr, 0, mid);

        Integer[] tempArr = new Integer[n - mid];
        for (int i = mid; i < n; i++) {
            tempArr[i - mid] = arr[i];
        }
        Arrays.sort(tempArr, Collections.reverseOrder());
        for (int i = mid; i < n; i++) {
            arr[i] = tempArr[i - mid];
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 6, 9, 3, 7};
        System.out.println("Original array: " + Arrays.toString(array));
        sortHalfAscendingDescending(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}

