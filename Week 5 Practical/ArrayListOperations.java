import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Adding elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        // Display the initial contents of the ArrayList
        System.out.println("Initial ArrayList: " + arrayList);

        // Adding elements at a specific index
        System.out.print("Enter an element to add: ");
        int elementToAdd = scanner.nextInt();
        System.out.print("Enter the index to add the element: ");
        int indexToAdd = scanner.nextInt();
        arrayList.add(indexToAdd, elementToAdd);

        // Display the ArrayList after adding an element
        System.out.println("ArrayList after adding element: " + arrayList);

        // Removing elements from the ArrayList
        System.out.print("Enter the index to remove the element: ");
        int indexToRemove = scanner.nextInt();
        arrayList.remove(indexToRemove);

        // Display the ArrayList after removing an element
        System.out.println("ArrayList after removing element: " + arrayList);

        // Updating elements in the ArrayList
        System.out.print("Enter the index to update the element: ");
        int indexToUpdate = scanner.nextInt();
        System.out.print("Enter the new value for the element: ");
        int newValue = scanner.nextInt();
        arrayList.set(indexToUpdate, newValue);

        // Display the ArrayList after updating an element
        System.out.println("ArrayList after updating element: " + arrayList);

        // Printing the final contents of the ArrayList
        System.out.println("Final ArrayList: " + arrayList);

        // Close the Scanner
        scanner.close();
    }
}
