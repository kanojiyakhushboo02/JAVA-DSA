package SortingAlgo;

public class MergeSort {

    public static void merge(int arr[], int low, int mid, int high) {

        int left = low;
        int right = mid + 1;

        int temp[] = new int[arr.length];

        int k = low;

        // Compare elements from both halves
        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }

            k++;
        }

        // Copy remaining elements from left half
        while (left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }

        // Copy remaining elements from right half
        while (right <= high) {
            temp[k] = arr[right];
            right++;
            k++;
        }

        // Copy sorted elements back into original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
    }

    public static void mergesort(int arr[], int low, int high) {

        if (low < high) {

            int mid = (low + high) / 2;

            // Sort left half
            mergesort(arr, low, mid);

            // Sort right half
            mergesort(arr, mid + 1, high);

            // Merge both sorted halves
            merge(arr, low, mid, high);
        }
    }

    public static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = {5, 3, 4, 1};

        int low = 0;
        int high = arr.length - 1;

        mergesort(arr, low, high);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}




