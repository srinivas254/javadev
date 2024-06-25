package in.pbs;
import java.util.Scanner;

public class problem16 {
	
	public static int fib(int n) {
		int res=0;
		if(n<2) {
			res=n;
		}
		else {
			res = fib(n-2) + fib(n-1);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth term : ");
		int n = sc.nextInt();
		System.out.println("The " +n +"th term of fibonacci series is " +fib(n-1));

	}

}
