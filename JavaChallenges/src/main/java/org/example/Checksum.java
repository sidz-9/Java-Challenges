/*
* 2.2.6 Exercise 6: Checksum (★★✩✩✩)
Create method int calcChecksum(String) that performs the following position-based
calculation for the checksum of a number of any length given as a string, with the n digits
Examples
Input Sum Result
“11111” 1 + 2 + 3 + 4 + 5 = 15 15 % 10 = 5
“87654321” 8 + 14 + 18 + 20 + 20 + 18 + 14 + 8 = 120 120 % 10 = 0
*
* */


package org.example;

import java.util.Scanner;

public class Checksum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String inputString = sc.nextLine();
        System.out.println("String entered is " + inputString);

        Checksum c = new Checksum();

        System.out.println(c.calcChecksum(inputString));

    }

    public int calcChecksum(String inputString) {

        int sum = 0;
        for (int i = 0; i < inputString.length(); i++) {
            int x = (int) inputString.charAt(i) - 48;
            sum = sum + (x * (i+1));
            System.out.println("sum is " + sum);
        }

        return sum % 10;
    }
}
