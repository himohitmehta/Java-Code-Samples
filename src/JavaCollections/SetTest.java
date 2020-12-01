package JavaCollections;

import java.util.*;

//HashSet used to remove duplicate values from array of strings
public class SetTest {
    public static void main(String[] args) {
        //create and display a List<String>
        String[] colors = {"red", "white", "blue", "green", "gray", "orange", "white"};
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s%n", list);
        //eliminate duplicates then print the unique values
        printNonDuplicates(list);
    }

    //create a Set from Collection to eliminate duplicates
    private static void printNonDuplicates(Collection<String> values) {
        //create a HashSet
        Set<String> set = new HashSet<>(values);
        System.out.printf("%n Non duplicates are:");
        for (String value : set) {
            System.out.printf("%s ", value);
        }
        System.out.println();
    }
}
