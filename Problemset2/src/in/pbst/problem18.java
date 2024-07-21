package in.pbst;
import java.util.Scanner;

public class problem18 {
	
	public static double areaOfCircle(double rad) {
		double area = Math.PI*rad*rad;
		 area = area*100;
		 area = Math.round(area);
		 area = area/100;
		 return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		double rad = sc.nextDouble();
		System.out.println(areaOfCircle(rad)+" units");

	}

}
