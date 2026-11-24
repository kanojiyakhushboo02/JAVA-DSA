import java.util.*;

public class DigitExtraction {

    public static void main(String[] args) {

        int size = 100;

        int[] hashTable = new int[size];

        Arrays.fill(hashTable, -1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Key: ");
        int key = sc.nextInt();
        

        // Extract selected digits
        int digit1 = (key / 10) % 10;
        int digit2 = (key / 1000) % 10;
        int digit3 = (key / 100000) % 10;

        // Combine selected digits
        int hashValue = digit1 * 100 + digit2 * 10 + digit3;

        // Calculate hash index
        int index = hashValue % size;

        // Store key
        hashTable[index] = key;

        System.out.println("Original Key: " + key);
        System.out.println("Extracted Hash Value: " + hashValue);
        System.out.println("Hash Index: " + index);
        System.out.println("Stored Value: " + hashTable[index]);
    }
}