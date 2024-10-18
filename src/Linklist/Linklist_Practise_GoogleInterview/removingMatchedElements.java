package Linklist.Linklist_Practise_GoogleInterview;

class removingNode {
    int data;
    removingNode next;

    removingNode(int data) {
        this.data = data;
        next = null;
    }
}

public class removingMatchedElements {

    public removingNode removingKeyValue(removingNode head, int value) {
        if (head == null) {
            System.out.println("list is empty");
            return null;
        }

        // Handle cases where the head itself needs to be removed


        removingNode currentNode = head;

        // Traverse the list to remove matched nodes
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.data == value) { // Check if the next node matches the value
                currentNode.next = currentNode.next.next; // Remove the matched node
            } else {
                currentNode = currentNode.next; // Move to the next node
            }
        }
        return head; // Return the new head of the modified list
    }

    public static void printingList(removingNode head) {
        removingNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        removingNode head = new removingNode(1);
        head.next = new removingNode(2);
        head.next.next = new removingNode(3);
        head.next.next.next = new removingNode(4);
        head.next.next.next.next = new removingNode(2);

        System.out.println("Original list:");
        removingMatchedElements remover = new removingMatchedElements();
        remover.printingList(head);

        // Remove nodes with value 2
        head = remover.removingKeyValue(head, 2);

        System.out.println("List after removing nodes with value 2:");
        remover.printingList(head);
    }
}
