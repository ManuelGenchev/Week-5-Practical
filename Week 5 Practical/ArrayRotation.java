public class ArrayRotation {
    public static void main(String[] args) {
        // Example usage
        int[] originalArray = {1, 2, 3, 4, 5};
        int rotationPositions = 2;

        System.out.println("Original Array: ");
        printArray(originalArray);

        // Rotate the array
        rotateArray(originalArray, rotationPositions);

        System.out.println("Array after rotation: ");
        printArray(originalArray);
    }

    // Function to rotate an array to the right by a given number of positions
    public static void rotateArray(int[] arr, int positions) {
        int length = arr.length;
        int[] rotatedArray = new int[length];

        for (int i = 0; i < length; i++) {
            int newPosition = (i + positions) % length;
            rotatedArray[newPosition] = arr[i];
        }

        // Copy the rotated array back to the original array
        System.arraycopy(rotatedArray, 0, arr, 0, length);
    }

    // Function to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
