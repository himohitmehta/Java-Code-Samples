package GenericClassesAndMethods;

import java.util.ArrayList;
import java.util.List;

//WildcardTest program
public class WildcardTest {
    public static void main(String[] args) {
        //create, initialize and output List of Integers, then display total of the elements
        Integer[] integers = {1, 2, 3, 4, 5};
        List<Integer> integerList = new ArrayList<>();
        //insert elements in integerList
        for (Integer element : integers) {
            integerList.add(element);
        }
        System.out.printf("integerList contains: %s%n", integerList);
        System.out.printf("Total of the elements in the integerList: %.0f%n%n", sum(integerList));
        //create, initialize and output List of Doubles, then display total of the elements
        Double[] doubles = {2.3, 5.5, 64.54};
        List<Double> doubleList = new ArrayList<>();
        //insert elements in doubleList
        for (Double element : doubles) {
            doubleList.add(element);
        }
        System.out.printf("doubleList contains: %s%n", doubleList);
        System.out.printf("Total of the elements in doubleList: %.1f%n%n", sum(doubleList));
        //create, initialize and output List of Numbers containing both Integers and Doubles, then display total of the elements
        Number[] numbers = {1, 2.7, 1.7, 6.2, 17, 62};//Integers and Doubles
        List<Number> numberList = new ArrayList<>();
        //insert elements in numberList
        for (Number element : numbers) {
            numberList.add(element);
        }
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
