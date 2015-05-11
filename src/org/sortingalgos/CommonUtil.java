package org.sortingalgos;

import java.util.Scanner;

/**
 * Created by ankitsh on 5/4/2015.
 */
public class CommonUtil {

    public static int[] readArray(int[] sortArray) {
        System.out.println("Please enter integers : ");
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        try {
            for (int i = 0; i < sortArray.length; i++) {
                sortArray[counter++] = scanner.nextInt();
            }
        } finally {
            scanner.close();
        }
        return sortArray;
    }

    public static void displayArray(int[] sortArray) {
        System.out.print("Sorted Array :: ");
        for (int i = 0; i < sortArray.length; i++) {
            System.out.print(sortArray[i] + " ");
        }
        System.out.println();
    }

}
