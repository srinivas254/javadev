package in.pbs;
import java.util.Scanner;

public class problem9 {
	
	public static void isPrime(int start,int end) {
		for(int i=start;i<=end;i++) {
			boolean flag = false;
			if(i==2 || i==3) {
				System.out.println(i +" is Prime");
			}
			for(int num=2;num<=i/2;num++) {
				if(i%num==0) {
					flag = true;
					break;
				}
			}
			if(!flag && i>3) {
				System.out.println(i +" is Prime");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start of the interval :");
		int start = sc.nextInt();
		System.out.println("Enter the end of the interval :");
		int end = sc.nextInt();
		
		isPrime(start,end);
	}

}
