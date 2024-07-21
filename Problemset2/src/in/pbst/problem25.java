package in.pbst;
import java.util.Scanner;

public class problem25 {
	public static void quadratic(int a,int b,int c) {
		double det = 0;
		int res = b*b-4*a*c;
		boolean iota = false;
		if(res<0) {
			res = res * -1;
			iota = true;
		}
		det = Math.sqrt(res);
		det = det*100;
		det = Math.round(det);
		det = det/100;
		double fr = (double) -b/(2*a);
		double lr = det/(2*a);
		if(iota==false) {
			double r1 = fr + lr;
			double r2 = fr - lr;
			System.out.println("The roots are "+ r1 +" and "+ r2);
		}
		else {
			System.out.println("The roots are "+ fr +"+("+ lr +"i) and"+ fr +"-("+ lr +"i)");
		}
	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the coefficient a : ");
		int a = sc.nextInt();
		System.out.println("Enter the coefficient b : ");
		int b = sc.nextInt();
		System.out.println("Enter the coefficient c : ");
		int c = sc.nextInt();
		quadratic(a,b,c);
	}

}
