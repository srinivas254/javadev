package in.pbst;
import java.util.Scanner;

public class problem12 {
	
	public static void coord(int x,int y) {
		if(x>0 && y==0) {
			System.out.println("1 & 4");
		}
		else if(x<0 && y==0) {
			System.out.println("2 & 3");
		}
		else if(x==0 && y>0) {
			System.out.println("1 & 2");
		}
		else if(x==0 && y<0) {
			System.out.println("3 & 4");
		}
		else if(x>0 && y>0) {
			System.out.println("1");
		}
		else if(x<0 && y>0) {
			System.out.println("2");
		}
		else if(x<0 && y<0) {
			System.out.println("3");
		}
		else if(x>0 && y<0) {
			System.out.println("4");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x co-ordinate : ");
		int x = sc.nextInt();
		System.out.println("Enter the y co-ordinate : ");
		int y = sc.nextInt();
		coord(x,y);
	}

}
