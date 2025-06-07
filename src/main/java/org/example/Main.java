package org.example; //DO NOT DELETE
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter beginning index: ");
        int beginIndex = scanner.nextInt();

        System.out.print("Enter ending index: ");
        int endIndex = scanner.nextInt();

        String substring = originalString.substring(beginIndex, endIndex);

        System.out.println("Original string: " + originalString);
        System.out.println("Substring: " + substring);

        scanner.close();
    }
}
