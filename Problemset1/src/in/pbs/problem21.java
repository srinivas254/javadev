package in.pbs;
import java.util.Scanner;

public class problem21 {
	
	public static int perfectNum(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int perfect = perfectNum(num);
		if(perfect==num) {
			System.out.println(num +" is a perfect number");
		}
		else {
			System.out.println(num +" is not a perfect number");
		}
	}
}
