package in.pbst;
import java.util.Scanner;

public class problem7 {
	
	public static int pow(int power) {
		int base=10;
		int res=1;
		while(power>0) {
		   res *= base;
		   power--;
		}
		return res;
	}
	
	public static int decToBin(int num) {
		int count=0;
		int result=0;
		while(num>0) {
			int res = num%2;
			num=num/2;
			if(res==0) {
				result += 0;
				count++;
			}
			else {
				result += pow(count);
				count++;
			}
		}
		return result;	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Decimal number : ");
		int num = sc.nextInt();
		System.out.println("The Binary equivalent is " +decToBin(num));
	}

}
