package cis232.lab5;

import java.awt.*;
import java.util.Comparator;
import java.util.Random;

/**
 * Lab 5
 * 
 * @author Robyn Felton
 */
public class L5_232RFel {
    public static <T> void sort(T[] anyArray, Comparator<? super T> compareT) {
        int index;
        for (int i = 0; i < anyArray.length - 1; i++) {
            index = i;

            for (int j = i + 1; j < anyArray.length; j++) {
                if (compareT.compare(anyArray[j], anyArray[index]) < 0)
                    index = j;
            }

            if (i != index) {
                T temp = anyArray[i];
                anyArray[i] = anyArray[index];
                anyArray[index] = temp;
            }
        }
    }

    // I don't see why you wanted me to do this over a bubble sort;
    // they are pretty similar in my opinion and I feel like bubble
    // sorts take up less resources.

    public static <T> void displayContents(T[] arr, int itemsOnLine) {
        int currentLine = 0;
        for (int i = 0; i < arr.length; i++) {
            if (currentLine == itemsOnLine) {
                System.out.println("");
                currentLine = 0;
            }
            System.out.print(arr[i] + " ");
            currentLine++;
        }
    }

    private static class Ascend implements Comparator<Point> {
        @Override
        public int compare(Point point1, Point point2) {

            if (point1.getX() < point2.getX())
                return -1;
            else if (point1.getX() > point2.getX())
                return 1;
            else {
                if (point1.getY() < point2.getY())
                    return -1;
                else if (point1.getY() > point2.getY())
                    return 1;
                else
                    return 0;
            }
        }

    }

    private static class Descend implements Comparator<Point> {
        @Override
        public int compare(Point point1, Point point2) {

            if (point1.getX() > point2.getX())
                return -1;
            else if (point1.getX() < point2.getX())
                return 1;
            else {
                if (point1.getY() > point2.getY())
                    return -1;
                else if (point1.getY() < point2.getY())
                    return 1;
                else
                    return 0;
            }
        }

    }

    public static void main(String[] args) {
        Point[] points = new Point[20];
        Random random = new Random();
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(random.nextInt(201) - 100, random.nextInt(201) - 100);
        }
        System.out.println("Unsorted Array:");
        displayContents(points, 3);
        System.out.println("\n\nSorted Array (Ascending):");
        sort(points, new Ascend());
        displayContents(points, 3);
        System.out.println("\n\nSorted Array (Descending):");
        sort(points, new Descend());
        displayContents(points, 3);
    }
}
