public class Partition{

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode partition(ListNode head, int x) {

        // Dummy nodes for two separate lists
        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);

        ListNode beforeCurrent = before;
        ListNode afterCurrent = after;

        ListNode current = head;

        while (current != null) {

            if (current.val < x) {
                beforeCurrent.next = current;
                beforeCurrent = beforeCurrent.next;
            } else {
                afterCurrent.next = current;
                afterCurrent = afterCurrent.next;
            }

            current = current.next;
        }

        // End the after list
        afterCurrent.next = null;

        // Connect before list with after list
        beforeCurrent.next = after.next;

        return before.next;
    }

    // Print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        int x = 3;

        System.out.println("Original:");
        printList(head);

        head = partition(head, x);

        System.out.println("After Partition:");
        printList(head);
    }
}