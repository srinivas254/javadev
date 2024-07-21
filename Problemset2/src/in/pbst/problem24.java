package in.pbst;
import java.util.Scanner;

public class problem24 {
	public static int numOfDiv(int x,int n) {
		int cnt=0;
		for(int i=1;i<=n;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==x) {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : ");
		int n=sc.nextInt();
		System.out.println("Enter the number of divisors x : ");
		int x = sc.nextInt();
		System.out.println("The numbers of integers with exactly "+ x +" divisors from the range 1 to "+ n +" is "+ numOfDiv(x,n));
	}

}
