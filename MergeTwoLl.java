class MergeTwoLl{

    // Node of Linked List
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Function to merge two sorted linked lists
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node
        ListNode dummy = new ListNode(0);

        // Current pointer
        ListNode current = dummy;

        // Compare both lists
        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {

                // Take node from list1
                current.next = list1;

                // Move list1 forward
                list1 = list1.next;

            } else {

                // Take node from list2
                current.next = list2;

                // Move list2 forward
                list2 = list2.next;
            }

            // Move current forward
            current = current.next;
        }

        // If list1 still has nodes
        if (list1 != null) {
            current.next = list1;
        }

        // If list2 still has nodes
        else {
            current.next = list2;
        }

        // Return actual head
        return dummy.next;
    }

    // Print linked list
    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // First sorted list:
        // 1 → 3 → 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // Second sorted list:
        // 2 → 4 → 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        // Merge both lists
        ListNode result = mergeTwoLists(list1, list2);

        // Print result
        printList(result);
    }
}