class Node {
    int data;
    node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    node head;

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

    // Function to display the linked list
    public void displayList() {
        node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    // Function to reverse the linked list iteratively
    public void reverseIterative() {
        node prev = null;
        node current = head;
        node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    // Function to reverse the linked list recursively
    public void reverseRecursive() {
        head = reverseRecursiveUtil(head, null);
    }

    private node reverseRecursiveUtil(node current, node prev) {
        if (current == null) {
            return prev;
        }

        node next = current.next;
        current.next = prev;
        return reverseRecursiveUtil(next, current);
    }
}

public class LinkedListReversal {
    public static void main(String[] args) {
        // Create a singly linked list
        LinkedList linkedList = new LinkedList();

        // Insert elements into the linked list
        for (int i = 1; i <= 5; i++) {
            linkedList.insertAtEnd(i);
        }

        // Display the original linked list
        System.out.println("Original Linked List:");
        linkedList.displayList();

        // Reverse the linked list iteratively
        long startTimeIterative = System.nanoTime();
        linkedList.reverseIterative();
        long endTimeIterative = System.nanoTime();
        System.out.println("\nLinked List after Iterative Reversal:");
        linkedList.displayList();
        System.out.println("Time taken for iterative reversal: " + (endTimeIterative - startTimeIterative) + " nanoseconds");

        // Reverse the linked list recursively
        long startTimeRecursive = System.nanoTime();
        linkedList.reverseRecursive();
        long endTimeRecursive = System.nanoTime();
        System.out.println("\nLinked List after Recursive Reversal:");
        linkedList.displayList();
        System.out.println("Time taken for recursive reversal: " + (endTimeRecursive - startTimeRecursive) + " nanoseconds");
    }
}
