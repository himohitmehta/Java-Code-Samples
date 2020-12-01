package JavaCollections;

import java.util.*;

//demonstrates ArrayList
public class CollectionTest {
    public static void main(String[] args) {
        //add elements in colors array to list
        String[] colors = {"Magenta", "Blue", "Red", "Yellow"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));
        //add elements in remove colors array to remove list
        String[] removeColors = {"Red", "white", "Blue"};
        List<String> removeList = new ArrayList<>(Arrays.asList(removeColors));
        //output list contents
        System.out.println("ArrayList:");
        for (String s : list) {
            System.out.printf("%s ", s);
        }
        //remove from list the colors contained in removeList
        removeColors(list, removeList);
        //output list contents
        System.out.printf("%n%nArrayList after calling removeColors: %n");
        for (String color : list) {
            System.out.printf("%s ", color);
        }
    }

    //removeColors specified in collection2 from collection1
    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
        //get iterator
        //loop while collection has items
        //remove current element
        collection1.removeIf(collection2::contains);
    }
}
