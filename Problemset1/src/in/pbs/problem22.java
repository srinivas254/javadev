package in.pbs;
import java.util.Scanner;

public class problem22 {
	
	public static int perfectSquare(int num) {
		int result = num*num;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("The perfect square of the number " +num +" is " +perfectSquare(num)) ;
	}

}
