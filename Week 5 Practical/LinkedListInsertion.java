import java.util.Scanner;

class node {
    int data;
    node next;

    public node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    node head;

    // Function to insert a node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        node newNode = new node(data);
        newNode.next = head;
        head = newNode;
    }

    // Function to insert a node at the end of the linked list
    public void insertAtEnd(int data) {
        node newNode = new node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Function to insert a node at a specific position in the linked list
    public void insertAtPosition(int data, int position) {
        node newNode = new node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position. Node not inserted.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Function to display the linked list
    public void displayList() {
        node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}

public class LinkedListInsertion {
    public static void main(String[] args) {
        // Create a singly linked list
        LinkedList linkedList = new LinkedList();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Menu for insertion options
        int choice;
        do {
            System.out.println("\nChoose an insertion option:");
            System.out.println("1. Insert at the beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Insert at a specific position");
            System.out.println("4. Display linked list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the data to insert at the beginning: ");
                    int dataBeginning = scanner.nextInt();
                    linkedList.insertAtBeginning(dataBeginning);
                    break;
                case 2:
                    System.out.print("Enter the data to insert at the end: ");
                    int dataEnd = scanner.nextInt();
                    linkedList.insertAtEnd(dataEnd);
                    break;
                case 3:
                    System.out.print("Enter the data to insert: ");
                    int dataPosition = scanner.nextInt();
                    System.out.print("Enter the position to insert at: ");
                    int position = scanner.nextInt();
                    linkedList.insertAtPosition(dataPosition, position);
                    break;
                case 4:
                    System.out.print("Linked list: ");
                    linkedList.displayList();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);

        // Close the Scanner
        scanner.close();
    }
}
