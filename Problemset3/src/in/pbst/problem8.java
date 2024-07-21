package in.pbst;

import java.util.Arrays;

public class problem8 {
	public static int[] sortArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				  int temp = arr[i];
				  arr[i] = arr[j];
				  arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {3,5,8,2,6,4,7,1};
		System.out.println("The sorted array is : "+ Arrays.toString(sortArray(arr)));
	}

}
