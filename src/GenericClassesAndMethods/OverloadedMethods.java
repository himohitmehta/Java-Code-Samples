package GenericClassesAndMethods;

//printing array elements using overloaded methods
public class OverloadedMethods {
    public static void main(String[] args) {
        //create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 5.5, 7.7, 8.8};
        Character[] characterArray = {'M', 'O', 'H', 'I', 'T'};
        System.out.print("Array integerArray contains: ");
        printArray(integerArray);//pass an integer array
        System.out.print("Array doubleArray contains: ");
        printArray(doubleArray);//Pass a double array
        System.out.print("Array characterArray contains: ");
        printArray(characterArray);//pass a character array
    }

    //method printArray to print Integer Array
    public static void printArray(Integer[] inputArray) {
        //display array elements
        for (Integer element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    //method printArray to print Double Array
    public static void printArray(Double[] inputArray) {
        //display array elements
        for (Double element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    //method printArray to print Character Array
    public static void printArray(Character[] inputArray) {
        //display array elements
        for (Character element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
