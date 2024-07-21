package in.pbst;

import java.util.Arrays;

public class problem17 {

    public static void countEvenOdd(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
       
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 5, 6, 2, 7, 5, 8, 8};
        System.out.println("Original array: " + Arrays.toString(array));
        countEvenOdd(array);
    }
}

