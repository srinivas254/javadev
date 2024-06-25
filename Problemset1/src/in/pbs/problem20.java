package in.pbs;
import java.util.Scanner;

public class problem20 {
	
	public static int factorial(int rem) {
		int res=1;
		while(rem>1) {
			res *= rem;
			rem--;
		}
		return res;
		
	}
	
	public static int digitSplit(int num) {
		int sum=0;
		while(num>=1) {
		int rem = num%10;
		num = num/10;
		int res = factorial(rem);
		sum += res;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int strong = digitSplit(num);
		if(strong==num) {
			System.out.println(num +" is a strong number");
		}
		else {
			System.out.println(num +" is not a strong number");
		}

	}

}
