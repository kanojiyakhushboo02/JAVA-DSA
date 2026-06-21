public class MoveZero {
    public static void moveZeroes(int[] nums){
        int n= nums.length;
        int j=0;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
;            }
        }

        while(j<n){
            nums[j] = 0;
            j++;
        }

    }
    public static void main(String args[]){
        int arr[] = {0,1,0,3,12};
        moveZeroes(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
    }
}
