package in.pbst;
import java.util.Scanner;

public class problem5 {
	
	public static int pow(int power) {
		int Base = 8;
		int res = 1;
		while(power>0) {
			res *= Base;
			power--;
		}
		return res;
	}
	
	public static int decimal(int num) {
		int cnt=0;
		int sum=0;
		while(num>=1) {
			int rem = num%10;
			num = num/10;
			int prod = rem * pow(cnt);
			cnt++;
			sum += prod;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an octal number : ");
		int num = sc.nextInt();
		System.out.println("The decimal equivalent is "+decimal(num));
	}

}
