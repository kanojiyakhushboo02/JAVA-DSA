public class RemoveDuplicate {
    

    public static void main(String args[]){
        int[] arr = {1, 2, 2, 3, 4, 4, 5,6,7,8,8};
        int n = arr.length;
        int[] uniqueArr = new int[n];
        int j = 0;
        for(int i=0; i<arr.length; i++){
           if(i == 0 || arr[i] != arr[i-1]){
                uniqueArr[j] = arr[i];
                j++;
            }
        }
        // Print the unique elements
        System.out.println("Array after removing duplicates:");
        for(int i=0; i<j; i++){
            System.out.print(uniqueArr[i] + " ");
        }
    }
}
