import java.util.*;


public class Anagram {
    

    public static void main(String args[]){
        String str1 = "listen";
        String str2 = "silent";

        if(str1.length() != str2.length()){
            System.out.println("Not an anagram");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();   

        Arrays.sort(arr1);
        Arrays.sort(arr2);  

        if(arr1.length != arr2.length){
            System.out.println("Not an anagram");
            return;
        }
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Is an anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }
}
