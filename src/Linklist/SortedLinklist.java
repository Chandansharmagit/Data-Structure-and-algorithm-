package Linklist;

class Nodelist {
    int data;
    Nodelist next;

    Nodelist(int data) {
        this.data = data;
        next = null;
    }
}

public class SortedLinklist {

    // Method to sort the linked list and remove duplicates
    public Nodelist SortingLinklist(Nodelist head) {
        if (head == null || head.next == null) {
            return head; // If list is empty or has only one element, it's already sorted
        }

        Nodelist sorted = null;

        // Traverse the list and insert nodes into the sorted list
        while (head != null) {
            Nodelist current = head;
            head = head.next;

            // Check if the current node is a duplicate before inserting
            if (sorted == null || sorted.data > current.data) {
                current.next = sorted;
                sorted = current;
            } else if (sorted.data < current.data) {
                Nodelist temp = sorted;
                boolean isDuplicate = false;

                while (temp.next != null && temp.next.data < current.data) {
                    temp = temp.next;
                }

                // Check for duplicates
                if (temp.next != null && temp.next.data == current.data) {
                    isDuplicate = true;
                }

                // Insert if not a duplicate
                if (!isDuplicate) {
                    current.next = temp.next;
                    temp.next = current;
                }
            }
        }

        return sorted;
    }

    // Method to print the linked list
    public void printlist(Nodelist root) {
        if (root == null) {
            System.out.println("The list is empty.");
            return;
        }

        Nodelist temp = root;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a sample linked list with duplicates
        Nodelist node = new Nodelist(6);
        node.next = new Nodelist(2);
        node.next.next = new Nodelist(4);
        node.next.next.next = new Nodelist(2); // Duplicate
        node.next.next.next.next = new Nodelist(6); // Duplicate

        SortedLinklist linklist = new SortedLinklist();

        System.out.println("Original Linklist:");
        linklist.printlist(node);

        // Sort the linked list and remove duplicates
        Nodelist sortedList = linklist.SortingLinklist(node);

        System.out.println("Linklist after sorting and removing duplicates:");
        linklist.printlist(sortedList);
    }
}
