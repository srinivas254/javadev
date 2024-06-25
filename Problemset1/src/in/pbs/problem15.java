package in.pbs;
import java.util.Scanner;

public class problem15 {
	
	public static int fib(int i) {
		int res=0;
		if(i<2) {
			res=i;
		}
		else {
			res = fib(i-2)+fib(i-1);
		}
		return res;
	}
	
	public static void fibonacci(int num) {
		for(int i=1;i<=num;i++) {
			int res = fib(i-1);
			System.out.print(res+ " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int num = sc.nextInt();
		fibonacci(num);
	}

}
