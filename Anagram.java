// import java.util.*;


public class Anagram {

    public static boolean isAnagram(String str1, String str2){
        str1 =  str1.toLowerCase();
        str2 =  str2.toLowerCase();

       str1 = str1.replace(" ", "");
       str2 = str2.replace(" ", "");

       int count[ ] = new int[26];
       //fill
       for(int i=0; i<str1.length(); i++){
            count[str1.charAt(i) - 'a']++;
       }
       //empty
       for(int i=0; i<str2.length(); i++){
            count[str2.charAt(i) - 'a']--;
       }
       //check
       for(int i=0; i<26; i++){
            if(count[i] != 0){
                return false;
            }
       }
       return true;
    }

    public static void main(String args[]){
        String str1 = "listen";
        String str2 = "silekndncnt";

        boolean result = isAnagram(str1, str2);

        if(result){
            System.out.println("Is Anagram");
        }else{
            System.out.println("Is Not An Anagram");
        }
    }
}
