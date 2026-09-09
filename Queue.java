public class Queue {

    int arr[];
    int size;
    int front;
    int rear;

    // Constructor
    Queue(int n) {
        arr = new int[n];
        size = 0;
        front = -1;
        rear = -1;
    }

    // Add element to queue
    public void add(int data) {

        // Check if queue is full
        if (rear == arr.length - 1) {
            System.out.println("Queue is full");
            return;
        }

        // If this is the first element
        if (size == 0) {
            front = 0;
        }

        // Move rear and insert element
        rear++;
        arr[rear] = data;
        size++;
    }

    // Remove element from queue
    public int remove() {

        // Check if queue is empty
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        // Get the front element
        int data = arr[front];

        // Move front forward
        front++;

        // Decrease number of elements
        size--;

        // If queue becomes empty
        if (size == 0) {
            front = -1;
            rear = -1;
        }

        return data;
    }

    // See front element without removing it
    public int peek() {

        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }

    // Check whether queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String args[]) {

        // Create queue of capacity 5
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Front element: " + q.peek());

        System.out.println("Removed: " + q.remove());

        System.out.println("Front element: " + q.peek());

        System.out.println("Removed: " + q.remove());

        System.out.println("Removed: " + q.remove());

        System.out.println("Is queue empty? " + q.isEmpty());
    }
}