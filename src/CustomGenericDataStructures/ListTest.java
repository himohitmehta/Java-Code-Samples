package CustomGenericDataStructures;
//ListTest class to demonstrate List capabilities

import java.util.NoSuchElementException;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new List<>();
        //insert integers in list
        list.insertAtFront(-1);
        list.print();
        list.insertAtFront(0);
        list.print();
        list.insertAtBack(1);
        list.print();
        list.insertAtBack(5);
        //remove objects from list; print after each removal
        try {
            int removedItem = list.removeFromFront();
            System.out.printf("%n%d removed%n", removedItem);
            list.print();
            removedItem = list.removeFromFront();
            System.out.printf("%n%d removed %n", removedItem);
            list.print();
            removedItem = list.removeFromBack();
            System.out.printf("%n%d removed%n", removedItem);
            list.print();
            removedItem = list.removeFromBack();
            System.out.printf("%n%d removed%n", removedItem);
            list.print();
        } catch (NoSuchElementException noSuchElementException) {
            noSuchElementException.printStackTrace();
        }
    }
}
