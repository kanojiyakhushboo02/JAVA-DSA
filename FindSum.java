public class FindSum{

    public static void findSum(int arr[],int sum){
        for(int i=0; i<arr.length; i++){
             sum += arr[i];
        }
        System.out.println(sum);
    }


    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int sum =0;
        findSum(arr,sum);
    }
}