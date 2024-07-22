package in.pbst;

import java.util.Arrays;

public class problem24 {

    public static int findMinDifference(int[] chocolates, int m) {
        if (chocolates == null || chocolates.length == 0 || m <= 0) {
            return 0;
        }

        Arrays.sort(chocolates);

        int n = chocolates.length;
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < n; i++) {
            int currentDifference = chocolates[i + m - 1] - chocolates[i];
            if (currentDifference < minDifference) {
                minDifference = currentDifference;
            }
        }
        return minDifference;
    }

    public static void main(String[] args) {
        int[] chocolates = {7, 3, 2, 4, 9, 12, 56};
        int m = 3; 

        int minDifference = findMinDifference(chocolates, m);
        System.out.println("Minimum difference in chocolates distribution: " + minDifference);
    }
}

