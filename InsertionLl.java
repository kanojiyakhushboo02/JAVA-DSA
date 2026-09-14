public class InsertionLl {
    
    

    // Node declaration
    static class ListNode {
        int val;
        ListNode next;

        // Constructor
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Insertion Sort on Linked List
    public static ListNode insertionSortList(ListNode head) {

        // Dummy node
        ListNode dummy = new ListNode(0);

        // Current node from original list
        ListNode current = head;

        while (current != null) {

            // Save the next node
            ListNode next = current.next;

            // Start from beginning of sorted list
            ListNode prev = dummy;

            // Find correct position
            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }

            // Insert current node
            current.next = prev.next;
            prev.next = current;

            // Move to next node
            current = next;
        }

        return dummy.next;
    }

    // Print linked list
    public static void printList(ListNode head) {

        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        // Creating linked list:
        // 4 -> 2 -> 1 -> 3 -> null

        ListNode head = new ListNode(4);

        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        System.out.println("Original list:");
        printList(head);

        // Sort the linked list
        head = insertionSortList(head);

        System.out.println("Sorted list:");
        printList(head);
    }
}

