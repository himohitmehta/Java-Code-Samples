package CustomGenericDataStructures;

import java.util.NoSuchElementException;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        //use enqueue method
        queue.enqueue(-1);
        queue.print();
        queue.enqueue(5);
        queue.print();
        queue.enqueue(34);
        queue.print();
        //remove objects from queue
        boolean continueLoop = true;
        while (continueLoop) {
            try {
                int removedItem = queue.dequeue();
                System.out.printf("%n%d dequeued%n", removedItem);
                queue.print();
            } catch (NoSuchElementException noSuchElementException) {
                continueLoop = false;
                noSuchElementException.printStackTrace();
            }
        }
    }
}
