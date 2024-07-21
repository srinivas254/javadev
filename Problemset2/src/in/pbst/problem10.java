package in.pbst;
import java.util.Scanner;

public class problem10 {
	
	public static int pow(int power) {
		int base = 2;
		int res = 1;
		while(power>1) {
			res *= base;
			power--;
		}
		return res;
	}
	
	public static int pow1(int power) {
		int base = 10;
		int res = 1;
		while(power>0) {
			res *= base;
			power--;
		}
		return res;
	}
	
	public static int binToOct(int num) {
		int count=0;
		int result = 0;
		
		while(num>0) {
			count++;
			int rem = num%10;
			num = num/10;
			if(rem==0) {
				result += 0;
			}
			else if(rem==1) {
				result += pow(count);
			}
		}
		
		int octal = 0;
		int cnt=0;
		int res = 0;
		
		while(result/8>0) {
			int rem = result%8;
			result = result/8;
			res = rem * pow1(cnt) + res;
			cnt++;
		}
		
		octal = result * pow1(cnt) + res;
		return octal;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Binary number : ");
		int num = sc.nextInt();
		System.out.println("The octal equivalent is "+binToOct(num));
	}

}
