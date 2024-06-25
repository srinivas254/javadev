package in.pbs;
import java.util.Scanner;

public class problem5 {
	
	public static void sumOfInterval(int start,int end) {
		int sum = 0;
		for(int i=start;i<=end;i++) {
			sum += start;
			start++;
		}
		System.out.println("Sum = "+sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start of the interval :");
		int start = sc.nextInt();
		System.out.println("Enter the end of the interval including that number :");
		int end = sc.nextInt();
		sumOfInterval(start,end);

	}

}
