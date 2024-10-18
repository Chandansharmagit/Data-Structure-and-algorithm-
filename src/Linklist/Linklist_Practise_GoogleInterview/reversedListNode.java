package Linklist.Linklist_Practise_GoogleInterview;

class reversedList {
    int data;
    reversedList next;

    reversedList(int data) {
        this.data = data;
        next = null;
    }
}

public class reversedListNode {

    public boolean reversingData(reversedList head) {
        if (head == null) {
            return true;  // Empty list is considered a palindrome
        }

        // Step 1: Use slow and fast pointers to find the middle of the list
        reversedList slow = head;
        reversedList fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list starting from 'slow'
        reversedList prev = null;
        reversedList current = slow;

        while (current != null) {
            reversedList next = current.next;
            current.next = prev;  // Reverse the current node's pointer
            prev = current;       // Move prev to current
            current = next;       // Move to the next node
        }

        // Step 3: Compare the first half with the reversed second half
        reversedList firstHalf = head;
        reversedList secondHalf = prev;  // prev now points to the head of the reversed second half

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;  // Mismatch found, not a palindrome
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;  // All nodes matched, the list is a palindrome
    }

    public static void main(String[] args) {
        reversedListNode listChecker = new reversedListNode();

        reversedList head = new reversedList(1);
        head.next = new reversedList(2);
        head.next.next = new reversedList(2);
        head.next.next.next = new reversedList(1);
        head.next.next.next.next = new reversedList(5);

        boolean isPalindrome = listChecker.reversingData(head);
        System.out.println("Is the linked list a palindrome? " + isPalindrome);
    }
}
