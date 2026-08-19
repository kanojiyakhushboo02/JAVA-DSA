// import java.util.*;
public class MergeSorted {
public static void main(String args[]){
    int arr1[] = {1, 3,3,0,0,0};
    int arr2[] = {2, 5, 6};
    int m = 3; // Number of elements in arr1    
    int n = 3; // Number of elements in arr2
    int i = m - 1; // Index of last element in arr1 
    int j = n - 1; // Index of last element in arr2
    int k = m+n-1; // Index of last position in arr1 after merge
    while(i>=0 && j>=0){
        if(arr1[i]>arr2[j]){
            arr1[k] = arr1[i];
            i--; k--;
        }else{
            arr1[k] = arr2[j];
            j--; k--;
        }
    }
    while(j>=0){
        arr1[k] = arr2[j];
        j--; k--;
    }
    System.out.println("Merged array:");
    for(int l=0; l<arr1.length; l++){
        System.out.print(arr1[l] + " ");
    }
}
}