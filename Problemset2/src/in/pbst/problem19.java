package in.pbst;
import java.util.Scanner;

public class problem19 {
	
	public static void isPrime(int start,int end) {
		for(int i=start;i<=end;i++) {
			boolean flag = false;
			if(i==1) {
				continue;
			}
			for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start point : ");
		int start = sc.nextInt();
		System.out.println("Enter the end point : ");
		int end = sc.nextInt();
		isPrime(start,end);

	}

}
