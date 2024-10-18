package Linklist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linklist {
    Node head;

    // Insert at the beginning
    public void insertingfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Insert at the end
    public void addinginLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {  // Corrected: Traverse to the last node
                temp = temp.next;
            }
            temp.next = newNode;  // Add the new node at the end
        }
    }

    // Delete the first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
        }
    }

    // Delete the last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {  // Only one node in the list
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {  // Traverse to the second last node
                temp = temp.next;
            }
            temp.next = null;  // Remove the last node
        }
    }



    ///deleting by value

    public void deletingbyvalue(int value){
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == value) { // If the head node is to be deleted
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Node not found.");
            return;
        }

        temp.next = temp.next.next; // Skip the node to delete
    }

    

    public static void main(String[] args) {
        linklist obj = new linklist();
        obj.insertingfirst(1);
        obj.insertingfirst(2);
        obj.insertingfirst(3);

        obj.addinginLast(4);

//        obj.deleteLast();
        obj.deletingbyvalue(2);

        obj.display();  // Expected output: 3 -> 2 -> 1 -> null
    }
}
