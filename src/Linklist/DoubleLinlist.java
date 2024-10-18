package Linklist;

class DoubleLink {
    int data;
    DoubleLink next;
    DoubleLink prev;

    // Constructor
    DoubleLink(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoubleLinlist {
    DoubleLink head = null;
    DoubleLink tail = null;

    // Adding a node to the beginning of the list
    public void addingFirst(int data) {
        DoubleLink newNode = new DoubleLink(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Adding a node to the end of the list
    public void addingLast(int data) {
        DoubleLink newNode = new DoubleLink(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Display the list from head to tail
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        DoubleLink temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display the list from tail to head
    public void displayBackward() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        DoubleLink temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // Deleting the first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head == tail) { // Only one element
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Deleting the last node
    public void deleteLast() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head == tail) { // Only one element
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Main method to test the doubly linked list
    public static void main(String[] args) {
        DoubleLinlist list = new DoubleLinlist();
        list.addingFirst(1);
        list.addingFirst(2);
        list.addingLast(3);
        list.addingLast(4);

        System.out.println("Display forward:");
        list.displayForward();

        System.out.println("Display backward:");
        list.displayBackward();

        list.deleteFirst();
        System.out.println("After deleting first node:");
        list.displayForward();

        list.deleteLast();
        System.out.println("After deleting last node:");
        list.displayForward();
    }
}
