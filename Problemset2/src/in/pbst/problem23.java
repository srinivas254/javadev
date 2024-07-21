package in.pbst;
import java.util.Scanner;

public class problem23 {
	public static int digrepCount(int num,int x) {
		int count=0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			if(rem==x) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("Enter the digit x : ");
		int x = sc.nextInt();
		System.out.println("The count of the digit "+ x +" is "+digrepCount(num,x));
	}

}
