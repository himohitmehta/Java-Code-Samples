package Recursion;

import java.math.BigInteger;

public class FactorialCalculator2 {
    //recursive method factorial (assumes its parameter is >= 0)
    public static BigInteger factorial(BigInteger number) {
        if (number.compareTo(BigInteger.ONE) <= 0) {//test base case
            return BigInteger.ONE;//base cases:0! = 1 and 1! = 1
        } else {
            return number.multiply(factorial(number.subtract(BigInteger.ONE)));
        }
    }

    public static void main(String[] args) {
        //calculate the factorials of 0 through 50
        for (int i = 0; i <= 50; i++) {
            System.out.printf("%d! = %d%n", i, factorial(BigInteger.valueOf(i)));
        }
    }
}
