package com.bkryvetskyi.taskThree;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorialUsingForLoop(100));
    }


    private static int factorialUsingForLoop(int num) {

        int sum = 0;
        BigInteger fact = BigInteger.ONE;

        for (int i = 2; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i)); // Calculate the factorial of number
        }

        String number = String.valueOf(fact);

        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(String.valueOf(number.charAt(i))); // Sum of all digits in the number
        }
        return sum;
    }
}
