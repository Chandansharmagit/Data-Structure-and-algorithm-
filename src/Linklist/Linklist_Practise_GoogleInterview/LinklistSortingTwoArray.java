package Linklist.Linklist_Practise_GoogleInterview;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinklistSortingTwoArray {

    // Method to merge two sorted linked lists
    public Node mergingTwoNodes(Node root1, Node root2) {
        if (root1 == null) {
            return root2; // Return root2 if root1 is null
        }
        if (root2 == null) {
            return root1; // Return root1 if root2 is null
        }

        Node newNode = new Node(0); // Dummy node to start the merged list
        Node currentNode = newNode;  // Pointer to build the new list

        // Merging process
        while (root1 != null && root2 != null) {
            if (root1.data <= root2.data) {
                currentNode.next = root1; // Link the smaller node
                root1 = root1.next;       // Move the pointer in list1
            } else {
                currentNode.next = root2; // Link the smaller node
                root2 = root2.next;       // Move the pointer in list2
            }
            currentNode = currentNode.next; // Move to the next node in the merged list
        }

        // Append remaining nodes if any
        if (root1 != null) {
            currentNode.next = root1; // Append remaining nodes from list1
        } else if (root2 != null) {
            currentNode.next = root2; // Append remaining nodes from list2
        }

        return newNode.next; // Return the merged list, skipping the dummy node
    }

    // Method to print the linked list
    public void printList(Node root) {
        while (root != null) {
            System.out.print(root.data + " -> "); // Print current node's data
            root = root.next;                     // Move to the next node
        }
        System.out.println("null"); // Indicate the end of the list
    }


    //this will throw the data in the garbage collections of the output
    public static void main(String[] args) {
        // Creating two sorted lists
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        // Merging the lists
        LinklistSortingTwoArray merger = new LinklistSortingTwoArray();
        Node mergedList = merger.mergingTwoNodes(list1, list2);

        // Print the merged list
        System.out.print("Merged List: ");
        merger.printList(mergedList);
    }
}
