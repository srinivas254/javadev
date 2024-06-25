package in.pbs;
import java.util.Scanner;

public class problem2 {
	
	public static void evenOrOdd(int num) {
		if(num%2==0) {
			System.out.println("It's an even number");
		}
		else {
			System.out.println("It's an odd number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		evenOrOdd(num);
	}

}
