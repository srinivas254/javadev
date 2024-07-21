package in.pbst;
import java.util.Arrays;

public class problem1 {

    public static int findLargest(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {5, 7, 2, 8, 4, 10};
        int largest = findLargest(array);
        System.out.println("Largest element in the array: " + largest);
    }
}

