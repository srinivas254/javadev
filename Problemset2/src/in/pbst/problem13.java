package in.pbst;
import java.util.Scanner;

public class problem13 {
	
	public static int fact(int num) {
		int res=1;
		while(num>0) {
			res *= num;
			num--;
		}
		return res;
	}
	
	public static int perm(int n,int r) {
		int top = fact(n);
		int bottom = fact(n-r);
		int result = top/bottom;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of persons : ");
		int n = sc.nextInt();
		System.out.println("Enter the number of seats : ");
		int r = sc.nextInt();
		System.out.println("The number of Permutations in which "+n+" people can occupy "+r+" seats in a classroom is "+perm(n,r));
		
	}

}
