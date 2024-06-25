package in.pbs;
import java.util.Scanner;

public class problem11 {
	
	public static void numRev(int num) {
		int res = 0;
		while(num>=1) {
			int rem = num%10;
			num = num/10;
			res = res*10 + rem;
		}
		System.out.println("The reverse of the number is " +res);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		numRev(num);
	}

}
