package in.pbs;
import java.util.Scanner;

public class problem12 {
	
	public static int reverse(int num) {
		int res = 0;
		while(num>=1) {
			int rem = num%10;
			num = num/10;
			res = res*10 + rem;
		}
		return res;
	}
	
	public static void palindrome(int num,int res) {
		if(num==res) {
			System.out.println(num +" is a palindrome number");
		}
		else {
			System.out.println(num +" is not a palindrome number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int res = reverse(num);
		palindrome(num,res);
	}

}
