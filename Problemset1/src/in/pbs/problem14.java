package in.pbs;
import java.util.Scanner;

public class problem14 {
	
	public static int  digitCount(int num) {
		int count = 0;
		while(num>=1) {
			int rem = num%10;
			num = num/10;
			count++;
		}
		return count;
	}
	
	public static int power(int pow,int rem) {
		int res = 1;
		while(pow>0) {
			res *= rem;
			pow--;
		}
		return res;
	}
	
	public static int armstrong(int num,int pow) {
		int sum = 0;
		while(num>=1) {
			int rem = num%10;
			num = num/10;
			sum += power(pow,rem);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range : ");
		int start = sc.nextInt();
		System.out.println("Enter the ending range : ");
		int end = sc.nextInt();
		for(int num=start;num<=end;num++) {
		int pow = digitCount(num);
		int sum = armstrong(num,pow);
		if(sum==num) {
			System.out.print(num+", ");
		}
		}
		System.out.println();
 }

}
