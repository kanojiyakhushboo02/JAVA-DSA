public class CheckSorted {

    public static void checkOrder(int arr[]) {

        boolean ascending = true;
        boolean descending = true;

        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i] > arr[i + 1]) {
                ascending = false;
            }

            if(arr[i] < arr[i + 1]) {
                descending = false;
            }
        }

        if(ascending) {
            System.out.println("Array is Sorted");
        }
        else if(descending) {
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array is Not Sorted");
        }
    }

    public static void main(String[] args) {

        int arr[] = {10,5,700,80};

        checkOrder(arr);
    }
}