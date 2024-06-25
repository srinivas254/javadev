package in.pbs;
import java.util.Scanner;

public class problem3 {
	
	public static void sumOfNatural(int n) {
		int sum = 0;
		sum = (n*(n+1))/2;
		System.out.println("Sum = "+sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt();
		sumOfNatural(n);
	}

}
