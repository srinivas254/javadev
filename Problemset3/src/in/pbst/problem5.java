package in.pbst;

public class problem5 {
	public static int sumOfArray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = {2,5,3,12,8,11};
		System.out.println("The sum of the array is : "+sumOfArray(arr));
	}
}
