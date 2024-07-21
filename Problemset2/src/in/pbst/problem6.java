package in.pbst;
import java.util.Scanner;

public class problem6 {
	static int value=0;
	
	public static int pow(int power) {
		int base = 16;
		int res = 1;
		while(power>0) {
			res *= base;
			power--;
		}
		return res;
	}
	
	public static int hexa(String str) {
		int sum=0;
		int count=0;
		for(int i=str.length()-1;i>=0;i--) {
			if((str.charAt(i)=='A')||(str.charAt(i)=='a')) {
				value=10;
			}
			else if((str.charAt(i)=='B')||(str.charAt(i)=='b')) {
				value=11;
			}
			else if((str.charAt(i)=='C')||(str.charAt(i)=='c')) {
				value=12;
			}
			else if((str.charAt(i)=='D')||(str.charAt(i)=='d')) {
				value=13;
			}
			else if((str.charAt(i)=='E')||(str.charAt(i)=='e')) {
				value=14;
			}
			else if((str.charAt(i)=='F')||(str.charAt(i)=='f')) {
				value=15;
			}
			else {
				value =(int) str.charAt(i) - 48;
			}
			sum += value*pow(count);
			count++;	
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Hexadecimal number : ");
		String str = sc.next();
		System.out.println("The decimal equivalent is "+hexa(str));
	}

}
