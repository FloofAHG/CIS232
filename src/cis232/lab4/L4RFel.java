
/**
 * Lab 4
 * 
 * @author Robyn Felton
 */
package cis232.lab4;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
//import cis232.lab3.*;

public class L4RFel {
    public static String randomChar() {
        String lettersAndNumbers = "qwertyuiopasdfghjklzxcvbnm1234567890";
        String output = "";
        for (int i = 0; i < 8; i++) {
            int chosenChar = ThreadLocalRandom.current().nextInt(0, 36);
            output += lettersAndNumbers.substring(chosenChar, chosenChar + 1);
        }
        return output;
    }

    public static void arrayListSort(ArrayList c) {
        for (int i = 0; i < 10; i++) {
            Object temp = null;
            for (int j = i; j < 10; j++) {
                if (c.get(j).compareTo(temp) > 0) {
                    temp = c.get(j);
                    c.set(j, c.get(i));
                    c.set(i, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Integer ArrayList Unsorted: ");
        ArrayList<Integer> numbers = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                numbers.add((int) (Math.random() * 100000000));
            }
            System.out.println(numbers.get(i));
        }

        System.out.println("\nDouble ArrayList Unsorted: ");
        ArrayList<Double> doubles = new ArrayList<Double>(10);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                doubles.add(Math.random() * 1000000);
            }
            System.out.println(doubles.get(i));
        }
        System.out.println("\nString ArrayList Unsorted: ");
        ArrayList<String> strings = new ArrayList<String>(10);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                strings.add(randomChar());
            }
            System.out.println(strings.get(i));
        }
        arrayListSort(numbers);
        arrayListSort(doubles);
        arrayListSort(strings);
        System.out.println("\nInteger ArrayList Sorted: ");
        for (int k = 0; k < 10; k++) {
            System.out.println(numbers.get(k));
        }
        System.out.println("\nDouble ArrayList Sorted: ");
        for (int k = 0; k < 10; k++) {
            System.out.println(doubles.get(k));
        }
        System.out.println("\nString ArrayList Sorted: ");
        for (int k = 0; k < 10; k++) {
            System.out.println(strings.get(k));
        }
    }
}
