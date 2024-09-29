package DSA;

public class linklist {
    Node head;

    class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Adding the first element to the linked list
    public void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    //making the dellete first

    public void deletefirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            System.out.println("head is null");
        }


        Node current = head;
        head = current.next;

    }

    //now deleting last of the nodelist

    public void deletelast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            System.out.println("head is null");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        secondLast.next = null;

    }


    // Adding the last element to the linked list
    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node newNext = head;
        while (newNext.next != null) {  // Traverse to the last node
            newNext = newNext.next;
        }
        newNext.next = newNode;  // Point the last node to the new node
    }

    // Displaying the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " => ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linklist list = new linklist();
        list.addfirst("hey");
        list.addfirst("deepika");
        list.deletelast("hey");
        list.display();
    }
}
