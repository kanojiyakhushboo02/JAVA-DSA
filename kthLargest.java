import java.util.*;

class KthLargest {

    private PriorityQueue<Integer> minHeap;
    private int k;

    // Constructor
    public KthLargest(int k, int[] nums) {

        this.k = k;

        minHeap = new PriorityQueue<>();

        // Add all elements
        for (int num : nums) {

            minHeap.add(num);

            // Keep only k largest elements
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }
    }

    // Method to find kth largest
    public int getKthLargest() {
        return minHeap.peek();
    }

    public static void main(String[] args) {

        int nums[] = {4, 5, 8, 2};
        int k = 2;

        KthLargest obj = new KthLargest(k, nums);

        System.out.println("Kth Largest Element: " + obj.getKthLargest());
    }
}