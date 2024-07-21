package in.pbst;

public class problem3 {
	 public static int findSmallest(int[] arr) {
	        int min = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        return min;
	    }
	 
	 public static int findLargest(int[] arr) {
	        int max = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	    }
	 
	 public static void main(String[] args) {
	        int[] array = {5, 7, 2, 8, 4, 10};
	        int Smallest = findSmallest(array);
	        System.out.println("Smallest element in the array: " + Smallest);
	        int largest = findLargest(array);
	        System.out.println("Largest element in the array: " + largest);
	 }

}
