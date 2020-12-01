package JavaCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort1 {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        //create and display a list containing the suits array elements
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s %n", list);
        Collections.sort(list);
        System.out.printf("Sorted array elements: %s %n", list);
        //print list items separately
        for (String color : list) {
            System.out.printf("%s %n", color);
        }
    }
}
