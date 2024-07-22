package in.pbst;

import java.util.ArrayList;

public class problem4 {

    public static void findUnion(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                System.out.print(arr2[j] + " ");
                i++;
                j++;
            }
        }
        while (i < m) {
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < n) {
            System.out.print(arr2[j] + " ");
            j++;
        }
    }
    
        public static void findIntersection(int[] arr1, int[] arr2) {
            int m = arr1.length;
            int n = arr2.length;
            int i = 0, j = 0;
            ArrayList<Integer> intersection = new ArrayList<>();

            while (i < m && j < n) {
                if (arr1[i] < arr2[j]) {
                    i++;
                } else if (arr2[j] < arr1[i]) {
                    j++;
                } else {
                    intersection.add(arr1[i]);
                    i++;
                    j++;
                }
            }

            for (int num : intersection) {
                System.out.print(num + " ");
            }
        }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};

        System.out.println("Union of two arrays:");
        findUnion(arr1, arr2);
        
        System.out.println("\nIntersection of two arrays:");
        findIntersection(arr1, arr2);
    }
}
