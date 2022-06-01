package com.bkryvetskyi;

/*
 * Created Bohdan Kryvetskyi.
 *
 */

import java.util.Scanner;

public class TaskOne {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        * Return the number of regular bracket sequences.
        * number non-negative integer
        * sum the number of correct bracket sequences.
        */
        System.out.print(getNumber(scanner.nextInt()));
        scanner.close();
    }

    private static int getNumber(int number) {

        final int MIN_NUMBER = 0;
        final int FIRST_NUMBER = 1;

        int sum = 0;

        // Return the first number from the number if the entered number is 0.
        if (number == MIN_NUMBER) {
            return FIRST_NUMBER;
        }

        for (int i = 0; i < number; i++) {      // Bracket number calculation loop.
            sum += getNumber(i) * getNumber((number - 1) - i);
        }
        return sum;
    }
}
