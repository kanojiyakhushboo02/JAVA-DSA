public class MaxSubArray {

//    public static int maxSubArray(int nums[]) {

//     int maxSum = Integer.MIN_VALUE;

//     for(int i = 0; i < nums.length; i++) {

//         int currentSum = 0;

//         for(int j = i; j < nums.length; j++) {

//             currentSum += nums[j];

//             maxSum = Math.max(maxSum, currentSum);
//         }
//     }

//     return maxSum;
// }


//Kadanes Algorithm 
public static int maxSubArray(int nums[]) {
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;
    
   for(int i=0; i<nums.length; i++){
    currentSum += nums[i];
    maxSum = Math.max(maxSum, currentSum);
    if(currentSum < 0){
        currentSum = 0;
    }   
   }
   return maxSum;
}
    
    public static void main(String args[]){
        
        // int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int arr[] = {1,2,3,4,5};
        int result = maxSubArray(arr);  
        System.out.println("The maximum subarray sum is: " + result);
    }
}
