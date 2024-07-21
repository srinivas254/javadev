package in.pbst;

public class problem4 {
	    public static int findSecondSmallest(int[] arr) {
	        int smallest = Integer.MAX_VALUE;
	        int secondSmallest = Integer.MAX_VALUE;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] < smallest) {
	                secondSmallest = smallest;
	                smallest = arr[i];
	            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
	                secondSmallest = arr[i];
	            }
	        }
	        return secondSmallest;
	    }

	    public static void main(String[] args) {
	        int[] array = {5, 3, 8, 1, 6};
	        int secondSmallest = findSecondSmallest(array);
	        System.out.println("Second smallest element in the array: " + secondSmallest);
	    }
	}

