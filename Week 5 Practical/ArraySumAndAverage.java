import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of integers with the specified size
        int[] arr = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Calculate the sum and average
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / size;

        // Display the sum and average
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);
    }
}
