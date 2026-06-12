public class findSecondLarge{

    public static void findSecLarge(int arr[], int largest, int secondLargest){
       for(int i=0; i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            int index = i;
            if(arr[i]>secondLargest && i != index){
                secondLargest = arr[i];
            }
            }
                        System.out.println("The second largest element in the array is: "+secondLargest);

       }
    
    public static void main(String args[]){
        int arr[] = {2,4,89,79,34,90,99};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        findSecLarge(arr, largest, secondLargest);
        }
    }