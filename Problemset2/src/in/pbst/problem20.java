package in.pbst;
import java.util.Scanner;

public class problem20 {
	
	public static int digitCount(int num) {
		int count=0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			count++;
		}
		return count;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println(digitCount(num));
	}

}
