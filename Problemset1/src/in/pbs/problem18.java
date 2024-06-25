package in.pbs;
import java.util.Scanner;

public class problem18 {
	
	public static int pow(int base,int power) {
		int res=1;
		while(power>0) {
			res *= base;
			power--;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Base : ");
		int base = sc.nextInt();
		System.out.println("Enter the power : ");
		int power = sc.nextInt();
		System.out.println(base +" to the power of "+power +" is "+ pow(base,power));
	}
}
