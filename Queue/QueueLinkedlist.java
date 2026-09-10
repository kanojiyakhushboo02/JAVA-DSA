public class QueueLinkedlist {

    // NODE CLASS
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // QUEUE VARIABLES
    Node Head = null;
    Node Tail = null;

    // CHECK EMPTY
    public boolean isEmpty() {
        return Head == null;
    }

    // ADD
    public void add(int data) {

        Node newNode = new Node(data);

        if (isEmpty()) {
            Head = Tail = newNode;
            return;
        }

        Tail.next = newNode;
        Tail = newNode;
    }

    // REMOVE
    public int remove() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int data = Head.data;

        Head = Head.next;

        if (Head == null) {
            Tail = null;
        }

        return data;
    }

    // PEEK
    public int peek() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return Head.data;
    }

    // MAIN
    public static void main(String[] args) {

        QueueLinkedlist q = new QueueLinkedlist();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}