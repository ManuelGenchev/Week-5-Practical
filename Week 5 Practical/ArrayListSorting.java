import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSorting {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> stringList = new ArrayList<>();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of strings
        System.out.print("Enter the number of strings: ");
        int numberOfStrings = scanner.nextInt();

        // Prompt the user to enter the strings
        System.out.println("Enter the strings:");

        for (int i = 0; i < numberOfStrings; i++) {
            System.out.print("String " + (i + 1) + ": ");
            String inputString = scanner.next();
            stringList.add(inputString);
        }

        // Sort the ArrayList in alphabetical order
        Collections.sort(stringList);

        // Display the sorted ArrayList
        System.out.println("Sorted ArrayList: " + stringList);

        // Close the Scanner
        scanner.close();
    }
}
