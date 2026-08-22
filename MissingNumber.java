public class MissingNumber{

    public static void main(String args[]){
        int nums[] = {3, 0, 1};
        int xor = nums.length;
        for(int i=0; i<nums.length; i++){
            xor = xor ^ i ^ nums[i];
        }
        System.out.println(xor);

    }
}