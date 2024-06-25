package in.pbs;
import java.util.Scanner;

public class problem7 {
	
	public static void isLeap(int year) {
		if(year%400==0) {
			System.out.println("Leap year");
		}
		else if(year%100==0) {
			System.out.println("Not a Leap year");
		}
		else if(year%4==0) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a Leap year");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year :");
		int year = sc.nextInt();
		isLeap(year);
	}

}
