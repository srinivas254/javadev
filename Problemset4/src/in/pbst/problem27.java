package in.pbst;

public class problem27 {

    public static int minOperations(int[] array) {
        int n = array.length;
        int[][] dp = new int[n][n];

        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                if (array[i] == array[j]) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 4, 1};

        int minOps = minOperations(array);
        System.out.println("Minimum operations required to make the array palindrome: " + minOps);
    }
}

