// Comment out package for now 
// package main; 
/* 
    Robyn Felton / landon_felton@my.cuesta.edu 
    CIS 232 / Scovil 
    Lab 1 
*/

// Any imports go here 
// Rename this class and source file per the lab spec 
public class L1_232RFel {
    // Can change this constant to a different amount
    public static final int NUM_VALUES = 30;

    public static void main(String[] args) {
        System.out.println("CIS 232 - Lab 1 - Robyn Felton");
        // Can change the quantity from 10 and max from 100
        int[] data = randomArray(NUM_VALUES, 10);

        // You can change the # of items per line
        printArray(data, 6);
        System.out.println();
        int[] minMax = findMinMax(data);
        System.out
                .println(
                        "The smallest value shown is: " + minMax[0] + ", and the largest value shown is: " + minMax[1]
                                + "!");
    }

    // Returns an array of amount values ranging from 1-maxValue inclusive
    public static int[] randomArray(int amount, int maxValue) {
        int[] output = new int[amount];
        for (int x = 0; x < amount; x++) {
            output[x] = 1 + (int) (Math.random() * ((maxValue - 1) + 1));
        }
        // replace this with an array to return
        return output;
    }

    // Display the array on the screen in lines numPerLine long
    public static void printArray(int[] array, int numPerLine) {
        int y = 0;
        for (int x = 0; x < array.length; x++) {
            if (y == numPerLine) {
                System.out.println();
                y = 0;
            }
            System.out.print(array[x] + " ");
            y++;
        }
    }

    // Returns min at [0], max at [1]
    public static int[] findMinMax(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x = 0; x < array.length; x++) {
            if (array[x] < min) {
                min = array[x];
            }
        }
        for (int x = 0; x < array.length; x++) {
            if (array[x] > max) {
                max = array[x];
            }
        }
        // replace this with an array to return
        int[] output = new int[2];
        output[0] = min;
        output[1] = max;
        return output;
    }

}