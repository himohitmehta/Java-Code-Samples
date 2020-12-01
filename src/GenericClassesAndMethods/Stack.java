package GenericClassesAndMethods;

import java.util.ArrayList;
import java.util.NoSuchElementException;

//Stack generic class declaration
public class Stack<E> {
    private final ArrayList<E> elements;//ArrayList stores stack elements

    //no-argument constructor creates a stack of default size
    public Stack() {
        this(10);//default stack size
    }

    //constructor creates a stack of the specified number of elements
    public Stack(int capacity) {
        int initCapacity = capacity > 0 ? capacity : 10;//validate
        elements = new ArrayList<>(initCapacity);//create ArrayList
    }

    //push element onto stack
    public void push(E pushValue) {
        elements.add(pushValue);//place push value on stack
    }

    //return the top element if not empty; else throw exception
    public E pop() {
        if (elements.isEmpty()) {
            //if stack is empty
            throw new NoSuchElementException("Stack is empty, cannot pop");
        }
        //remove and return top element of stack
        return elements.remove(elements.size() - 1);
    }
}
