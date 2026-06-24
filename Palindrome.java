public class Palindrome {
    
    public static void main(String args[]){
        String str = "madam";

        char[] arr = str.toCharArray();

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            if(arr[start]!=arr[end]){
                System.out.println("Not a palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Is a palindrome");
        return;
    }
}
