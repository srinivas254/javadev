package in.pbst;
import java.util.Scanner;

public class problem3and4 {
	
	public static int pow(int power) {
		int base = 2;
		int res = 1;
		while(power>0) {
			res *= base;
			power--;
		}
		return res;
	}
	
	public static int binToDec(int num) {
		int count=0;
		int result = 0;
		while(num>0) {
			int rem = num%10;
			if(rem==1) {
			  result += pow(count);
			}
			num=num/10;
			count++;
		}
		return result;
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Binary number : ");
	int num = sc.nextInt();
	System.out.println("The Decimal equivalent is "+binToDec(num));
	}

}
