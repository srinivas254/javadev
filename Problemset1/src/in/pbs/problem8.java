package in.pbs;
import java.util.Scanner;

public class problem8 {
	
	public static void isPrime(int num) {
		boolean flag = false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag = true;
			}
		}
		if(!flag) {
			System.out.println(num +" is a prime number");
		}
		else if(num==2 || num==3) {
			System.out.println(num +"is a prime number");
		}
		else {
			System.out.println(num +"is not a prime number");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		isPrime(num);

	}

}
