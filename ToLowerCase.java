public class ToLowerCase {
    public static String tolowerCase(String s){

        StringBuilder st = new StringBuilder(s);
        for(int i=0; i<st.length();i++){
            if(st.charAt(i)>='A' && st.charAt(i)<='Z'){
                st.setCharAt(i,(char)(st.charAt(i)+32));
            }
        }
        return st.toString();
    }
    public static void main(String args[]){
        String s = "kanOjiYa";
        System.out.println(tolowerCase(s));
    }
}
