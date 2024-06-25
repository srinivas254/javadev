package in.pbs;
import java.util.Scanner;

public class problem24 {
	
	public static int Abundant(int num) {
		int sum = 0;
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
		int sum = Abundant(num);
		if(sum>num) {
			System.out.println(num+ " is an Abundant Number");
		}
		else {
			System.out.println(num+ " is not an Abundant Number");
		}

	}

}
