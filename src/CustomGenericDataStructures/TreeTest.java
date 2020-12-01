package CustomGenericDataStructures;

import java.security.SecureRandom;

//Binary tree test program
public class TreeTest {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<Integer>();
        SecureRandom randomNumbers = new SecureRandom();
        System.out.println("Inserting the following values: ");
        //insert 10 random numbers from 0-99 in tree
        for (int i = 1; i <= 10; i++) {
            int value = randomNumbers.nextInt(100);
            System.out.printf("%d ", value);
            tree.insertNode(value);
        }
        System.out.printf("%n%n Preorder traversal%n");
        tree.preorderTraversal();
        System.out.printf("%n%nInorder  traversal%n");
        tree.inorderTraversal();
        System.out.printf("%n%nPostOrder Traversal%n");
        tree.postorderTraversal();
        System.out.println();
    }
}
