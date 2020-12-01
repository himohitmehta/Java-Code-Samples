package Recursion;
//Towers of Hanoi solution with a recursive method

public class TowersOfHanoi {
    ///recursively move disks between towers
    public static void solveTowers(int disks, int sourcePeg, int destinationPeg, int tempPeg) {
        //base case -- only one disk to move
        if (disks == 1) {
            System.out.printf("%n%d --> %d", sourcePeg, destinationPeg);
            return;
        }
        //recursion step--move(disk-1) disks from sourcePeg to tempPeg using destinationPeg
        solveTowers(disks - 1, sourcePeg, tempPeg, destinationPeg);
        //move last disk from sourcePeg to destinationPeg
        System.out.printf("%n%d-->%d", sourcePeg, destinationPeg);
        //move (disks - 1) disks from tempPeg to destinationPeg
        solveTowers(disks - 1, tempPeg, destinationPeg, sourcePeg);
    }

    public static void main(String[] args) {
        int startPeg = 1;//value1 used to indicate startPeg in output
        int endPeg = 3;//value3 to indicate endPeg
        int tempPeg = 2;// value2 to indicate tempPeg
        int totalDisks = 3;//number of disks
        //initial non recursive call move all disks
        solveTowers(totalDisks, startPeg, endPeg, tempPeg);
    }
}
