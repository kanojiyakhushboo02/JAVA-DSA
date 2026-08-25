public class IntersectionLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node getIntersectionNode(Node head1, Node head2) {

        if (head1 == null || head2 == null) {
            return null;
        }

        Node pointerA = head1;
        Node pointerB = head2;

        while (pointerA != pointerB) {

            pointerA = (pointerA == null) ? head2 : pointerA.next;

            pointerB = (pointerB == null) ? head1 : pointerB.next;
        }

        return pointerA;
    }

    public static void main(String[] args) {

        // Create the common part FIRST
        Node common = new Node(3);
        common.next = new Node(4);

        // List 1: 1 → 2 → 3 → 4
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = common;

        // List 2: 5 → 3 → 4
        Node head2 = new Node(5);
        head2.next = common;

        // Find intersection
        Node intersectionNode = getIntersectionNode(head1, head2);

        if (intersectionNode != null) {
            System.out.println(
                "Intersection at node with value: "
                + intersectionNode.data
            );
        } else {
            System.out.println("No intersection");
        }
    }
}