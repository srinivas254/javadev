package in.pbst;
import java.util.Scanner;

public class problem14 {
	
	public static int handshake(int n) {
		int result = (n*(n-1))/2;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of people : ");
		int n = sc.nextInt();
		System.out.println(handshake(n));
	}

}
