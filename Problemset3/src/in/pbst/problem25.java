package in.pbst;

import java.util.Arrays;

public class problem25 {

    public static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] rotatedArr = new int[n];
        System.arraycopy(arr, k, rotatedArr, 0, n - k);
        System.arraycopy(arr, 0, rotatedArr, n - k, k);
        return rotatedArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println("Original array: " + Arrays.toString(arr));
        int[] rotatedArr = rotateArray(arr, k);
        System.out.println("Circularly rotated array by " + k + " positions: " + Arrays.toString(rotatedArr));
    }
}
