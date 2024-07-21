package in.pbst;
import java.util.Scanner;

public class problem11 {
		
	public static int pow(int power) {
		int base = 8;
		int res = 1;
		while(power>0) {
			res *= base;
			power--;
		}
		return res;
	}
	
	public static int octToDec(int num) {
		int count=0;
		int result=0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			result += rem*pow(count);
			count++;
		}
		return result;
	}
	
	public static StringBuffer decToBin(int dec) {
		StringBuffer sb = new StringBuffer();
		while(dec>0) {
			int rem = dec%2;
			dec = dec/2;
			sb.insert(0,rem);
		}
		return sb;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the octal number : ");
		int num = sc.nextInt();
		int dec = octToDec(num);
		System.out.println("The binary equivalent is "+decToBin(dec));
	}

}
