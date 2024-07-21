package in.pbst;
import java.util.Scanner;

public class problem15 {
	
	public static String fracadd(int num1,int den1,int num2,int den2) {
		int numerator = (num1*den2)+(num2*den1);
		int denominator = (den1*den2);
		int Min = Math.min(numerator, denominator);
		int i=2;
		 while(i<=Min){
			if(numerator%i==0 && denominator%i==0) {
				numerator /= i;
				denominator /= i;
			}
			if(numerator%i!=0 || denominator%i!=0) {
				i++;
			}
		}
		return numerator+"/"+denominator;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator of first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the denominator of first number : ");
		int den1 = sc.nextInt();
		System.out.println("Enter the numerator of second number : ");
		int num2 = sc.nextInt();
		System.out.println("Enter the denominator of second number : ");
		int den2 = sc.nextInt();
		System.out.println(fracadd(num1,den1,num2,den2));

	}

}
