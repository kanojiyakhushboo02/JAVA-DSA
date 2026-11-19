public class ReverseString2 {

    public static String reverseString(String str, int k) {

        StringBuilder reversed = new StringBuilder(str);

        for (int i = 0; i < reversed.length(); i += 2 * k) {

            int left = i;
            int right = Math.min(i + k - 1, reversed.length() - 1);

            while (left < right) {

                char temp = reversed.charAt(left);

                reversed.setCharAt(left, reversed.charAt(right));
                reversed.setCharAt(right, temp);

                left++;
                right--;
            }
        }

        return reversed.toString();
    }

    public static void main(String args[]) {

        String str = "hkusbhoo";
        int k = 2;

        String result = reverseString(str, k);

        System.out.println("Reversed string: " + result);
    }
}