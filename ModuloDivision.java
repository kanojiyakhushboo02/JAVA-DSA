import java.util.Scanner;
public class ModuloDivision {

    public static int moduloDivision(int a, int b) {
        return a % b;
    }

    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the key: ");
      int a = scanner.nextInt();
      System.out.print("Enter table size: ");
      int b = scanner.nextInt();

        int result = moduloDivision(a, b);

        System.out.println("Result of " + a + " % " + b + " = " + result);
    }
}