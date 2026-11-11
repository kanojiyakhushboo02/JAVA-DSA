import java.util.Arrays;

public class ShortestDtoaChar {

    public int[] shortestToChar(String s, char c) {

        int n = s.length();
        int[] ans = new int[n];

        // First pass: Left to Right
        int prev = -10000;

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == c) {
                prev = i;
            }

            ans[i] = i - prev;
        }

        // Second pass: Right to Left
        int next = 10000;

        for (int i = n - 1; i >= 0; i--) {

            if (s.charAt(i) == c) {
                next = i;
            }

            ans[i] = Math.min(ans[i], next - i);
        }

        return ans;
    }

    public static void main(String[] args) {

        ShortestDtoaChar obj = new ShortestDtoaChar();

        String s = "loveleetcode";
        char c = 'e';

        int[] result = obj.shortestToChar(s, c);

        System.out.println("Shortest distances: " + Arrays.toString(result));
    }
}