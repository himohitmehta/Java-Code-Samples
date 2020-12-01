package JavaCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Using a Comparator object with method sort
public class Sort2 {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        //create and display a list containing the suits array elements
        List<String> list = Arrays.asList(suits);//create list
        System.out.printf("Unsorted array elements: %s %n", list);
        //sort in descending order using a comparator
        list.sort(Collections.reverseOrder());
        System.out.printf("Sorted list elements: %s %n", list);
    }
}
