import java.util.*;
public class findLarge{
    public static void findLarge(int arr[], int large){
        for(int i=0; i<arr.length; i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        System.out.println("The largest element in the array is: "+large);
    }

    public static void main(String args[]){
        int arr[]={1,2,21,4,5,6,7,8,9,1,16,3,15,20};
        int large = Integer.MIN_VALUE;
        findLarge(arr,large);
    }
}