package in.pbst;
import java.util.Scanner;
import java.io.*;

public class problem1 {
	
	public static int gcd(int num1,int num2) {
		int result = Math.min(num1, num2);
		while(result>1) {
			if(num1%result==0 && num2%result==0) {
				break;
			}
			result--;
		}
		return result;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		System.out.println("The gcd of "+num1+" and "+num2+" is "+gcd(num1,num2));
	}

}
