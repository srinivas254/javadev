package in.pbst;

import java.util.*;

public class problem18 {

    public static void findSymmetricPairs(int[][] pairs) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] pair : pairs) {
            int first = pair[0];
            int second = pair[1];

            if (map.containsKey(second) && map.get(second) == first) {
                System.out.println("Symmetric pair found: (" + first + ", " + second + ")");
            } else {
                map.put(first, second);
            }
        }
    }

    public static void main(String[] args) {
        int[][] pairs = {
            {1, 2},
            {2, 1},
            {3, 4},
            {5, 6},
            {6, 5},
            {7, 8},
            {8, 7}
        };

        System.out.println("Pairs array:");
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
        findSymmetricPairs(pairs);
    }
}

