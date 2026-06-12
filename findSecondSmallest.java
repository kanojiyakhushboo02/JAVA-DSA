public class findSecondSmallest {
    public static void findSecSmall(int arr[], int smaller, int secondSmaller){
        for(int i=0; i<arr.length; i++){
            if(arr[i]<smaller){
                secondSmaller = smaller;
                smaller = arr[i];
            }
            int index = i;
            if(arr[i]<secondSmaller && i != index){
                secondSmaller = arr[i];
            }
        }
        System.out.println("The second smallest element in the array is: "+secondSmaller);
    }

    public static void main(String args[]){
        int arr[]={1,2,21,4,5,6,7,8,9,1,16,3,15,20,0};
        int smaller = Integer.MAX_VALUE;
        int secondSmaller = Integer.MAX_VALUE;
        findSecSmall(arr, smaller, secondSmaller);
    }
}
