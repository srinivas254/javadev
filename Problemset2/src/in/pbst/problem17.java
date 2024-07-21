package in.pbst;
import java.util.Scanner;

public class problem17 {

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean canExpressAsSumOfTwoPrimes(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.printf("%d = %d + %d\n", n, i, n - i);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a number : ");
    	int n = sc.nextInt();
        if (canExpressAsSumOfTwoPrimes(n)) {
            System.out.printf("%d can be expressed as the sum of two prime numbers.\n", n);
        } else {
            System.out.printf("%d cannot be expressed as the sum of two prime numbers.\n", n);
        }
    }
}
