public class CountElm {
    
    public static void main(String args[]){
            int arr[] = {2,4,6,8,10,2,6,6};
            int Num = 6;
            int count = 0;
    
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == Num) {
                    count++;
                }
            }
    
            System.out.println(count);
    }
}
