package in.pbs;
import java.util.Scanner;

public class problem17 {
	public static int fact(int num) {
		int res=1;
		if(num==0) {
			res=1;
			return res;
		}
		while(num>=1) {
			res *= num;
			num--;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("The factorial of the number " +num +" is "+fact(num));
	}

}
