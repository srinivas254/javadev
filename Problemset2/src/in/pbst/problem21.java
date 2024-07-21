package in.pbst;
import java.util.Scanner;

public class problem21 {

    private static final String[] units = {"", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private static final String[] tens = {"", "", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String convertNumberToWords(int number) {
        if(number > 999) {
        	return "Number too Large!";
        }
        
    	if (number == 0) {
            return "zero";
        }

        String words = "";

        if (number / 100 > 0) {
            words += units[number / 100] + " hundred ";
            number %= 100;
        }

        if (number > 0) {
            if (number < 20) {
                words += units[number];
            } else {
                words += tens[number / 10];
                if (number % 10 > 0) {
                    words += " " + units[number % 10];
                }
            }
        }
        
        return words.trim();
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a number : ");
        int number = sc.nextInt();
        System.out.println(number + " in words: " + convertNumberToWords(number));
    }
}

