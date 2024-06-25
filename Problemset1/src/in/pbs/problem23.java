package in.pbs;
import java.util.Scanner;

public class problem23 {
	
	public static int Harshad(int num) {
		int sum = 0;
		while(num>=1) {
			int rem = num%10;
			num = num/10;
			sum += rem;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int sum = Harshad(num);
		if(num%sum==0) {
			System.out.println(num+ " is a Harshad number");
		}
		else {
			System.out.println(num+ " is not a Harshad number");
		}

	}

}
