package com.company;

import java.util.Scanner;

public class Main {

    // www.asciitable.com
    public static void main(String[] args) {
        hexFunction();
    }

        static void hexFunction() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a hex digit: ");
            String hexString = input.nextLine(); // class for input

            if (hexString.length() != 1) { // if the length of string is not 1 then comment
                System.out.println("You must enter exactly one character");
            }

            char ch = Character.toUpperCase(hexString.charAt(0)); // first letter of string and make it uppercase

            if (ch <= 'F' && ch >= 'A') { // less than F and greater than A then it's valid
                int value = ch - 'A' + 10; // decimal value of A is 10
                System.out.println("The decimal value for hex digit " + ch + " is " + value);
            } else if (Character.isDigit(ch)) { // check if you typed in a digit?
                System.out.println("The decimal value for hex digit " + ch + " is " + ch);
            } else {
                System.out.println(ch + " is invalid input. Type in a digit 1-9 or a letter A to F");
            }
            hexFunction(); // repeat function
        }
    }


