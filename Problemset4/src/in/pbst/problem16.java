package in.pbst;

import java.math.BigInteger;

public class problem16 {

    public static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 50; 
        BigInteger result = factorial(n);
        System.out.println("Factorial of " + n + " is:");
        System.out.println(result);
    }
}

