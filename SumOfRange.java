public class SumOfRange {
    
    public static void main(String args[]){
        int arr[] = {1,2,3};
        int ans =0;
        for(int i =0; i<arr.length; i++){
            int minv = arr[i];
            int maxv = arr[i];
            for(int j = i; j<arr.length; j++){
                minv = Math.min(minv, arr[j]);
                maxv = Math.max(maxv, arr[j]);
                ans += (maxv - minv);
            }
        
        }
        System.out.println(ans);
    }
}
