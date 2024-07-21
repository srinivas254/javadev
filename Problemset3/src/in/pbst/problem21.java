package in.pbst;

import java.util.*;

public class problem21 {

    public static boolean isSubset(int[] superset, int[] subset) {   
        Set<Integer> set = new HashSet<>();
        
        for (int num : superset) {
            set.add(num);
        }
        
        for (int num : subset) {
            if (!set.contains(num)) {
                return false; 
            }
        }  
        return true; 
    }

    public static void main(String[] args) {
        int[] superset = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] subset = {2, 4, 6};
        System.out.println("Superset: " + Arrays.toString(superset));
        System.out.println("Subset: " + Arrays.toString(subset));

        boolean isSubset = isSubset(superset, subset);
        if (isSubset) {
            System.out.println("Subset is indeed a subset of Superset");
        } else {
            System.out.println("Subset is not a subset of Superset");
        }
    }
}

