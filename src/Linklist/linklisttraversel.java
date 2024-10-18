package Linklist;

class reversal {
    int data;
    reversal next;

    reversal(int data) {
        this.data = data;
        next = null;
    }
}

public class linklisttraversel {

    // Function to reverse the linked list
    public static boolean reversallist(reversal head) {
        if (head == null) {
            System.out.println("data is null");
            return true;
        }

        reversal prev = null;
        reversal current = head;
        reversal next = null;

        // Iterate through the list and reverse the pointers
        while (current != null) {
            next = current.next;
            current.next = prev; //this will show the ouput of the first node
            prev = current; // this will move the prev 1 step forward
            current = next; // this wil move the one step forward for next
        }

        // Print the reversed list
        reversal temp = prev; // 'prev' is now the new head of the reversed list
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        return true;
    }

    // Function to insert a new node after the given node
    public static void insertafter(reversal prevNode, int newNodeData) {
        if (prevNode == null) {
            System.out.println("Previous node is null");
            return;
        }

        reversal newNode = new reversal(newNodeData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public static void main(String[] args) {
        reversal head = new reversal(0);
        head.next = new reversal(1);
        insertafter(head.next, 9);  // insert 9 after node with data 1
        head.next.next.next = new reversal(3); // link the rest

        System.out.println("Original linked list:");
        reversal current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        System.out.println("Reversed linked list:");
        reversallist(head);  // reverse and print the list
    }
}
