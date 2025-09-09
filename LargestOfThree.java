// LargestOfThree.java
// cGJ 8/21/25

// References:
// https://www.w3resource.com/java-exercises/conditional-statement/java-conditional-statement-exercise-3.php

// Description of program:
// This program will input three ints from the user,
// processing will be finding the largest of the three numbers with nested if statements.
// Output will be understandable statement of the largest number.
// Example: You input the value of 55 for num2 and that was the largest of three.

// the Scanner class in the java.util package
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to my Largest Of Three Program!\n");

        // variables needed for this program
        // initialize num1 to 0
        // 0 is assigned to num1
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largest = 0;

        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        // prompt the user for the first int
        System.out.println("\n Please enter a whole number for num1: ");
        num1 = scanner.nextInt();
        // Output the user's input to make sure my program is working.
        // read about concatenation
        System.out.println("\n the user entered " + num1);

        // prompt the user for the second int
        System.out.println("\n Please enter a whole number for num2: ");
        num2 = scanner.nextInt();
        System.out.println("\n the user entered " + num2);

        // prompt the user for the third int
        System.out.println("\n Please enter a whole number for num3: ");
        num3 = scanner.nextInt();
        System.out.println("\n the user entered " + num3);

        // Processing
        // Use nested if statements to find the largest.
        if (num1 > num2) {
            if (num1 > num3) {
                // this is the true part
                largest = num1;
            }
            else {
                // this is the false part
                largest = num3;
            }
        }
        else {
            if (num2 > num3) {
                // this is the true part
                largest = num2;
            }
            else {
                // this is the false part
                largest = num3;
            }
        }

        // output meaningful information to the user
        System.out.println("\n You entered " + num1 + " for the value of num1.\n");
        System.out.println("\n You entered " + num2 + " for the value of num2.\n");
        System.out.println("\n You entered " + num3 + " for the value of num3.\n");

        System.out.println("\n The largest number is " + largest);
    }

}
