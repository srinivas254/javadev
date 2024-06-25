package in.pbs;
import java.util.Scanner;

public class problem4 {
	
	public static void greatest(int a,int b) {
		if(a>b) {
			System.out.println(a +" is greater than "+ b);
		}
		else if(b>a) {
			System.out.println(b +" is greater than "+ a);
		}
		else {
			System.out.println("Both the numbers are equal");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		greatest(a,b);

	}

}
