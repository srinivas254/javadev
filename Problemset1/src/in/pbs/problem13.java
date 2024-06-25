package in.pbs;
import java.util.Scanner;

public class problem13 {
	
	static int count = 0;
	static int Base = 1;
	
	public static int numCount(int num) {
		while(num>=1) {
		int rem = num%10;
		num = num/10;
		count++;
		}
		return count;
	}
	
	public static int numPower(int Base,int cnt) {
		int res = 1;
		while(cnt>0) {
			res *= Base;
			cnt--;
		}
		return res;
	}
	
	public static int armstrong(int num,int cnt) {
		int sum = 0;
		while(num>=1) {
			int rem = num%10;
			num = num/10;
			sum += numPower(rem,cnt);
		}
		return sum;
	}
	
	public static void isarmStrong(int num,int result) {
		if(num==result) {
			System.out.println(num + " is a armstrong number");
		}
		else {
			System.out.println(num + " is not a armstrong number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int cnt = numCount(num);
		numPower(Base,cnt);
		int result = armstrong(num,cnt);
		isarmStrong(num,result);

	}

}
