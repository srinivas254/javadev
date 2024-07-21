package in.pbst;
import java.util.Scanner;

public class problem9 {
	
	public static StringBuffer decToHexa(int num) {
		StringBuffer str = new StringBuffer();
		char ch;
		while(num/16>0) {
			int rem = num%16;
			num = num/16;
			if(rem==10) {
				ch = 'A';
			}
			else if(rem==11) {
				ch = 'B';
			}
			else if(rem==12) {
				ch = 'C';
			}
			else if (rem==13) {
				ch = 'D';
			}
			else if(rem==14) {
				ch = 'E';
			}
			else if(rem==15) {
				ch = 'F';
			}
			else {
				ch = (char) (rem+48);
				
			}
			str.insert(0,ch);
		}
		str.insert(0,num);
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number : ");
		int num=sc.nextInt();
		System.out.println("The hexasecimal equivalent is "+decToHexa(num));
	}

}
