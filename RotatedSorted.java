public class RotatedSorted {
    

    public static int SearchRotatedSorted (int arr[],int n, int start,int end,int target){
            
        while(start <= end){
            int mid = start + (end - start) / 2;    
        if(arr[mid] == target){
            return mid ;
        }
        //left half sorted
        if(arr[start]<=arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
            //right half sorted 
        }else{
            if(target >= arr[mid] && target <= arr[end]){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
    }
        return -1;
    }

    public static void  main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int n = arr.length;
       int  start = 0;
        int end = n -1 ;
        int target = 21;

        int result = SearchRotatedSorted(arr, n, start, end, target);

if(result == -1){
    System.out.println("Element not found");
}else{
    System.out.println("Element found at index: " + result);
}

    
    }
}