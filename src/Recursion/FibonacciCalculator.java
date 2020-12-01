package Recursion;

import java.math.BigInteger;

//Recursion fibonacci method
public class FibonacciCalculator {
    private static BigInteger TWO = BigInteger.valueOf(2);

    //recursive declaration of method fibonacci
    public static BigInteger fibonacci(BigInteger number) {
        if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)) { //base case
            return number;
        } else {
            return fibonacci(number.subtract(BigInteger.ONE)).add(fibonacci(number.subtract(TWO)));
        }
    }

    public static void main(String[] args) {
        //displays the fibonacci values from 0 - 40
        for (int i = 0; i <= 40; i++) {
            System.out.printf("Fibonacci of %d is: %d%n", i, fibonacci(BigInteger.valueOf(i)));
        }
    }
}
