package in.pbst;
import java.util.Scanner;

public class problem2 {
	public static int lcm(int num1,int num2) {
		int prod=1;
		int i=2;
		int res = Math.min(num1, num2);
		while(i<=res) {
			if(num1%i==0 && num2%i==0) {
				num1/=i;
				num2/=i;
				prod*= i;
			}
			if(num1%i!=0 || num2%i!=0) {
				i++;
			}
		}
		prod*=num1*num2;
		return prod;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		System.out.println("LCM of "+num1+" and "+num2+" is "+lcm(num1,num2));
	}

}
