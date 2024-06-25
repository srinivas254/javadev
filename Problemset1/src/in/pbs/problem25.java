package in.pbs;
import java.util.Scanner;

public class problem25 {
	
	public static int SumofDiv(float num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void friendlyPair(float num1,float num2) {
		int sum1 = SumofDiv(num1);
		int sum2 = SumofDiv(num2);
		float ratio1 = sum1/num1;
		float ratio2 = sum2/num2;
		if(ratio1==ratio2) {
			System.out.println((int)num1+ " and " +(int)num2 +" are friendly pairs");
		}
		else {
			System.out.println((int)num1+ " and " +(int)num2 +" are not friendly pairs");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		float num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		float num2 = sc.nextInt();
		friendlyPair(num1,num2);
	}

}
