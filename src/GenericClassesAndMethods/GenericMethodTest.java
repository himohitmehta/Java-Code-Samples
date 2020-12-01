package GenericClassesAndMethods;

//printing array elements using generic method printArray
public class GenericMethodTest {
    public static void main(String[] args) {
        //create arrays of Integer,Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] doubleArray = {2.3, 4343.32, 4.5, 5.5, 6.2};
        Character[] characterArray = {'M', 'O', 'H', 'I', 'T'};
        System.out.print("Array integer contains: ");
        printArray(integerArray);//pass an Integer array
        System.out.print("Array doubleArray contains: ");
        printArray(doubleArray);//pass a Double array
        System.out.print("Array characterArray contains: ");
        printArray(characterArray);//pass a Character Array
    }

    //generic method printArray
    public static void printArray(Object[] inputArray) {
        //display array elements
        for (Object element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
