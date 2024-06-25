package in.pbs;
import java.util.Scanner;
public class problem1 {
	
	public static void signCheck(int num) {
		if (num>0) {
			System.out.println("It's a positive number");
		}
		else if (num<0){
			System.out.println("It's a negative number");
		}
		else {
			System.out.println("It's neither positive nor negative number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		signCheck(num);
	}

}
