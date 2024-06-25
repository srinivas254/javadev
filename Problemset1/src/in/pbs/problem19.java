package in.pbs;
import java.util.Scanner;

public class problem19 {
	public static void factor(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("are the factors of the number "+num);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		factor(num);

	}

}
