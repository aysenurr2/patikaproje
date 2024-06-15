package week5;

import java.util.Scanner;

public class ArrayElementRetriever {
    private static int[] myArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    // Method to return the element at a specified index
    public static String getElementAtIndex(int index) {
        try {
            // Return the element at the specified index
            int element = myArray[index];
            return "Element at index " + index + ": " + element;
        } catch (ArrayIndexOutOfBoundsException e) {
            // Return error message
            return "Error: Invalid index " + index + "!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an index
        System.out.print("Please enter an index: ");
        int index = scanner.nextInt();

        // Call the method and print the result
        System.out.println(getElementAtIndex(index));

        scanner.close();
    }
}