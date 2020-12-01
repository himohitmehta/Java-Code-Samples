package GenericClassesAndMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//WildcardTest program
public class WildcardTest {
    public static void main(String[] args) {
        //create, initialize and output List of Integers, then display total of the elements
        Integer[] integers = {1, 2, 3, 4, 5};
        //insert elements in integerList
        List<Integer> integerList = new ArrayList<>(Arrays.asList(integers));
        System.out.printf("integerList contains: %s%n", integerList);
        System.out.printf("Total of the elements in the integerList: %.0f%n%n", sum(integerList));
        //create, initialize and output List of Doubles, then display total of the elements
        Double[] doubles = {2.3, 5.5, 64.54};
        //insert elements in doubleList
        List<Double> doubleList = new ArrayList<>(Arrays.asList(doubles));
        System.out.printf("doubleList contains: %s%n", doubleList);
        System.out.printf("Total of the elements in doubleList: %.1f%n%n", sum(doubleList));
        //create, initialize and output List of Numbers containing both Integers and Doubles, then display total of the elements
        Number[] numbers = {1, 2.7, 1.7, 6.2, 17, 62};//Integers and Doubles
        //insert elements in numberList
        List<Number> numberList = new ArrayList<>(Arrays.asList(numbers));
        System.out.printf("numberList contains: %s%n", numberList);
        System.out.printf("Total of the elements in numberList: %.1f%n", sum(numberList));
    }

    //total the elements, using a wildcard in the List parameter
    public static double sum(List<? extends Number> list) {
        double total = 0;//initialize total
        //calculate sum
        for (Number element : list) {
            total += element.doubleValue();
        }
        return total;
    }
}
