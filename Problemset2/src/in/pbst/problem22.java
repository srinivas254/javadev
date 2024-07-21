package in.pbst;
import java.util.Scanner;

public class problem22 {
	
	public static boolean isleap(int year) {
		boolean leap=false;
		if(year%400==0) {
			leap = true;
		}
		else if(year%100==0) {
			leap = false;
		}
		else if(year%4==0) {
			leap = true;
		}
		else {
			leap = false;
		}
		return leap;
	}
	
	public static int daysOfMonth(int month,int year) {
		int days=0;
		if(month<=7) {
			if(month==2) {
				if(isleap(year)==true) {
					days = 29;
				}
				else {
					days = 28;
				}
			}
			else if (month%2==1) {
				days = 31;
			}
			else {
				days = 30;
			}
		}
		else if(month>7) {
			if(month%2==0) {
				days = 31;
			}
			else {
				days = 30;
			}
		}
		return days;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		System.out.println("Enter the month number : ");
		int month = sc.nextInt();
		System.out.println("The number of days in month "+ month +" is "+ daysOfMonth(month,year));
		
	}

}
