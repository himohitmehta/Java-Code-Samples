package GenericClassesAndMethods;

import java.util.NoSuchElementException;

//Stack generic class test program
public class StackTest {
    public static void main(String[] args) {
        double[] doubleElements = {1.1, 2.2, 3.3, 5.5, 6.7};
        int[] integerElements = {1, 2, 3, 5, 7, 6, 8, 9};
        //create a Stack<Double> and a Stack<Integer>
        Stack<Double> doubleStack = new Stack<>(5);
        Stack<Integer> integerStack = new Stack<>();
        //push elements of double Elements onto double Stack
        testPushDouble(doubleStack, doubleElements);
        testPopDouble(doubleStack);//pop from double Stack
        //push elements of integer Elements onto integer Stack
        testPushInteger(integerStack, integerElements);
        testPopInteger(integerStack);
    }

    //test push method with double stack
    private static void testPushDouble(Stack<Double> stack, double[] values) {
        System.out.printf("%n Pushing elements onto double Stack%n");
        //push elements to Stack
        for (double value : values) {
            System.out.printf("%.1f ", value);
            stack.push(value);//push onto double stack
        }
    }

    //test pop method with double stack
    private static void testPopDouble(Stack<Double> stack) {
        //pop elements from stack
        try {
            System.out.printf("%n Popping elements from doubleStack %n");
            double popValue;//store element removed from stack
            //remove all elements from stack
            while (true) {
                popValue = stack.pop();//pop from doubleStack
                System.out.printf("%.1f ", popValue);
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println();
            noSuchElementException.printStackTrace();
        }
    }

    //test push method with integer stack
    private static void testPushInteger(Stack<Integer> stack, int[] values) {
        System.out.printf("%nPushing elements onto integerStack %n");
        //push elements to stack
        for (int value : values) {
            System.out.printf("%d ", value);
            stack.push(value);//push onto integerStack
        }
    }

    //test pop method with integer stack
    private static void testPopInteger(Stack<Integer> stack) {
        //pop elements from stack
        try {
            System.out.printf("%nPopping elements from integerStack %n");
            int popValue;//store element removed from stack
            //remove all elements from Stack
            while (true) {
                popValue = stack.pop();//pop from int Stack
                System.out.printf("%d ", popValue);
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println();
            noSuchElementException.printStackTrace();
        }
    }
}
