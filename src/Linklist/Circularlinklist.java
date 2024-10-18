package Linklist;

class CircularNode {
    int data;
    CircularNode next;

    CircularNode(int data) {
        this.data = data;
        next = null;
    }
}

public class Circularlinklist {
    CircularNode head = null;
    CircularNode tail = null;

    // Insert at the end
    public void insertAtEnd(int data) {
        CircularNode newNode = new CircularNode(data);
        if (head == null) { // List is empty
            head = newNode;
            tail = newNode;
            newNode.next = head; // Circular link to itself
        } else {
            tail.next = newNode; // Current tail points to the new node
            tail = newNode; // Update tail to the new node
            tail.next = head; // Circular link back to the head
        }
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        CircularNode newNode = new CircularNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Circular link to itself
        } else {
            newNode.next = head; // New node points to the current head
            head = newNode; // Update head to new node
            tail.next = head; // Update tail to point to the new head
        }
    }

    // Delete the first element
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
        } else if (head == tail) { // Only one node in the list
            head = null;
            tail = null;
        } else {
            head = head.next; // Move head to the next node
            tail.next = head; // Update tail to point to the new head
        }
    }

    // Delete the last element
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
        } else if (head == tail) { // Only one node in the list
            head = null;
            tail = null;
        } else {
            CircularNode temp = head;
            while (temp.next != tail) { // Traverse to the second-last node
                temp = temp.next;
            }
            temp.next = head; // Second-last node points to head
            tail = temp; // Update tail to second-last node
        }
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        CircularNode temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head); // Stop when we circle back to the head
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        Circularlinklist list = new Circularlinklist();

        // Insert at the end
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();  // Output: 10 -> 20 -> 30 -> (back to head)

        // Insert at the beginning
        list.insertAtBeginning(5);
        list.display();  // Output: 5 -> 10 -> 20 -> 30 -> (back to head)

        // Delete the first element
        list.deleteFirst();
        list.display();  // Output: 10 -> 20 -> 30 -> (back to head)

        // Delete the last element
        list.deleteLast();
        list.display();  // Output: 10 -> 20 -> (back to head)
    }
}
