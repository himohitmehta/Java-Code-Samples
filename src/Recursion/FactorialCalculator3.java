package Recursion;

//Iterative factorial method
public class FactorialCalculator3 {
    //iterative declaration of method factorial
    public static long factorial(long number) {
        long result = 1;
        //iteratively calculate factorial
        for (long i = number; i >= 1; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        //calculate the factorials of 0 through 10
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d! = %d%n", i, factorial(i));
        }
    }
}
