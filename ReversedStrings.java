// StringObjects.java
// cGJ 9/07/25

// References:
//www.w3schools.com/java/java_user_input.asp
//www.w3schools.com/java/java_howto_reverse_string.asp

import java.util.Scanner;
public class ReversedStrings {
    public static void main(String[] args) {

        // Gets user input.
        System.out.printf("\n Please enter phrase:");
        Scanner scanner = new Scanner(System.in);

        String phrase = scanner.nextLine();
        String scannerReversed = "";

        for (int i = 0; i < phrase.length(); i++) {
            scannerReversed = phrase.charAt(i) + scannerReversed;
        }
        // Displays reversed phrase
        System.out.println(scannerReversed);
    }
}

