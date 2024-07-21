package in.pbst;
import java.util.Scanner;

public class problem16 {
	
	public static int replace0rev(int num) {
		int result=0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			if(rem==0) {
				rem=1;
			}
			result = result*10 + rem;
		}
		return result;
	}
	
	public static int digitCount(int revnum) {
		int count=0;
		while(revnum>0) {
			int rem = revnum%10;
			revnum = revnum/10;
			count++;
		}
		return count;
	}
	
	public static int pow(int power) {
		int res=1;
		int base=10;
		while(power>0) {
			res *= base;
			power--;
		}
		return res;
	}
	
	public static int replace0(int revnum) {
		int count = digitCount(revnum)-1;
		int result=0;
		while(count>=0 && revnum>0) {
			int rem = revnum%10;
			revnum = revnum/10;
			result += rem*pow(count);
			count--;
		}
		return result;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int revnum = replace0rev(num);
	    System.out.println(replace0(revnum));

	}

}
