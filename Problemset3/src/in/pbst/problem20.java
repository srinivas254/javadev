package in.pbst;

import java.util.*;

public class problem20 {

    public static boolean areDisjoint(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : arr1) {
            set.add(num);
        }
        
        for (int num : arr2) {
            if (set.contains(num)) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8};
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

        boolean disjoint = areDisjoint(arr1, arr2);
        if (disjoint) {
            System.out.println("Arrays are disjoint");
        } else {
            System.out.println("Arrays are not disjoint");
        }
    }
}
