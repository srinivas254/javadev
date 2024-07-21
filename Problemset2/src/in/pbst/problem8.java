package in.pbst;
import java.util.Scanner;

public class problem8 {
	
	public static int pow(int power) {
		int base=10;
		int res=1;
		while(power>0) {
			res *= base;
			power--;
		}
		return res;
	}
	public static int decToOct(int num) {
		int result=0;
		int count=0;
		while(num/8>=1) {
			int rem = num%8;
			num=num/8;
			result += rem*pow(count);
			count++;
		}
		result += num*pow(count);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Decimal number : ");
		int num = sc.nextInt();
		System.out.println("The octal equivalent is "+decToOct(num));
	}

}
