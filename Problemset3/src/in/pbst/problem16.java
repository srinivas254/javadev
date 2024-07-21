package in.pbst;

import java.util.Arrays;

public class problem16 {

    public static long findMinimumScalarProduct(int[] vector1, int[] vector2) {
        Arrays.sort(vector1);
        Arrays.sort(vector2);
        reverseArray(vector2);

        long minScalarProduct = 0;
        for (int i = 0; i < vector1.length; i++) {
            minScalarProduct += (long) vector1[i] * vector2[i];
        }

        return minScalarProduct;
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] vector1 = {1, 3, -5};
        int[] vector2 = {-2, 4, 1};
        System.out.println("Vector 1: " + Arrays.toString(vector1));
        System.out.println("Vector 2: " + Arrays.toString(vector2));

        long minScalarProduct = findMinimumScalarProduct(vector1, vector2);
        System.out.println("Minimum Scalar Product: " + minScalarProduct);
    }
}

