package in.pbst;

import java.util.Arrays;

public class problem24 {

    public static int[] leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int[] rotatedArr = new int[n];

        for (int i = 0; i < n; i++) {
            rotatedArr[(i + n - d) % n] = arr[i];
        }
        return rotatedArr;
    }
    
        public static int[] rightRotate(int[] arr, int d) {
            int n = arr.length;
            d = d % n; 
            int[] rotatedArr = new int[n];
            for (int i = 0; i < n; i++) {
                rotatedArr[(i + d) % n] = arr[i];
            }
            return rotatedArr;
        }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 3;

        System.out.println("Original array: " + Arrays.toString(arr));
        int[] rotatedleftArr = leftRotate(arr, d);
        System.out.println("Left rotated array by " + d + " positions: " + Arrays.toString(rotatedleftArr));
        int[] rotatedrightArr = rightRotate(arr, d);
        System.out.println("Right rotated array by " + d + " positions: " + Arrays.toString(rotatedrightArr));
    }
}

