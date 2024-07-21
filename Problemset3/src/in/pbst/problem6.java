package in.pbst;

import java.util.Arrays;

public class problem6 {
	public static int[] reverseOfArray(int[] arr) {
		int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
	}

	public static void main(String[] args) {
		int [] arr = {6,5,4,3,2,1};
		System.out.println("The reverse of an array is : "+Arrays.toString(reverseOfArray(arr)));
	}

}
