
import java.util.*;
public class findSmaller{
    public static void findLarge(int arr[], int smaller){
        for(int i=0; i<arr.length; i++){
            if(arr[i]<smaller){
                smaller = arr[i];
            }
        }
        System.out.println("The smallest element in the array is: "+smaller);
    }

    public static void main(String args[]){
        int arr[]={1,2,21,4,5,6,7,8,9,1,16,3,15,20,0};
        int smaller = Integer.MAX_VALUE;
        findLarge(arr,smaller  );
    }
}