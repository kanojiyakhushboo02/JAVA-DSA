public class Palindrome {

    public static boolean isPalindrome(String str){
       

        // char[] arr = str.toCharArray();

        int start = 0;
        int end = str.length()-1;

        while(start<end){
        if(start < end && Character.isLetterOrDigit(str.charAt(start))){
            start++;
        }

        if(start < end && Character.isLetterOrDigit(str.charAt(end))){
            end--;
        }

        if(str.toLowerCase().charAt(start) != str.toLowerCase().charAt(end)){
           return false;
            
        } 

        start++;
        end--;
    }
    return true;
    }
    
    public static void main(String args[]){
        String str = "madagfdm";

        boolean result = isPalindrome(str);

        if(result){
            System.out.println("Is Palindrome");
        }else{
            System.out.println("Is Not A Palindrome");
        }
       
    }
}
