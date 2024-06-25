package in.pbs;
import java.util.Scanner;

public class problem6 {
	
	public static void greatestOf3(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println(a +" is greater than "+ b +" and "+ c);
		}
		else if(b>a && b>c) {
			System.out.println(b +" is greater than "+ a +" and "+ c);
		}
		else if(c>a && c>b) {
			System.out.println(c +" is greater than "+ a +" and "+ b);
		}
		else {
			System.out.println("All 3 numbers are equal");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		System.out.println("Enter the third number : ");
		int c = sc.nextInt();
		
		greatestOf3(a,b,c);
	}

}
