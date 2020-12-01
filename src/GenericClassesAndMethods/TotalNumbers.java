package GenericClassesAndMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Totalling the numbers in a List<Number>
public class TotalNumbers {
    public static void main(String[] args) {
        //create, initialize and output List of numbers containing both integers and doubles,
        //then display total of the elements
        Number[] numbers = {1, 2.4, 4, 5.5};//Integers and Doubles
        //place each number in numberList
        List<Number> numberList = new ArrayList<>(Arrays.asList(numbers));
        System.out.printf("numberList contains: %s%n", numberList);
        System.out.printf("Total of the elements in numberList: %.1f%n", sum(numberList));
    }

    //calculate total of List elements
    public static double sum(List<Number> list) {
        double total = 0;//initialize total
        //calculate sum
        for (Number element : list) {
            total += element.doubleValue();
        }
        return total;
    }
}
