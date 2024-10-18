package Linklist.fastandslowpointertechniques;

class NodesList {
    int data;
    NodesList next;

    NodesList(int data) {
        this.data = data;
        this.next = null;  // Always initialize the next pointer
    }
}

public class Fast_andSlowPointersTechniques {

    // Method to check if a cycle exists in the linked list
    public boolean checkingCycle(NodesList head) {
        if (head == null || head.next == null) {
            System.out.println("List is empty or has only one node, no cycle.");
            return false;
        }

        NodesList fast = head;
        NodesList slow = head;

        // Traverse the list with fast and sq   elow pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Slow moves 1 step
            fast = fast.next.next;    // Fast moves 2 steps

            // If slow meets fast, cycle exists
            if (slow == fast) {
                System.out.println("Cycle detected in the linked list!");
                return true;
            }
        }

        // No cycle found
        System.out.println("No cycle detected.");
        return false;
    }

    public static void main(String[] args) {
        // Creating nodes for the linked list
        NodesList node1 = new NodesList(10);
        NodesList node2 = new NodesList(20);
        NodesList node3 = new NodesList(30);
        NodesList node4 = new NodesList(40);

        // Linking nodes to form the list: 10 -> 20 -> 30 -> 40
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;



        // Create an instance of Fast_andSlowPointersTechniques
        Fast_andSlowPointersTechniques techniques = new Fast_andSlowPointersTechniques();


        techniques.checkingCycle(node1);
    }
}
