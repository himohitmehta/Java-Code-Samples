package JavaCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {
    public static void main(String[] args) {
        //create and display a List<Character>
        Character[] letters = {'P', 'C', 'M'};
        List<Character> list = Arrays.asList(letters);//get List
        System.out.println("list contains");
        output(list);
        //reverse and display the List<Character>
        Collections.reverse(list);//reverse order the elements
        System.out.printf("%n After calling reverse, list contains: %n");
        output(list);
        //create copyList from an array of 3 Characters
        Character[] lettersCopy = new Character[3];
        List<Character> copyList = Arrays.asList(lettersCopy);
        //copy the contents of list into CopyList
        Collections.copy(copyList, list);
        System.out.printf("%n After Copying, copyList contains:%n");
        output(copyList);
        //fill list with Rs
        Collections.fill(list, 'R');
        System.out.printf("%nAfter Calling fil, list contains:%n");
        output(list);
    }

    private static void output(List<Character> list) {
        System.out.println("The list is: ");
        for (Character element : list) {
            System.out.printf("%s ", element);
        }
        System.out.printf("%n Max: %s ", Collections.max(list));
        System.out.printf("Min: %s %n", Collections.min(list));
    }
}
