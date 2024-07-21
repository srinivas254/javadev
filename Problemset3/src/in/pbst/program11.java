package in.pbst;

import java.util.Arrays;

public class program11 {

    public static String findLongestPalindrome(String[] arr) {
        String longestPalindrome = "";
        int maxLength = 0;

        for (String str : arr) {
            if (isPalindrome(str)) {
                if (str.length() > maxLength) {
                    maxLength = str.length();
                    longestPalindrome = str;
                }
            }
        }

        return longestPalindrome;
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] array = {"madam", "racecar", "hello", "level", "radar"};
        System.out.println("Original array: " + Arrays.toString(array));
        String longestPalindrome = findLongestPalindrome(array);
        System.out.println("Longest palindrome in the array: " + longestPalindrome);
    }
}

