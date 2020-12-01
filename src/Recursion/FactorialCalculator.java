package Recursion;

//Recursive factorial method
public class FactorialCalculator {
    //recursive method factorial (assumes its parameter is >= 0)
    public static long factorial(long number) {
        if (number <= 1) { // test for base case
            return 1;//base cases:0! = 1 and 1! =1
        } else {
            //recursion step
            return number * factorial(number - 1);
        }
    }

    public static void main(String[] args) {
        //calculate the factorials of 0 through 21
        for (int i = 0; i <= 25; i++) {
            System.out.printf("%d! = %d%n", i, factorial(i));
        }
    }
}
